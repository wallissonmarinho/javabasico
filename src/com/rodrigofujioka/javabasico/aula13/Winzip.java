package com.rodrigofujioka.javabasico.aula13;

public class Winzip implements Compactador{

	/* (non-Javadoc)
	 * @see com.rodrigofujioka.javabasico.aula13.Compactador#compactar()
	 */
	@Override
	public void compactar() {
		System.out.println("Compactar com Winzip");
	}

	/* (non-Javadoc)
	 * @see com.rodrigofujioka.javabasico.aula13.Compactador#descompactar()
	 */
	@Override
	public void descompactar() {
		System.out.println("Descompactar com Winzip");
	}
	
	

}
