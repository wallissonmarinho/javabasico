package com.rodrigofujioka.javabasico.aula06;

public class Aluno {

	private boolean alunoFilao;
	private boolean alunoFaltao;
	private String nome;
	private int idade;

	public Aluno() {
		this(23);
		System.out.println("Construtor 01");
	
	}

	public Aluno(int idade) {
		this("Fujioka",idade);
		System.out.println(idade);
	}
		
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		System.out.println("Construtor 02");
	}

	public boolean isAlunoFilao() {
		return alunoFilao;
	}

	public boolean isAlunoFaltao() {
		return alunoFaltao;
	}

	public void setAlunoFaltao(boolean alunoFaltao) {
		this.alunoFaltao = alunoFaltao;
		configuraAlunoFilao();
	}

	private void configuraAlunoFilao() {
		this.alunoFilao = isAlunoFaltao();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade >= 0) {
			this.idade = idade;
		} else {
			System.out.println("Idade deve ser >= 0");
		}
	}

}
