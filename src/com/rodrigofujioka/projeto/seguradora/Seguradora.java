package com.rodrigofujioka.projeto.seguradora;
/**
 * 
 * @author rodrigo.fujioka
 *
 */

import java.util.ArrayList;

import com.rodrigofujioka.projeto.seguradora.modelo.Cliente;
import com.rodrigofujioka.projeto.seguradora.modelo.Contrato;

public class Seguradora {
	
	
	private ArrayList<Cliente> listaCliente = new ArrayList<>();
	private ArrayList<Contrato> listaContrato = new ArrayList<>();
	/**
	 * Metodo que realiza cadastro de cliente.
	 * @param cliente a ser cadastrado. 
	 */
	public void cadastraCliente(Cliente cliente) {		
		getListaCliente().add(cliente);
		System.out.println("Cadastro realizado com sucesso");
	}

	
	public void cadastraContrato(Contrato contrato) {
		getListaContrato().add(contrato);
		System.out.println("Contrato cadastrado com sucesso");
	}
	
	public void listarClientes() {
		
		for(Cliente cliente: getListaCliente()) {
			System.out.println(cliente);
		}
		
	}
	
	
	public ArrayList<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(ArrayList<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	public ArrayList<Contrato> getListaContrato() {
		return listaContrato;
	}

	public void setListaContrato(ArrayList<Contrato> listaContrato) {
		this.listaContrato = listaContrato;
	}
	
	
	

}
