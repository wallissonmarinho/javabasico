package com.rodrigofujioka.javabasico.aula04;

public class Lampada {

	private boolean estaLigada = false;
	
	public void apagar() {
		this.estaLigada = false;
	}
	
	public void acender() {
		this.estaLigada = true;
	}
	
	public boolean getEstaLigada() {
		return this.estaLigada;
	}
	
}






