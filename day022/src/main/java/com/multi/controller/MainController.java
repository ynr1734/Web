package com.multi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

	@RequestMapping("/")
	public ModelAndView main(ModelAndView mv) {
		mv.addObject("w", "Welcome !!");
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/register_view")
	public String register_view(ModelAndView mv) {
		return "register.jsp";
	}
	
	@RequestMapping("/login_view")
	public ModelAndView login_view(ModelAndView mv) {
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(ModelAndView mv,
			String id, String pwd) {
		if(id.equals("qqq") && pwd.equals("111")) {
			mv.addObject("ii", id);
			mv.setViewName("loginok");
		}else {
			mv.setViewName("loginfail");
		}
		return mv;
	}
}



