package com.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjetoController {
	
	@RequestMapping("/projeto")
	public String projeto() {
		return "projeto";
	}
}
