package com.br.utilitarios.services;

import java.net.InetAddress;

import com.br.utilitarios.constantes.Servidores;

public class TestaConexao {

	public TestaConexao(String host) {
		try {
			InetAddress address = InetAddress.getByName(host);
			boolean reacheble = address.isReachable(10000);
			System.out.println(reacheble);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestaConexao teste = new TestaConexao(Servidores.TESTE_ERROR);
		
	}
}
