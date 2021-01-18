package br.com.algamoneyapi3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.algamoneyapi3.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
