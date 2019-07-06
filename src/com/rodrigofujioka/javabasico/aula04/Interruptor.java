package com.rodrigofujioka.javabasico.aula04;

public class Interruptor {
	
	private Lampada lampada;
	
	public void ligar() {
		getLampada().acender();
		System.out.println("Luz");
		exibirStatus();
	}
	
	public void desligar() {
		getLampada().apagar();
		System.out.println("Escuridão");
		exibirStatus();
	}
	
	public void exibirStatus() {
		System.out.println(getLampada().getEstaLigada());
	}

	public Lampada getLampada() {
		return lampada;
	}

	public void setLampada(Lampada lampada) {
		this.lampada = lampada;
	}
	
	
	
	

}
