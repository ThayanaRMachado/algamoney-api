package br.com.algamoneyapi3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.algamoneyapi3.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
