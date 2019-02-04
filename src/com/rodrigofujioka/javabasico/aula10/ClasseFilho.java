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

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 2 de jun de 2016
 * @Time: 20:44:15
 */
public class ClasseFilho extends ClassePai{

	public int variavelSuper = 1;
	private int variavelSuperPrivada = 5;
	
	public ClasseFilho(){
		System.out.println();
	}
	
	public ClasseFilho(String nomeFilho){
		super("Rodrigo Fujioka");
		System.out.println("Classe Filho");
		
	}
	
	public void bateNoFilho(int nivelSurra){
	 if(nivelSurra >8){
		 entregaIrmao();
	 }else{
		 System.out.println("Apanha sozinho");
	 }
	 
	 System.out.println(super.variavelSuper);
	 System.out.println(variavelSuperPrivada);
	 System.out.println(super.getVariavelSuperPrivada());
	}
	
	public void entregaIrmao(){
		System.out.println("Irmão também leva Surra");
	}

	
}



