package br.com.algamoneyapi3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.algamoneyapi3.model.Lancamento;
import br.com.algamoneyapi3.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

}
