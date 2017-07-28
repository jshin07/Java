package com.jenny.javabelt1.controllers;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jenny.javabelt1.models.Subscription;
import com.jenny.javabelt1.models.User;
import com.jenny.javabelt1.services.RoleService;
import com.jenny.javabelt1.services.SubscriptionService;
import com.jenny.javabelt1.services.UserService;
import com.jenny.javabelt1.validator.UserValidator;

@Controller
public class UserController {
	private UserService userService;
	private RoleService roleService;
	private SubscriptionService subscriptionService;
	private UserValidator userValidator;
	
	public UserController(UserService userService, RoleService roleService, SubscriptionService subscriptionService, UserValidator userValidator){
		this.userService= userService;
		this.roleService = roleService;
		this.subscriptionService= subscriptionService;
		this.userValidator = userValidator;
	}
	
// TO VIEW MAIN LOG IN AND REGISTRATION PAGE --LOGREG.JSP
	@RequestMapping()
	public String logReg(@Valid @ModelAttribute("user")User user, @RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout,  Model model){
		if(error != null) {
            model.addAttribute("errorMessage", "Invalid Credentials.");
        }
        if(logout != null) {
            model.addAttribute("logoutMessage", "Logout Successfull!");
        }
		return "logReg.jsp";
	}

// TO REGISTER NEW USER 
	@RequestMapping("/register")
	public String register(@Valid @ModelAttribute("user")User user, BindingResult result){
		userValidator.validate(user, result);		
		if(result.hasErrors()){
			return "logReg.jsp";
		}	
		if(roleService.findByName("ROLE_ADMIN").getUsers().size()<1){
			userService.saveWithAdminRole(user);	
			return "redirect:/selection";
		} else{
			userService.saveWithUserRole(user);	
			return "redirect:/selection";
		}	
		
	}
	
	
	@RequestMapping("/selection")
	public String selection(Principal principal, @ModelAttribute ("subscription") Subscription subscription, BindingResult result, Model model){
		model.addAttribute("subscriptions", subscriptionService.all());
		String email= principal.getName();
		User user= userService.findByEmail(email);
		model.addAttribute("currentUser", user);
		return "selection.jsp";
	}

	
// AFTER POSTMAPPING FROM LOGIN (BACK-END) TO DETERMIN ADMIN OR USER-- THEN REROUTE
	@RequestMapping(value={"/"})
	public String reroute(Principal principal, Model model){
		String email= principal.getName();
		User user= userService.findByEmail(email);

		userService.update(user);
		if (user.isAdmin()){
			return "redirect:/admin";
		} else {
			return "redirect:/profile";
		}
	}

	@RequestMapping("/admin")
	public String admin(Principal principal, Model model, @ModelAttribute("subscription") Subscription subscription){
		String email= principal.getName();
		User user= userService.findByEmail(email);
//		List<Subscription> subList= user.getSubscriptions();
		
		model.addAttribute("currentUser", user);
		model.addAttribute("allUsers", userService.all());
		model.addAttribute("subscriptions", subscriptionService.all());
		return "admin.jsp";
	}
	
	@RequestMapping("/profile")
	public String profile(Principal principal, Model model){
		String email= principal.getName();
		User user= userService.findByEmail(email);
		userService.update(user);
		model.addAttribute("subscription", user.getSubscriptions());
		model.addAttribute("currentUser", user);
		return "profile.jsp";
	}
	
	@PostMapping("/addPackage")
	public String addPackage(@ModelAttribute("subscription") Subscription subscription){
		subscriptionService.create(subscription);
		return "redirect:/admin";
	}
	
	
	@PostMapping("/signup/{id}")
	public String signup(@PathVariable("id") Long id,@ModelAttribute("subscription") Subscription subscription, BindingResult result){
		String subId= (String)result.getFieldValue("subId");
		Subscription itsSubscription= subscriptionService.findById(Long.parseLong(subId.trim()));
		
		User user= userService.findById(id);
		List<Subscription> list= user.getSubscriptions();
		list.add(itsSubscription);
		user.setSubscriptions(list);
		subscriptionService.create(itsSubscription);

		return "redirect:/profile";
	}

	@RequestMapping("/deactivate/{id}")
	public String deactivate(@ModelAttribute("subscription") Subscription subscription, @PathVariable ("id") Long id){
		boolean curStatus = subscriptionService.findById(id).isStatus();
		if(curStatus == true){
			curStatus = false;
		} else {
			curStatus = true;
		}
		return "reirect/admin";
	}
	
	
	
//	@RequestMapping("/delete/{id}")
//	public String delete(@PathVariable("id")Long id){
//		subscriptionService.delete(id);
//		return "redirect:/admin";
//	}
//	

	
}
