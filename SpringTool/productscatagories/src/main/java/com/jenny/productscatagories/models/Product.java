package com.jenny.productscatagories.models;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="products")
public class Product {
	  	@Id
	    @GeneratedValue
	    private Long id;
	  	
	  	@Size(min=1, message="Product Name cannot be empty")
	    private String name;
	  	
	  	@Size(min=1, message="Description cannot be empty")
	    private String description;
	  	
	    private float price;
	    
	    @DateTimeFormat(pattern="MM/dd/yyyy")
	    private Date createdAt;
	    
	    @DateTimeFormat(pattern="MM/dd/yyyy")
	    private Date updatedAt;
	    
	    @PrePersist
		protected void onCreated(){
			this.createdAt = new Date();
		}
		
		@PreUpdate
		protected void onUpdated(){
			this.updatedAt = new Date();
		}	    
	    
	    @ManyToMany(fetch = FetchType.LAZY)
	    @JoinTable(
	      name = "categories_products", 
	      joinColumns = @JoinColumn(name = "product_id"), 
	      inverseJoinColumns = @JoinColumn(name = "category_id")
	    )
	    private List<Category> categories;
	    
	    public Product() {
	        
	    }
	    
	    public Product(String name, String description, float price) {
	        this.name = name;
	        this.description = description;
	        this.price = price;
	        this.createdAt = new Date();
	        this.updatedAt = new Date();    
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
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

		public List<Category> getCategories() {
			return categories;
		}

		public void setCategories(List<Category> categories) {
			this.categories = categories;
		}	
	

}
