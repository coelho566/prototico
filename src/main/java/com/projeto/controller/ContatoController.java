package com.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContatoController {
	
	@RequestMapping("/contato")
	public String contato() {
		return "contato";
	}
}
