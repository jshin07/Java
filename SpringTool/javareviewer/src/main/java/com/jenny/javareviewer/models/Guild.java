package com.jenny.javareviewer.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="guilds")
public class Guild {
	@Id
	@GeneratedValue
	private Long id;
	
	@Size(min=1)
	private String guildName;
	
	private int guildSize;
	
	@DateTimeFormat(pattern="MM/dd/yyyy HH:mm:ss")
	private Date createdAt;
	
	@DateTimeFormat(pattern="MM/dd/yyyy HH:mm:ss")
	private Date updatedAt;
	
	@PrePersist
	protected void onCreated(){
		this.createdAt= new Date();
	}
	
	@PreUpdate
	protected void onUpdated(){
		this.updatedAt= new Date();
	}
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name ="user_guilds",
			joinColumns =@JoinColumn(name= "guild_id"),
			inverseJoinColumns = @JoinColumn(name= "user_id"))
	private List<User> users;
	
	public Guild(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGuildName() {
		return guildName;
	}

	public void setGuildName(String guildName) {
		this.guildName = guildName;
	}

	public int getGuildSize() {
		return guildSize;
	}

	public void setGuildSize(int guildSize) {
		this.guildSize = guildSize;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
}
