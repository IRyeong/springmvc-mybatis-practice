package com.sample.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sample.product.model.service.ProductService;

@Controller
public class ProductController {

	ProductService service;

	public ProductController(ProductService service) {
		this.service = service;
	}

	@GetMapping({ "/", "/index" })
	public String showIndex() {
		return "index";
	}

}
