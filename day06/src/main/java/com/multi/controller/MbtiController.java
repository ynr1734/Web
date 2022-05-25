package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MbtiController { 

	@RequestMapping("/enfj")
	public String enfj(Model m) {
		m.addAttribute("center","mbti/enfj");
		m.addAttribute("left","left");
		return "main";
	}

	@RequestMapping("/enfp")
	public String enfp(Model m) {
		m.addAttribute("center","mbti/enfp");
		m.addAttribute("left","left");
		return "main";
	}

	@RequestMapping("/entj")
	public String entj(Model m) {
		m.addAttribute("center","mbti/entj");
		m.addAttribute("left","left");
		return "main";
	}
	
	@RequestMapping("/entp")
	public String entp(Model m) {
		m.addAttribute("center","mbti/entp");
		m.addAttribute("left","left");
		return "main";
	}
	
	@RequestMapping("/esfj")
	public String esfj(Model m) {
		m.addAttribute("center","mbti/esfj");
		m.addAttribute("left","left");
		return "main";
	}
	
	@RequestMapping("/esfp")
	public String esfp(Model m) {
		m.addAttribute("center","mbti/esfp");
		m.addAttribute("left","left");
		return "main";
	}
	
	@RequestMapping("/estj")
	public String estj(Model m) {
		m.addAttribute("center","mbti/estj");
		m.addAttribute("left","left");
		return "main";
	}
	
	@RequestMapping("/estp")
	public String estp(Model m) {
		m.addAttribute("center","mbti/estp");
		m.addAttribute("left","left");
		return "main";
	}

	@RequestMapping("/infj")
	public String infj(Model m) {
		m.addAttribute("center","mbti/infj");
		m.addAttribute("left","left");
		return "main";
	}

	@RequestMapping("/infp")
	public String infp(Model m) {
		m.addAttribute("center","mbti/infp");
		m.addAttribute("left","left");
		return "main";
	}

	@RequestMapping("/intj")
	public String intj(Model m) {
		m.addAttribute("center","mbti/intj");
		m.addAttribute("left","left");
		return "main";
	}
	
	@RequestMapping("/intp")
	public String intp(Model m) {
		m.addAttribute("center","mbti/intp");
		m.addAttribute("left","left");
		return "main";
	}
	
	@RequestMapping("/isfj")
	public String isfj(Model m) {
		m.addAttribute("center","mbti/isfj");
		m.addAttribute("left","left");
		return "main";
	}

	@RequestMapping("/isfp")
	public String isfp(Model m) {
		m.addAttribute("center","mbti/isfp");
		m.addAttribute("left","left");
		return "main";
	}

	@RequestMapping("/istj")
	public String istj(Model m) {
		m.addAttribute("center","mbti/istj");
		m.addAttribute("left","left");
		return "main";
	}

	@RequestMapping("/istp")
	public String istp(Model m) {
		m.addAttribute("center","mbti/istp");
		m.addAttribute("left","left");
		return "main";
	}

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
	@RequestMapping("/location")
	public String location(Model m) {
		m.addAttribute("center","mbti/location");
		m.addAttribute("left","left");
		return "main";
	}
}
