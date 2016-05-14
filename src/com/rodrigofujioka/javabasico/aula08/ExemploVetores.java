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
package com.rodrigofujioka.javabasico.aula08;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 27 de abr de 2016
 * @Time: 21:11:25
 */
public class ExemploVetores {
	
	
	public static void main(String[] args) {
		
		
		int[] vetorInteiro = new int[5];
		
		double[] top = new double[10];
		
		float[] top2 = new float[4];
				
		float[] top3 = {1.4f,4.5f};		
		
		int x;
		
		String[] vetorString = {"Rodrigo","Férias"};
				
		vetorInteiro[0] = 7;
		vetorInteiro[1] = 9;
		vetorInteiro[2] = 10;
		vetorInteiro[3] = 12;
		
		
		int[] vetores = {7,9,10,12}; 
				
		for(int i =0; i<4;i++){
			System.out.println(vetores[i]);
		}
		 		
		
	}
	
	
	

}
