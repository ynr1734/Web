package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MbtiController { 

	
	@RequestMapping("/mbti")
	public String mbti(Model m) {
		m.addAttribute("center","mbti/center");
		m.addAttribute("left","left");
		return "main";
	}
	@RequestMapping("/synopsis")
	public String synopsis(Model m) {
		m.addAttribute("center","mbti/synopsis");
		m.addAttribute("left","left");
		return "main";
	}
	@RequestMapping("/test")
	public String test(Model m) {
		m.addAttribute("center","mbti/test");
		m.addAttribute("left","left");
		return "main";
	}
	@RequestMapping("/result")
	public String result(Model m) {
		m.addAttribute("center","mbti/result");
		m.addAttribute("left","left");
		return "main";
	}
	@RequestMapping("/information")
	public String information(Model m) {
		m.addAttribute("center","mbti/information");
		m.addAttribute("left","left");
		return "main";
	}
	@RequestMapping("/contact")
	public String contact(Model m) {
		m.addAttribute("center","mbti/contact");
		m.addAttribute("left","left");
		return "main";
	}
}
