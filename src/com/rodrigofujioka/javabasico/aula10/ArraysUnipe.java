/**
 * Projeto das trilhas de treinamento de Java básico ou avançado 
 * com foco nas certificações java e em treinamentos corporativos. 
 * Fontes disponíveis em https://github.com/rodrigofujioka
 * 
 * Professor: Rodrigo da Cruz Fujioka
 * Ano: 2016
 * http://www.rodrigofujioka.com
 * http://www.fujideia.com.br
 * http://lattes.cnpq.br/0843668802633139
 * 
 * Contato: rcf4@cin.ufpe.br 
 * 
 */
package com.rodrigofujioka.javabasico.aula10;

import java.util.Arrays;

import com.rodrigofujioka.javabasico.jogo.fifa.personagens.Juiz;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 1 de jun de 2016
 * @Time: 20:56:26
 */
public class ArraysUnipe {

	public static void main(String[] args) {
		
		int[] numeros = new int[9];
		int[] numerosDois = new int[9];
		Juiz[] listaJuiz = new Juiz[10];
		
		Arrays.fill(numeros, 45);
		Arrays.fill(numerosDois, 45);
		
		numerosDois[5]=9;
		numerosDois[7]=1;
		numerosDois[8]=3;
							
		Arrays.fill(listaJuiz, new Juiz());
		
		System.out.println(Arrays.equals(numeros, numerosDois));

		System.out.println(Arrays.toString(numeros));
		
		System.out.println(Arrays.toString(numerosDois));
		Arrays.sort(numerosDois);
		System.out.println(Arrays.toString(numerosDois));
		
	}

}










