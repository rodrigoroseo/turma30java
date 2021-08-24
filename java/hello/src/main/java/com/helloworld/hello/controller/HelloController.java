package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "<h3>Mentalidade:</h3> <li>Persistência</li><h3>Habilidade:</h3> <li>Atenção aos detalhes</li>";
	}
	@GetMapping("/bye")
	public String sayBye() {
		return "<h3>Objetivos de aprendizagem:</h3><ul> <li>Aprender Spring</li> <li>Treinar minha gestão de tempo</li> </ul>";
	}
}
