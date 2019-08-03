
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
