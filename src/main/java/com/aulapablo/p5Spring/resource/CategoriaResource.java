package com.aulapablo.p5Spring.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="Categoria")

public class CategoriaResource {
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
	return "Rest Testado!";
	}

}
