package com.lt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lt.service.tpService;

@Controller
public class tpController {
	@Autowired
	tpService service;
	
	@RequestMapping("/getAll")
	public ModelAndView getAll() {
		return new ModelAndView("index.jsp").addObject("list", service.getAll());
	}
	
	@RequestMapping("/get")
	public ModelAndView get() {
		return new ModelAndView();
	}
}
