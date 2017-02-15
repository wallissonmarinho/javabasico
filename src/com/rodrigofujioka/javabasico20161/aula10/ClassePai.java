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
package com.rodrigofujioka.javabasico20161.aula10;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 2 de jun de 2016
 * @Time: 20:43:33
 */
public class ClassePai {
	
	public int variavelSuper = 55;
	private int variavelSuperPrivada = 40;
	
	public ClassePai(){
		System.out.println("Construtor Vazio");	
	}
	
	public ClassePai(String nomePai){
		this();
		System.out.println(nomePai);
	}
	
	public void bateNoFilho(int nivelSurra){
	
	}
	
	public void bateNoFilho(int nivelSurra, String equipamento){
		
	}

	/**
	 * @return the variavelSuper
	 */
	public int getVariavelSuper() {
		return variavelSuper;
	}

	/**
	 * @param variavelSuper the variavelSuper to set
	 */
	public void setVariavelSuper(int variavelSuper) {
		this.variavelSuper = variavelSuper;
	}

	/**
	 * @return the variavelSuperPrivada
	 */
	public int getVariavelSuperPrivada() {
		return variavelSuperPrivada;
	}

	/**
	 * @param variavelSuperPrivada the variavelSuperPrivada to set
	 */
	public void setVariavelSuperPrivada(int variavelSuperPrivada) {
		this.variavelSuperPrivada = variavelSuperPrivada;
	}

	
}





