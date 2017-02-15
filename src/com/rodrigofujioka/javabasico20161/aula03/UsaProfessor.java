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
 * Classe executavel utilizada para instânciar o objeto professor 
 * e executar algumas de suas operações.
 * @author: Rodrigo
 * @date: 10 de fev de 2016
 * @Time: 05:46:31
 */
public class UsaProfessor {
	
	public static void main(String[] args) {
		
		Professor fujioka = new Professor();
		
		fujioka.disciplina = "Metodologia e Linguagem de Programação 2";
		
		fujioka.ensina();
		
	}

}
