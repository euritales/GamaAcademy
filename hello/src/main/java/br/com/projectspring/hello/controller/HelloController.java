package br.com.projectspring.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // A anotação mostra ao SpringBoot que essa classe atende URLs, solicitações via web
public class HelloController {

	@GetMapping("/teste")
	public String digaOla() {
		return "Olá, mundo!!! Meu primeiro projeto springBoot! Agora vai <3";
	}
}
