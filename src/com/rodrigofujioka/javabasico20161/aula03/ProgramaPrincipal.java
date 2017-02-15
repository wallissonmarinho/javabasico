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
 * @Time: 21:34:29
 */
public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		Aluno alunoEstudioso = new Aluno();
		Aluno alunoJogador = new Aluno();
		Aluno alunoCurioso = new Aluno();
		
		
		alunoEstudioso.escola = "Unipê";
		alunoEstudioso.idade = 33;
		alunoEstudioso.nome= "Rodrigo Fujioka";
				
		alunoCurioso.escola = "Unipê";
		alunoCurioso.idade = 17;
		alunoCurioso.nome= "Bill";
		
		alunoEstudioso.exibeDados();
		alunoCurioso.exibeDados();
		
		
	}

	
	
	
	
	
	
	
	
	
	
}








