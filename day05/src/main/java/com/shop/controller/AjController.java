package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AjController {
	@RequestMapping("/ajax")
	public String ajax(Model m) {
		m.addAttribute("center","ajax/center");
		m.addAttribute("left","ajax/left");
		return "main";
	}

	@RequestMapping("/register_formimpl")
	public String register_formimpl(Model m, String id, String pwd) {
		System.out.println(id+" "+pwd);
		m.addAttribute("center", "ajax/registerok");
		m.addAttribute("left", "ajax/left");
		m.addAttribute("rid", id);
		return "main";
	}
	
	@RequestMapping("/register_formimplws")
	public String register_formimplws(Model m, String id, String pwd, 
			String gen, String mailid, String sel) {
		System.out.println(id+" "+pwd+" "+gen+" "+mailid+" "+sel);
		m.addAttribute("center", "ajax/registerok");
		m.addAttribute("left", "ajax/left");
		m.addAttribute("rid", id);
		return "main";
	}
	
	@RequestMapping("/aj01")
	public String aj01(Model m) {
		m.addAttribute("center","ajax/aj01");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj02")
	public String aj02(Model m) {
		m.addAttribute("center","ajax/aj02");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj03")
	public String aj03(Model m) {
		m.addAttribute("center","ajax/aj03");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj04")
	public String aj04(Model m) {
		m.addAttribute("center","ajax/aj04");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj05")
	public String aj05(Model m) {
		m.addAttribute("center","ajax/aj05");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj06")
	public String aj06(Model m) {
		m.addAttribute("center","ajax/aj06");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj07")
	public String aj07(Model m) {
		m.addAttribute("center","ajax/aj07");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj08")
	public String aj08(Model m) {
		m.addAttribute("center","ajax/aj08");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj09")
	public String aj09(Model m) {
		m.addAttribute("center","ajax/aj09");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj10")
	public String aj10(Model m) {
		m.addAttribute("center","ajax/aj10");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	
}
