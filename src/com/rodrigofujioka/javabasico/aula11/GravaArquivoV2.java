package com.rodrigofujioka.javabasico.aula11;

public class GravaArquivoV2 {
	
	public static void main(String[] args) throws VodkaException {
		
		Vodka vodka = new Vodka();
		vodka.setCodigo(3);
		vodka.setNome("Uma Vodka");
		vodka.setTeorAlcoolico(50.5f);
		
		boolean gravou = 
			ArquivoSerializadoUtil.gravaObjetoSerializado("natasha", vodka);
		
		
		
		if(gravou) {
			System.out.println("Arquivo gravado com sucesso");
		}else {
			throw new VodkaException("VOdka não foi gravada no disco");
		}
		
	}

}
