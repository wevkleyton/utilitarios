package br.com.utilitarios.services;

import java.util.logging.Logger; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.utilitarios.model.ArquivoBackup;

@Service
public class ArquivosServices {

	private Logger logger = Logger.getLogger(ArquivosServices.class.getName());
	
	@Autowired
	ArquivoRepository repository;
	
	public ArquivoBackup create(ArquivoBackup arquivo) {
		logger.info("Arquivos Criado no DB!");
		return repository.save(arquivo);
	}
	
	public void delete(Long id) {
		logger.info("Deletando Referencia de Arquivo!");
		var entity = repository.findById(id).orElseThrow(() -> new RuntimeException("Problema ao deletar Referencia do arquivo!"));
		repository.delete(entity);
	}
	
	public ArquivoBackup findById(Long id) {
		logger.info("Pesquisando Arquivo!");
		return repository.findById(id).orElseThrow(() -> new RuntimeException("Erro nas Pesquisa!"));
	}
}
