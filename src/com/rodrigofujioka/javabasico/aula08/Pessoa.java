package com.rodrigofujioka.javabasico.aula08;

public class Pessoa {
		
	private String nome;
	private String cpf;
	
	public void exibirNomeCpf() {
		System.out.println("Nome : " + 
	                          nome + " CPF:"+ cpf );
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
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
