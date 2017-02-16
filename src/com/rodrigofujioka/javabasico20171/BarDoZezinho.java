/**
 * Projeto das trilhas de treinamento de Java básico ou avançado 
 * com foco nas certificações java e em treinamentos corporativos. 
 * Fontes disponíveis em https://github.com/rodrigofujioka
 * 
 * Professor: Rodrigo da Cruz Fujioka
 * Ano: 2017
 * http://www.rodrigofujioka.com
 * http://www.fujideia.com.br
 * http://lattes.cnpq.br/0843668802633139
 * 
 * Contato: rcf4@cin.ufpe.br 
 * 
 */
package com.rodrigofujioka.javabasico20171;

import java.util.Scanner;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 15 de fev de 2017
 * @Time: 21:32:17
 */
public class BarDoZezinho {
	
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int cervejas = leitor.nextInt();
		
		while(cervejas > 0){
			
			System.out.println(cervejas + " Cervejas na freezer");		
			System.out.println("Pega 1 garrafa e passa para frente");
			cervejas = cervejas - 1;
			System.out.println("Agora são " + cervejas + " na Freezer");
			
			if(cervejas == 0){
				System.out.println("Cerveja acabou");
				System.out.println("Quantas cervejas deseja adicionar?");
				cervejas = leitor.nextInt();
				System.out.println(cervejas + " Adicionadas");
			}
			
		}
		
		
	}
	

}






