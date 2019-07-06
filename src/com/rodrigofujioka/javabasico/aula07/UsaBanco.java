package com.rodrigofujioka.javabasico.aula07;

import java.util.Scanner;

public class UsaBanco {

	public static void main(String[] args) {
		
		Banco caixaEpitacio = new Banco();
		Banco caixaPraia = new Banco();
		Banco caixaCentro = new Banco();
		
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		while(true) {
			
			System.out.println("Informe o banco a ser utilizado");
			System.out.println("1 - Epitácio");
			System.out.println("2 - Praia");
			System.out.println("3 - Centro");
			System.out.println("99 - Sair");
			opcao = leitor.nextInt();
			
			System.out.println("Informe o valor");
			float valor = leitor.nextFloat();
			
			System.out.println("Informe os meses");
			int meses = leitor.nextInt();
			
			
			switch (opcao) {
			case 1:
				caixaEpitacio.calcularJuros(valor, meses);				
				caixaEpitacio.alterarJuros(2.0f);
				break;
				
			case 2:
				caixaPraia.calcularJuros(valor, meses);				
				caixaPraia.alterarJuros(3.0f);
				break;
				
			case 3:
				caixaCentro.calcularJuros(valor, meses);				
				caixaCentro.alterarJuros(5.0f);
				break;				

			default:
				break;
			}
			
			
			
		}
		
		

	}

}
