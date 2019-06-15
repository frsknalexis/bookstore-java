package com.dev.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.bookstore.util.Constantes;

@Controller
public class HomeController {

	@GetMapping("/")
	String indexView() {
		
		return Constantes.INDEX_VIEW;
	}
}
