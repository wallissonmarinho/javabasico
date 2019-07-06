package com.rodrigofujioka.javabasico.aula12;

public class Carro {
	
	private Motor motor;
	String tipo = null;  //a - Chave
	                     //b - Botão 
	
	public void ignicao(String tipo) {			
		
		try {
			
			System.out.println("Dando ignição");  
			this.motor.ligar(tipo);
			System.out.println("Motor ligado");
			
		}catch (Exception e) {			
			this.motor = new Motor();
			this.motor.ligar(tipo);			
		}
		
		
		
		
	}

	
	
}
