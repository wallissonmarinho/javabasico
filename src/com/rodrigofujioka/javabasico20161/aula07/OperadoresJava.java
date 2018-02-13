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
package com.rodrigofujioka.javabasico20161.aula07;

import java.math.BigDecimal;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 14 de abr de 2016
 * @Time: 20:46:33
 */
public class OperadoresJava {
	
	
	public static void main(String[] args) {
		
		
		Pessoa p = new Pessoa();
		PessoaEspecial  pe = new PessoaEspecial();
		Pessoa pp = new PessoaEspecial();
		
		float valorFloat = 4.6f; 
		
		
		if(p instanceof PessoaEspecial){
			System.out.println("P é uma instância de PessoaEspecial");
		}
		
		
		
		
		int idade = (45==80) ? 45 :89;
		int outraIdade = (45==80) ? 45 :  (33==33) ? 33:45 ;
		
		String s = "(short)(1 + 2 + 3)";
		
		if(operacaoUm() || operacaoDois()){
			
			System.out.println("Tudo CErto");
		}else{
			System.out.println("Aconteceu alguma coisa");
		}
		
		
	}	
	
	public static boolean operacaoUm(){
		System.out.println("Operação um");
		return true;
	}
	
	
	public static boolean operacaoDois(){
		System.out.println("Operação Dois");
		return true;
	}
	
	
	

}
