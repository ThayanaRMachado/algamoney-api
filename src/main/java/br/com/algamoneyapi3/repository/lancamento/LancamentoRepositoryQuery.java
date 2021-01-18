package br.com.algamoneyapi3.repository.lancamento;

import java.util.List;

import br.com.algamoneyapi3.model.Lancamento;
import br.com.algamoneyapi3.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
	
}
