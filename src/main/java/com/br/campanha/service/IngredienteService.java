package com.br.campanha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.campanha.model.Ingrediente;
import com.br.campanha.repository.IngredienteRepository;

@Service
public class IngredienteService {
	
	@Autowired
	private IngredienteRepository ingredienteRepository;

	public List<Ingrediente> findIngredientes() {
		return this.ingredienteRepository.findAll();
	}
}
