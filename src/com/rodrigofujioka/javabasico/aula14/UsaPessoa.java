package com.rodrigofujioka.javabasico.aula14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsaPessoa {
	
	public static void main(String[] args) {
		
	
		int[] listaInteiros = {9,5,6,8,3,2,4,1};
		String[] listaStrings = {"A","G","T","C","B"};
		Pessoa[] pessoas = new Pessoa[7];
		List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		
		System.out.println(Arrays.toString(listaInteiros));
		Arrays.sort(listaInteiros);
		System.out.println(Arrays.toString(listaInteiros));
	
		System.out.println(Arrays.toString(listaStrings));
		Arrays.sort(listaStrings);
		System.out.println(Arrays.toString(listaStrings));
					
		
		for(int i =0; i<pessoas.length; i++) {
			pessoas[i] = new Pessoa();
			pessoas[i].setCpf(i+"0000000");
			pessoas[i].setNome(i+"0000000");			
		}
		Pessoa teste = new Pessoa();
		teste.setCpf("10000000");
		teste.setNome("10000000");
		
		System.out.println(Arrays.toString(pessoas));
		
		listaPessoa.add(teste);
		listaPessoa.add(new Pessoa());
		System.out.println(listaPessoa.size());
		listaPessoa.remove(teste);
		System.out.println(listaPessoa.size());
		
		listaPessoa.addAll(Arrays.asList(pessoas));
		
		
		
	}

	
}
