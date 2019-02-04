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
package com.rodrigofujioka.projeto.teatro;

import java.util.Scanner;

/**
 * Exemplos para implementação de projeto e boas práticas.
 * @author: Rodrigo
 * @date: 19 de mai de 2016
 * @Time: 20:54:16
 */
public class Menu {
	
	private Scanner leitor = new Scanner(System.in);
	
	
	/**
	 * 
	 * Esse exibe o menu e obtém a opção informada.
	 * @return int contendo a opção selecionada.
	 */
	public int exibeMenuPrincipal(){ 	
		
		
		int opcao = -1;		
		System.out.println("1 - Comprar Ingresso");
		System.out.println("2 - Exibir Lugares Ocupados");
		System.out.println("9 - Sair");
		System.out.print("Informe a oção: ");		
		
		opcao = obterValorInteiro();
		
		return opcao;
	}
	
	/**
	 * Obtém o valor inteiro de uma String digitada.
	 * Esse método realiza a conversão de uma String digitada para um Inteiro
	 * além disso faz tratamento de exceção, caso o usuário
	 * informe um valor inválido.
	 * @return int contendo o valor convertido para inteiro.
	 */
	public int obterValorInteiro(){
		int retorno = -1;
		String valor = null;
		while(retorno < 0){			
				try{				
					
				    valor = leitor.nextLine(); 		
					retorno = Integer.parseInt(valor);
				
				}catch(NumberFormatException ne){
				  retorno = -1;  
				  System.out.println("Informe um valor Válido");
				}							
			}				
		return retorno;
	}


	/**
	 * @return the leitor
	 */
	public Scanner getLeitor() {
		return leitor;
	}


	/**
	 * @param leitor the leitor to set
	 */
	public void setLeitor(Scanner leitor) {
		this.leitor = leitor;
	}
	

	
	
	
}







