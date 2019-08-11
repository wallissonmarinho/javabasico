/**
 * Projeto das trilhas de treinamento de Java básico ou avançado
 * com foco nas certificações java e em treinamentos corporativos.
 * Fontes disponíveis em https://github.com/rodrigofujioka
 * <p>
 * Professor: Rodrigo da Cruz Fujioka
 * Ano: 2016
 * http://www.rodrigofujioka.com
 * http://www.fujideia.com.br
 * http://lattes.cnpq.br/0843668802633139
 * <p>
 * Contato: rcf4@cin.ufpe.br
 */
package com.rodrigofujioka.javabasico.aula03;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 17 de fev de 2016
 * @Time: 21:25:42
 */
public class Aluno {

    String nome;
    int idade;
    String escola;

    /**
     * Método que exibe todos os dados do usuário.
     */
    public void exibeDados() {
        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade);
        System.out.println("Escola " + escola);
    }


    /**
     * Método que exibe apenas a idade do usuário
     */
    public void informaIdade() {
        System.out.println("Idade " + idade);
    }

    /*
     * Crie métodos que sejam responsáveis pela impressão das demais variaveis que não possuem impressão solo
     *
     * */


}












