package com.br.campanha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.campanha.model.Ingrediente;
import com.br.campanha.service.IngredienteService;

@RestController
public class IngredienteController {
	
	@Autowired
	private IngredienteService ingredienteService;

	@RequestMapping(path = "/ingredientes", method = RequestMethod.GET)
	public ResponseEntity<List<Ingrediente>> findAll() {
		return new ResponseEntity<>(this.ingredienteService.findIngredientes(), HttpStatus.OK);
	}
}
