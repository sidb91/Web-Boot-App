package com.in28minutes.springboot.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String helloForm() {
		return "helloForm";
	}
	
	@RequestMapping(value="/hello", method = RequestMethod.POST)
	public String hello(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("name");
		
		if(name == null || name.equals("")) {
			name = "World";
		}
		model.addAttribute("name",name);
		model.addAttribute("title","Spring Hello Controller Response");
		
		return "hello";
		
	}
}
