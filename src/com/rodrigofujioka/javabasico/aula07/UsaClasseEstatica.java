package com.rodrigofujioka.javabasico.aula07;

public class UsaClasseEstatica {
	
	public static int valor = 200;

	
	public static void main(String[] args) {
		
		UsaClasseEstatica a1 = new UsaClasseEstatica();
		a1.valor =20;
		System.out.println(a1.valor);
		
		UsaClasseEstatica.valor = 9;
		System.out.println(UsaClasseEstatica.valor);
				
		UsaClasseEstatica a2 = new UsaClasseEstatica();
		a2.valor = 50;
		System.out.println(valor);
		
	}

}
