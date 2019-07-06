package com.rodrigofujioka.javabasico.aula11;

import java.util.Scanner;

public class LerArquivoV2 {
	
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o nome do arquivo");
		String nomeArquivo = leitor.nextLine();
		Vodka vodkaLeitura = 
				(Vodka)ArquivoSerializadoUtil.
				           lerArquivoSerializado(nomeArquivo);
		
		System.out.println(vodkaLeitura.getNome());
		
		leitor.close();
		
		
	}

}
