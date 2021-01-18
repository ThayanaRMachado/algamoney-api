package br.com.algamoneyapi3.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.algamoneyapi3.model.Pessoa;
import br.com.algamoneyapi3.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa atualizar(Long codigo, Pessoa pessoa) {
		Pessoa pessoaSalva = this.pessoaRepository.findById(codigo)
				.orElseThrow(() -> new EmptyResultDataAccessException(1));
		
		BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");
		return pessoaRepository.save(pessoaSalva);
	}
}
