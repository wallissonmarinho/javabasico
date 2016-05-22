/**
 * Projeto das trilhas de treinamento de Java básico ou avançado 
 * com foco nas certificações java e em treinamentos corporativos. 
 * Fontes disponíveis em https://github.com/rodrigofujioka
 * 
 * Professor: Rodrigo da Cruz Fujioka
 * Ano: 2016
 * http://www.rodrigofujioka.com
 * http://www.fujideia.com.br
 * http://lattes.cnpq.br/0843668802633139
 * 
 * Contato: rcf4@cin.ufpe.br 
 * 
 */
package br.com.unipe.java.projeto.teatro;

/**
 * Programa principal com testes realizados em sala 
 * de aula para demonstração.
 * @author: Rodrigo
 * @date: 19 de mai de 2016
 * @Time: 20:50:58
 */
public class Principal {

    public static void main(String[] args) {
		
    	Menu menu = new Menu();
    	String cpf = null;
    	int posicaoLugar = 40;
    	TeatroMinerva tm = new TeatroMinerva();
    	while(true){
    		
    		int opcao = menu.exibeMenuPrincipal();
    		
    		
    		switch (opcao) {
			case 1:
				System.out.println("Informe o CPF");
				cpf = menu.getLeitor().nextLine();
				posicaoLugar = menu.obterValorInteiro();
				tm.comprarIngresso(posicaoLugar, cpf);
				break;

			case 2:
				System.out.println("Opção 2");
				break;
				
			case 9:
				 System.out.println("Programa Sendo encerrado...");
				 System.exit(0);
				break;
				
			default:
				break;
			}
    		
    		
    	}    	    	    
    	
    	
	}	
	
}














