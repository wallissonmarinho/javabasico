/**
 * Projeto das trilhas de treinamento de Java básico ou avançado 
 * com foco nas certificações java e em treinamentos corporativos. 
 * Fontes disponíveis em https://github.com/rodrigofujioka
 * 
 * Professor: Rodrigo da Cruz Fujioka
 * 
 * http://www.rodrigofujioka.com
 * http://www.fujideia.com.br
 * http://lattes.cnpq.br/0843668802633139
 * 
 * Contato: rcf4@cin.ufpe.br 
 * 
 */
package com.rodrigofujioka.javabasico.aula02;

import java.util.Scanner;

/**
 * Classe criada para demonstrar como é realizada a criação 
 * de objetos a partir de outras classes.
 * 
 * @author Rodrigo.fujioka
 * 
 * @data 04/02/2016  21:33 
 *
 */
public class ProgramaPrincipal {
		
	public static void main(String[] args) {
		
	/*
	 * Esse objeto realiza a leitura dos dados
	 * enviados para o teclado. Ao ser invocado
	 * fica aguardando a entrada de dados.
	 *  
	 */
	Scanner leitor = new Scanner(System.in);	
	
	
	/*
	 * Criando algo na memória do Java.
	 * Agora a classe que você criou existe e pode ter 
	 * seu comportamento invocado.
	 * x é o nome da variavél que aponta para o objeto em memória.
	 */
	RodrigoFujioka x = new RodrigoFujioka();
    x.imprimeNome();
    x.imprimeIdade();
    
    /**
     * Variavél do tipo String, que recebe textos.
     */
    String nomeProfessor;
    
    
    System.out.println("Informe o seu nome:");
    // Após a exibição do texto fica aguardando a digitação dedos
    nomeProfessor = leitor.nextLine();
    
    //Exibe as informações digitadas no console para o usuário.
    System.out.println("Nome " + nomeProfessor);
    
		
	}
	
	

}
