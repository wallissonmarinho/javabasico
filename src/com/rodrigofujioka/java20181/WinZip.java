package com.rodrigofujioka.java20181;

public class WinZip implements Compressor {

	@Override
	public void compactar() {
	
		System.out.println("Compactando com Winzip");
		
	}

	@Override
	public void descompactar() {
		System.out.println("Descompactando com Winzip");
		
	}

}
