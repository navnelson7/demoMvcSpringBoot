package com.navnelson7.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DemoController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/login")
	public String login() {
		return "loginForm";
	}
	@PostMapping("/login")
	public String loginForm(Model modelo, Usuario usuario) {
		String resultado ="";
		if(usuario.getUsuario().isEmpty() || usuario.getPassword().isEmpty()) {
			resultado = "Campos estan vacios";
		}else {
			resultado = "Yea puedes entrar";
		}
		modelo.addAttribute("resultado",resultado);
		return "menu";
	}
}
