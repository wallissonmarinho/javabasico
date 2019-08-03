/**
 * Projeto das trilhas de treinamento de Java básico ou avançado
 * com foco nas certificações java e em treinamentos corporativos.
 * Fontes disponíveis em https://github.com/rodrigofujioka
 * <p>
 * Professor: Rodrigo da Cruz Fujioka
 * <p>
 * http://www.rodrigofujioka.com
 * http://www.fujideia.com.br
 * http://lattes.cnpq.br/0843668802633139
 * <p>
 * Contato: rcf4@cin.ufpe.br
 */
package com.rodrigofujioka.javabasico.aula02;

import java.util.Scanner;

/**
 * Classe criada para demonstrar como é realizada a criação de objetos a partir
 * de outras classes.
 *
 * @author Rodrigo.fujioka
 * @data 04/02/2016 21:33
 * @data 10/02/2019 18:00
 */
public class ProgramaPrincipal {

    public static void main(String[] args) {

        /*
         * Criando algo na memória do Java. Agora a classe que você criou existe e pode
         * ter seu comportamento invocado. variavelDeReferencia é o nome da variavél que aponta para o
         * objeto em memória.  O nome da variavel de referência poderia ter qualquer  OutroNome.
         *
         * PS: Só não esqueça que ela não pode ser definida de novo no mesmo código.
         */
        ProfessorRodrigoFujioka variavelDeReferencia = new ProfessorRodrigoFujioka();
        variavelDeReferencia.imprimeNome("Rodrigo Fujioka");
        variavelDeReferencia.imprimeIdade(25);


        /*
         *
         * Crie uma classe com seu nome e crie métodos inerentes a abstração da sua pessoa.
         *  1 - Execute o código no console e no eclipse/intelijj ou ferramenta de desenvolvimento.
         *  2 - Saber compilar na mão é obrigatório, pelo menos, para essa aula.
         *
         * */

    }

}
