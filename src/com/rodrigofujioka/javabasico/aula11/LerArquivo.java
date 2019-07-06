package com.rodrigofujioka.javabasico.aula11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LerArquivo {
	
	public static void main(String[] args) {
		
		FileInputStream fis;
		ObjectInputStream ois;
		try {
			fis = new FileInputStream("X.ser");
			ois = new ObjectInputStream(fis);
			
			Vodka v = (Vodka) ois.readObject();
			
			System.out.println(v.getCodigo());
			System.out.println(v.getNome());
			System.out.println(v.getTeorAlcoolico());
			
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
