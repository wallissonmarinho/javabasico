package com.rodrigofujioka.javabasico.aula12;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Carro fusca = new Carro();
		
		System.out.println("Informe o tipo de Ignição\n"
				+ " a - Botão\n"
				+ " b - Chave");		
		String tipo = leitor.nextLine();
		fusca.ignicao(tipo);		
		tipo = null;
		fusca.ignicao(tipo);				
		System.out.println("Encerrando programa");
		
	}
}
