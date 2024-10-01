package br.com.utilitarios.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.utilitarios.constantes.ConstantesDiretorioArquivos;
import br.com.utilitarios.model.ArquivoBackup;

public class ArquivosController {

	public ArquivosController() throws IOException {
		ArquivoBackup idArq = new ArquivoBackup();
		File file = new File(ConstantesDiretorioArquivos.DIRETORIO);
		File lFile[] = file.listFiles();
		Map<String, String> bkp = new HashMap<>();
		String id, data;
		int count = 0;
//		List<String> lista = new ArrayList<>();
		List<ArquivoBackup> arquivoBkps = new ArrayList<>();

		for (File arquivos : lFile) {
			if (arquivos.isFile() && arquivos.getName().endsWith(".zst")) {
				if (arquivos.getName().substring(12, 16).contains("-")) {
					id = arquivos.getName().substring(12, 15);
					data = arquivos.getName().substring(16, 26);
					bkp.put(id, data);
				} else {
					id = arquivos.getName().substring(12, 16);
					data = arquivos.getName().substring(17, 27);
					bkp.put(id, data);
				}

				for (Map.Entry<String, String> arq : bkp.entrySet()) {
					ArquivoBackup arqbkp = new ArquivoBackup();
					arqbkp.setIdArq(Integer.valueOf(arq.getKey()));
					arqbkp.setDataArq(arq.getValue());

					arquivoBkps.add(arqbkp);

				}
			}

		}
//		System.out.println(arquivoBkps.toString());
	}

}
