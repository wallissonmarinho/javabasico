package com.rodrigofujioka.javabasico.aula11;

public class WinRar implements Compressor{

	@Override
	public void compactar() {
		System.out.println("Compactando com Winrar");
		
	}

	@Override
	public void descompactar() {
		System.out.println("Descompactando com Winrar");
		
	}

}
