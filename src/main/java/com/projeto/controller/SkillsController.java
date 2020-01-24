package com.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SkillsController {

	@RequestMapping("/skills")
	public String skills() {
		return "skills";
	}
}
