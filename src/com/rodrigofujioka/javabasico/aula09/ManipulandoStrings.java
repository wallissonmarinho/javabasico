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
package com.rodrigofujioka.javabasico.aula09;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 25 de mai de 2016
 * @Time: 20:42:36
 */
public class ManipulandoStrings {

	public static void main(String[] args) {
		
		String str = "Isto é uma String do Java";
		String[] palavras = str.split(" ");
		
		for(String palavra:palavras){
					
				System.out.println(palavra);
		}
		
		if(str.endsWith("Javas")){
			System.out.println(str);
		}
		
		
		String nome = "Rodrigo fujioka";
		
		if(nome.equalsIgnoreCase("rodrigo Fujioka")){
			System.out.println("É Rodrigo");
		}
		
		int posicao = str.indexOf("JavaX");
		System.out.println(posicao);
		
		String textoAlterado =str.replace("Java", "");
		System.out.println(textoAlterado);
		
		System.out.println(str);
		
		
		String outra = str.substring(0, 3);
		
		System.out.println(outra);
		
	}		
}


