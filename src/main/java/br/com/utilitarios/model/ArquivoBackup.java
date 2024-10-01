package br.com.utilitarios.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "arquivo_backup")
public class ArquivoBackup implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private Integer idArq;
	private String dataArq;

	public Integer getIdArq() {
		return idArq;
	}

	public void setIdArq(Integer idArq) {
		this.idArq = idArq;
	}

	public String getDataArq() {
		return dataArq;
	}

	public void setDataArq(String dataArq) {
		this.dataArq = dataArq;
	}

	@Override
	public String toString() {
		return "ArquivoBkp [idArq=" + idArq + ", dataArq=" + dataArq + "]";
	}
}
