package com.proj.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@PostMapping
 public ModelAndView validate(@RequestParam("uname") String name,@RequestParam("psw") String password)
 {
		ModelAndView mv=new ModelAndView("home");
	 if(name.equals("niit")&& password.equals("niit"))
	 {
		 mv.addObject("username", name);
	 }
	 else {
		 mv.addObject("error","invalid credentials");
	 }
	 return mv;
 }
}
