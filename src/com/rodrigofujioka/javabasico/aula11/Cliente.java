package com.rodrigofujioka.javabasico.aula11;

import java.io.Serializable;

public class Cliente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -906891488408072391L;
	
	private String nome;
	private String cpf;
	private int anoNascimento;
	
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
