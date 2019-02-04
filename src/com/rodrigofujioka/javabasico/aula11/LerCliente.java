package com.rodrigofujioka.javabasico.aula11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class LerCliente {
	
	public static void main(String[] args) {
		
		System.out.println("Informe o CPF do cliente: ");
		String cpf = new Scanner(System.in).nextLine();
		
		try {
			
			FileInputStream fis = new FileInputStream(cpf+".ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Cliente cliente = (Cliente) ois.readObject();
			System.out.println(cliente);
			ois.close();   fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
