package com.sample.product.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.product.dto.ProductDTO;
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

	@PostMapping("/form")
	public String doRegist(ProductDTO product) {
		System.out.println("check input : " + product);
		try {
			service.addProduct(product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:list";
	}

	@GetMapping("/list")
	public String showList(Model model) {
		try {
			List<ProductDTO> products = service.showList();
			System.out.println("check products : " + products);
			model.addAttribute("products", products);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "list";
	}

	@RequestMapping("/error/404")
	public String showError404() {
		return "error/404";
	}

	@RequestMapping("/error/errorpage")
	public String showError500() {
		return "error/errorpage";
	}

}
