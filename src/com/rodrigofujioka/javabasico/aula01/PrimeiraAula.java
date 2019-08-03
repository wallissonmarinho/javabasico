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
package com.rodrigofujioka.javabasico.aula01;

import javax.swing.*;

/**
 * Primeiro programa java. Classe de apresentação utilizada para entender e reforçar
 * as informações da primeira Aula, Passagem de parâmetros e métodos em Java.
 * Prática:
 * 1 - Implemente um programa que recebe parâmetros com o nome e ano de nascimento.
 * o programa deve calcular a idade do usuário em anos com base no ano de nascimento informado.
 * <p>
 * 2 - Implemente uma calculadora em Java, utilizando métodos e o que você achar que é possível
 * com seu conhecimento atual, para inteiros use o tipo   int.
 *
 * @author Rodrigo.fujioka
 * @data 03/02/2016 21:30 2018.1
 * @date 07/02/2019 20:30 2019.1
 */
public class PrimeiraAula {

    /*
     * main método principal de uma classe executavel java. O compilador java
     * procura o main método em uma classe para executar, se ela não tem esse método
     * ela não é executavel
     */
    public static void main(String args[]) {

        imprimeNome();  //Nessa linha vai ser realizada chamada ao método imprimeNome.


        /*O primeiro parâmetro é passado aqui no comando   java PrimeiraAula  Professor Fujioka*/
        System.out.println(args[0]);  //Nessa linha vai imprimir Professor


        System.out.println(args[1]);   //Nessa outra linha vai imprimir Fujioka

        /*Métodos estáticos só executam métodos estáticos, esse conteúdo ainda será visto*/

    }

    /**
     * Método que realiza impressão do texto Alô Mundo no console.
     */
    public static void imprimeNome() {


        System.out.println("Alô mundo");  // Console
        JOptionPane.showMessageDialog(null, "Alô mundo"); // Interface Gráfica
    }

}
