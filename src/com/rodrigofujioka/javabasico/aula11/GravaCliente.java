package com.rodrigofujioka.javabasico.aula11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class GravaCliente {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.setNome("Rodrigo Fujioka");
		cliente.setCpf("0000000001");

		try {
			
			FileOutputStream fos = 
					 new FileOutputStream(cliente.getCpf() + ".ser");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(cliente);
			oos.close();
			fos.close();			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public int lerInteiro() {
		Scanner leitor = new Scanner(System.in);
		int valor = -1;
		while(valor == -1) {
			
			try {
				valor = Integer.parseInt(leitor.nextLine());
			}catch (Exception e) {
				System.out.println("asdasdasd");
			}
			
		}
		
		return valor;
		
	}
	

}
