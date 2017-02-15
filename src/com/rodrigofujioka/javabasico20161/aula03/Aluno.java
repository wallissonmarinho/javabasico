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
package com.rodrigofujioka.javabasico20161.aula03;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 17 de fev de 2016
 * @Time: 21:25:42
 */
public class Aluno {
	
	String nome;
	int idade;
	String escola;

	public void exibeDados(){		
		System.out.println("Nome " + nome);
		System.out.println("Idade " + idade);
		System.out.println("Escola " + escola);	
	}	
	
	public void informaIdade(){
		System.out.println("Idade " + idade);
	}
	
	
}












