package com.jenny.loginreg.controllers;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jenny.loginreg.models.User;
import com.jenny.loginreg.services.UserService;
import com.jenny.loginreg.validator.UserValidator;

@Controller
public class UserController {
	private UserService userService;
	private UserValidator userValidator;
	
	public UserController(UserService userService, UserValidator userValidator){
		this.userService= userService;
		this.userValidator = userValidator;
	}
	
	@RequestMapping(value= {"/login", "/register"})
	public String logReg(@Valid @ModelAttribute("user")User user, @RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout,  Model model){
		if(error != null) {
            model.addAttribute("errorMessage", "Invalid Credentials.");
        }
        if(logout != null) {
            model.addAttribute("logoutMessage", "Logout Successfull!");
        }
		return "logReg.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("user")User user, BindingResult result, Model model){
		userValidator.validate(user, result);
		if(result.hasErrors()){
			return "logReg.jsp";
		}
		userService.saveWithUserRole(user);
		return "redirect:/login";
		}
	
	@RequestMapping(value={"/", "/dashboard"})
	public String dashboard(Principal principal, Model model){
		String email= principal.getName();
		User user= userService.findByEmail(email);
		userService.update(user);
		model.addAttribute("currentUser", user);
		return "dashboard.jsp";
	}
	
		
}
	
	

