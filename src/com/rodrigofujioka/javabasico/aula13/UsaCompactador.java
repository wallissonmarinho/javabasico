package com.rodrigofujioka.javabasico.aula13;

import java.util.Arrays;

public class UsaCompactador {
	
	public static void main(String[] args) {
		
		Compactador winzip = new Winzip();
		winzip.compactar();
		
		
		String[] listaNome = {
				"Asdrubal","Quincas Borbas","Turing","Tainha",
				"Bill Gates", "Tony Stark", "Nina"								
		};
		
		System.out.println(Arrays.toString(listaNome));
		Arrays.sort(listaNome);
		System.out.println(Arrays.toString(listaNome));
		
		
		
		
		
		
		
		
		
		
		
	}

}
