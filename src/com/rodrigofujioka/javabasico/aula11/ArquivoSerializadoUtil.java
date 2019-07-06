package com.rodrigofujioka.javabasico.aula11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ArquivoSerializadoUtil {

	static FileOutputStream fos;
	static ObjectOutputStream oos;
	static FileInputStream fis;
	static ObjectInputStream ois;

	public static boolean gravaObjetoSerializado(String nome, Serializable objeto) {

		try {

			fos = new FileOutputStream(nome + ".ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(objeto);
			oos.close();
			fos.close();

		} catch (FileNotFoundException e) {

			System.out.println("Arquivo não encontrado");
			return false;
		} catch (IOException e) {

			System.out.println("Erro ao tentar acessar arquivo");
			return false;
		} finally {
			fos = null;
			oos = null;
		}
		return true;
	}

	public static Object lerArquivoSerializado(String nomeArquivo) {

		try {
			fis = new FileInputStream(nomeArquivo + ".ser");
			ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			ois.close();
			fis.close();
			return o;
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		} catch (IOException e) {
			System.out.println("Erro ao tentar acessar arquivo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Classe não existe");
		} finally {
			fis = null;
			ois = null;
		}
		return null;
	}

}
