package com.jinternals.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	String home(ModelMap modal) {
		modal.addAttribute("title", "Spring boot s2i demo");
		modal.addAttribute("message", "oc new-app jinternals01/spring-boot-s2i:latest~https://github.com/jinternals/spring-boot-s2i-demo.git");
		return "hello";
	}
}
