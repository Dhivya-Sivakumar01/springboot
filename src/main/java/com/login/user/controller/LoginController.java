package com.login.user.controller;

import java.util.Map;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.login.user.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@Autowired
    private LoginService loginService;

	@GetMapping("/")
	public String index(Map<String, Object> model) {
		
		model.put("message", "Welcome to our Project portal");
		
		return "login";
	}

	@PostMapping("/login")
	public String doLogin(Map<String, Object> model, @RequestParam("username") String username, @RequestParam("password") String password) {
		
		if(loginService.isValidUser(username, password)){
			return "home";
		}else{
			model.put("message", "Welcome to our Project portal");
			model.put("errMsg", "Invalid Username/Password");
			return "login";
		}
		
		
	}

}

