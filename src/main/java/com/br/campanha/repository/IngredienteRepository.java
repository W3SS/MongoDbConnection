package com.br.campanha.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.campanha.model.Ingrediente;

public interface IngredienteRepository extends MongoRepository<Ingrediente, String>{

}
