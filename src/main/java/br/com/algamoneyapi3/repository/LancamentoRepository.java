package br.com.algamoneyapi3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.algamoneyapi3.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
