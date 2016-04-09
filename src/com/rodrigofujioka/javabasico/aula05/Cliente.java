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
package com.rodrigofujioka.javabasico.aula05;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 9 de mar de 2016
 * @Time: 21:18:05
 */
public class Cliente extends Object{
	
	private String nome;
	private String endereco;
	
	
	public Cliente(){ 
		System.out.println("Contrutor Vazio");
	}
	
	public Cliente(String novoNome, String novoEndereco){		
		nome = novoNome;
		endereco = novoEndereco;
	    System.out.println("Executando Construtor");
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
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}
