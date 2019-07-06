/**
 * Projeto das trilhas de treinamento de Java básico ou avançado 
 * com foco nas certificações java e em treinamentos corporativos. 
 * Fontes disponíveis em https://github.com/rodrigofujioka
 * 
 * Professor: Rodrigo da Cruz Fujioka
 * Ano: 2019
 * http://www.rodrigofujioka.com
 * http://www.fujideia.com.br
 * http://lattes.cnpq.br/0843668802633139
 * 
 * Contato: rcf4@cin.ufpe.br 
 * 
 */
package com.rodrigofujioka.javabasico.aula11;

import java.io.Serializable;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo Fujioka
 * @date: 7 de mai de 2019 
 * @Time: 20:51:15
 */
public class Vodka implements Serializable{
	
	/**
	 * 
	 */
	private static final 
	         long serialVersionUID = -896348031942430554L;
	private int codigo;
	private String nome;
	private float teorAlcoolico;
	private int anoFabricacao;
	
	
	
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the teorAlcoolico
	 */
	public float getTeorAlcoolico() {
		return teorAlcoolico;
	}
	/**
	 * @param teorAlcoolico the teorAlcoolico to set
	 */
	public void setTeorAlcoolico(float teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the anoFabricacao
	 */
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	/**
	 * @param anoFabricacao the anoFabricacao to set
	 */
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	

}
