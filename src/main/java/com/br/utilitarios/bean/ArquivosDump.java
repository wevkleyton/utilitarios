package com.br.utilitarios.bean;

public class ArquivosDump {

	private String nome;
	private String data;
	private String hora;
	private Integer id;

	public ArquivosDump() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArquivosDump(String nome, String data, String hora, Integer id) {
		super();
		this.nome = nome;
		this.data = data;
		this.hora = hora;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
