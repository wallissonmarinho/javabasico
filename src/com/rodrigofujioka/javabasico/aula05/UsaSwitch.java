package com.rodrigofujioka.javabasico.aula05;

import com.rodrigofujioka.javabasico.aula04.ObjetoJapones;

public class UsaSwitch {

	public static void main(String[] args) {

		 processaValor(new ObjetoJapones());
		 processaValor(new AgenciaBancaria());
		 
		Object o = new ObjetoJapones();
		Object c = new AgenciaBancaria();
		
		if(o instanceof ObjetoJapones) {
			System.out.println("Objeto Japonês");
			
		}
		
		if(c instanceof ObjetoJapones) {
			System.out.println("Objeto Japonês");
		}
		
	
		byte valorByte = 127;
		
		int valor = valorByte < 128 ? 123 : 0;
		int valorX = valorByte < 128 ? valorByte == 128 ? 45: 9 : 0;
		
		System.out.println(valorByte);
		short valorShort = 512;
		int valorInteiro = 100;				
		long valorLong = 2;
		
		System.out.println(valorByte);
		System.out.println(valorShort);
		System.out.println(valorInteiro);
		System.out.println(valorLong);
		
		valorShort = valorByte;
		System.out.println(valorShort);
	
		valorByte = (byte)valorShort;
		System.out.println(valorByte);


	}

	public static void processaValor(Object o) {
		
		System.out.println("Abrindo sistema");
		System.out.println("Registrando objeto");
		
		if(o instanceof ObjetoJapones) {
			System.out.println();
		}else {
			System.out.println("");
		}
		
	}
	
	
	
	
}
