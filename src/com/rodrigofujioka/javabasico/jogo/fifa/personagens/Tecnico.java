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
package com.rodrigofujioka.javabasico.jogo.fifa.personagens;

/**
 * Classe que define o comportamento para o objeto.
 * 
 * @author: Rodrigo
 * @date: 20 de abr de 2016
 * @Time: 21:03:56
 */
public class Tecnico {

	private String nome;
	private String time;

	protected void gritar() {
		System.out.println("Gritando protegido");
	}
	
	public void trocarJogador(){
		System.out.println("Trocando Jogador");
	}
	
	void falarPalavrao(){
		System.out.println("Bla bla bla bla bla");
	}

	
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	
	
	

}
