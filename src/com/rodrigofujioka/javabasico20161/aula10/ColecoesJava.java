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
package com.rodrigofujioka.javabasico20161.aula10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 1 de jun de 2016
 * @Time: 21:18:19
 */
public class ColecoesJava {

	
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();		
		lista.add("Rodrigo Fujioka");
		
		
		Collections.sort(lista);
		
		
		Map<Integer, String> mapa = new HashMap<>();
		
		mapa.put(33, "Fujioka");
		mapa.put(45, "Rodrigo");
		mapa.put(33, "Rodrigo Fujioka");
		
		
		String numero = mapa.get(45);
		
	    Set<Integer> chaves =  mapa.keySet();
	    
	    mapa.values();
	    
	    System.out.println(chaves.toString());
		
		
		
		
	}
	
	
}







