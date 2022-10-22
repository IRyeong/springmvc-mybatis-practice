package com.sample.product.controller;

import java.net.BindException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

public class ExceptionController {

	private static final Logger logger = LoggerFactory.getLogger(ExceptionController.class);
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception e) {
		logger.error("handling exception", e.getCause());
		e.printStackTrace();
		ModelAndView mnv = new ModelAndView();
		
		if (e instanceof BindException) {
			mnv.addObject("errmsg", "check parameters");
		}
		
		mnv.setViewName("/error/errorpage");
		return mnv;
	}

	public String handleException2(Exception e, Model model) {
		logger.error("handling exception", e.getCause());
		e.printStackTrace();
		
		if (e instanceof BindException) {
			model.addAttribute("errmsg", "check parameters");
		}
		
		return "/error/errorpage";
	}
}
