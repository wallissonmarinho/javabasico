package com.rodrigofujioka.javabasico.aula11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GravaArquivo {
	
	public static void main(String[] args) {
		
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			fos = new FileOutputStream("X.ser");
			oos = new ObjectOutputStream(fos);
			Vodka natasha = new Vodka();
			
			natasha.setCodigo(1);
			natasha.setNome("Natasha");
			natasha.setTeorAlcoolico(4.5f);
			
			oos.writeObject(natasha);
			
			oos.close();
			fos.close();
			System.out.println("Deu certo");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	

}
