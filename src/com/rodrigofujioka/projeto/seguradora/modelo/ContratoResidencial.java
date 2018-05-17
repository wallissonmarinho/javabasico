package com.rodrigofujioka.projeto.seguradora.modelo;

import com.rodrigofujioka.projeto.seguradora.tiposenumerados.TipoResidencialEnum;
import com.rodrigofujioka.projeto.seguradora.tiposenumerados.Zona;

public class ContratoResidencial extends Contrato {

	private String endereco;
	private Zona zona;
	private TipoResidencialEnum tipoResidencial;
	
	
	public Float obterValorSeguro() {
		return 0.0f;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public TipoResidencialEnum getTipoResidencial() {
		return tipoResidencial;
	}
	public void setTipoResidencial(TipoResidencialEnum tipoResidencial) {
		this.tipoResidencial = tipoResidencial;
	}
	
	
	
	
}
