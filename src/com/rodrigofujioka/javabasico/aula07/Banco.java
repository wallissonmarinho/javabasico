package com.rodrigofujioka.javabasico.aula07;

public class Banco {

	public static float TAXA_JUROS = 0.5f;
	
	public void alterarJuros(float taxa) {
		TAXA_JUROS = taxa;
	}
	
	public void calcularJuros(float valor, int meses) {
		System.out.println((valor*meses)*TAXA_JUROS);
	}		
		
}
