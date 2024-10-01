package br.com.utilitarios.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.utilitarios.model.ArquivoBackup;

@Repository
public interface ArquivoRepository extends JpaRepository<ArquivoBackup, Long>{

}
