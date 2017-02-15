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
package com.rodrigofujioka.javabasico20161.exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 11 de mai de 2016
 * @Time: 20:45:33
 */
public class ErroTeste {
	
	
	public static void main(String[] args)  {
		
		Scanner leitor = new Scanner(System.in);
		
		int x = 0;
		ClasseMauvada cm = null;
		try{
			
			//cm = new ClasseMauvada();
			
			System.out.println("Informe um número");
			x =  cm.obterNumero(leitor);
						
			cm.geraErroConversao();
			cm.geraErroChecado();		
			cm.gerarErroChecadoSegundo();
			
										
		}catch(NullPointerException np){			
			System.out.println("Valor nulo");
			//cm.obterNumero(new Scanner(System.in));
			np.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("");
			System.gc();
		}
		System.out.println("ALo Mundo Java");
						
		
	}
	
	
	
}




