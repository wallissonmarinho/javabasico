/**
 * Projeto das trilhas de treinamento de Java básico ou avançado
 * com foco nas certificações java e em treinamentos corporativos.
 * Fontes disponíveis em https://github.com/rodrigofujioka
 * <p>
 * Professor: Rodrigo da Cruz Fujioka
 * Ano: 2019
 * http://www.rodrigofujioka.com
 * http://www.fujideia.com.br
 * http://lattes.cnpq.br/0843668802633139
 * <p>
 * Contato: rcf4@cin.ufpe.br
 */
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






