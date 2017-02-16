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
 * @Time: 21:05:46
 */
public class Condicoes {


	
	public static void main(String[] args) {
				
		Scanner leitor =  new Scanner(System.in);
		System.out.println("Informe um numero para ser testado");
		int z = leitor.nextInt();
		
		if(z==10){
			System.out.println("Z == 10");
		}else{
			System.out.println("Z != 10");
		}
		
		System.out.println("Isso é uma enrrolação");
		leitor.close();
	}
	
}
