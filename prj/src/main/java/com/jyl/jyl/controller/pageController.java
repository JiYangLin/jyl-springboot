package com.jyl.jyl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
	@RequestMapping("/")
	public String index(ModelMap map) {
		map.addAttribute("abc", "吃饭睡觉");
		// src/main/resources/templates/index.html
		return "index";
	}
}
