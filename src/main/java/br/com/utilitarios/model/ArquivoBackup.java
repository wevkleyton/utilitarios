package br.com.utilitarios.model;

import java.io.Serializable;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "arquivo_backup")
public class ArquivoBackup implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="id_arquivo", nullable = false)
	private Integer idArq;
	@Column(name="dt_arquivo", nullable = false)
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
