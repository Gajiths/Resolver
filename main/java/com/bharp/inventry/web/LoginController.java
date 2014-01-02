package com.bharp.inventry.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bharp.inventry.domain.User;
import com.bharp.inventry.service.UserLoginService;
import com.bharp.inventry.service.impl.UserLoginServiceImpl;

@Controller


public class LoginController {
	@Autowired 
	@Qualifier("userLoginService")
	private UserLoginService userLoginService;
	
	
	@RequestMapping(value={"/","index"},method = RequestMethod.GET)
	
	public String printHello(ModelMap model){
		
		return "index";
	}
	
	
	@RequestMapping(value="login",method = RequestMethod.POST)
	//@Secured ({"manager", "admin"})
	public String Checklogin(@RequestParam("username") String username,@RequestParam("password") String password,ModelMap model){
		
			try {
				if(userLoginService.userIsExists(username)){
					model.addAttribute("massege","Welcome to Spring Security");
					return "success";
				}else{
					model.addAttribute("error", "Username or Password Incorrect"); 
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
			}
			return "index";
		
		
	}
	@RequestMapping(value="logout",method = RequestMethod.GET)
	public String logout(ModelMap model){
		return "index";
	}
	
	@RequestMapping(value="register",method = RequestMethod.GET)
	public String register(ModelMap model){
		return "user_sign_up";
	}
	
	@RequestMapping(value="signup",method = RequestMethod.POST)
	public String signup(@RequestParam("fname") String fname,@RequestParam("lname") String lname,@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("email") String email,ModelMap model){
		
		User newUser=new User();
		newUser.setUsername(username);
		newUser.setPassword(password);
		newUser.setFirstName(fname);
		newUser.setLastName(lname);
		newUser.setEmail(email);
		try {
			userLoginService.createUser(newUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		model.addAttribute("registered", "Thank you  for register our application"); 
		return "user_sign_up";
	}
	
	@RequestMapping(value="resolver",method = RequestMethod.GET)
	public String ResolveFront(ModelMap model){
		return "app_front";
	}
	
	
}
