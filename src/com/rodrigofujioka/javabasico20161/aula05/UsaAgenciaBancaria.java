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
package com.rodrigofujioka.javabasico20161.aula05;

/**
 * Classe que define o comportamento para o objeto.
 * 
 * @author: Rodrigo
 * @date: 10 de mar de 2016
 * @Time: 21:03:00
 */
public class UsaAgenciaBancaria {

	public static void main(String[] args) {
      
		 int x = 8;
		 AgenciaBancaria agenciaManaira = new AgenciaBancaria();
		 AgenciaBancaria agenciaBessa= new AgenciaBancaria();
		 AgenciaBancaria agenciaAreia = new AgenciaBancaria(); 
		 
		 agenciaAreia.setNomeAgencia("Areia");
		 agenciaBessa.setNomeAgencia("Bessa");
		 agenciaManaira.setNomeAgencia("Manaira");
		 
		 System.out.println(agenciaAreia.getNomeAgencia());
		 System.out.println(AgenciaBancaria.juros);
		 System.out.println(agenciaAreia.juros);
		 agenciaAreia.juros = 9;
		 System.out.println(AgenciaBancaria.juros);
		 System.out.println(agenciaBessa.juros);
		 System.out.println(agenciaManaira.juros);
		 agenciaAreia.juros = 7;
		 System.out.println(agenciaBessa.juros);
		 agenciaAreia.setNomeAgencia("Outra Agência");
		 agenciaAreia.juros =15;
		 
		 System.out.println(agenciaAreia.getNomeAgencia());
		 System.out.println(agenciaManaira.juros);
		 
		 
		 
		 
		 
		 
         
		 
		  
	}

}



