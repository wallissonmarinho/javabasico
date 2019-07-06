package com.rodrigofujioka.javabasico.aula05;

/**
 * Aula de documentação java
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo Fujioka
 * @date: 14 de mar de 2019 
 * @Time: 20:58:36
 */
public class Locadora {
	
	/**
	 * Método que realiza aluguel.
	 * 
	 * @param nomeDvd <String> nome do DVD
	 * recebe até 50 caracteres.
	 */
	public void alugar(String nomeDvd) {
		System.out.println("ALugando: "+ nomeDvd);
	}
	
	/**
	 * 
	 * @param codigoDvd
	 * @return true se a condição for atendida
	 * se não retorna false
	 */
	public boolean vender(int codigoDvd) {
	System.out.println("Vendendo código: "+codigoDvd);
	return true;
	}
}
