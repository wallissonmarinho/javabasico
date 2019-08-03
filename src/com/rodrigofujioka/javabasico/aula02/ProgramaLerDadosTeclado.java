package com.rodrigofujioka.javabasico.aula02;

import javax.swing.*;
import java.util.Scanner;

public class ProgramaLerDadosTeclado {


    public static void main(String[] args) {


        /**
         * Variavél do tipo String, que recebe textos.
         * Esse objeto realiza a leitura dos dados enviados para o teclado.
         * Ao ser invocado fica aguardando a entrada de dados.
         *
         */
        Scanner leitor = new Scanner(System.in);
        String nomeProfessor;

        System.out.println("Informe o seu nome:");
        // Após a exibição do texto fica aguardando a digitação dedos
        nomeProfessor = leitor.nextLine();

        // Exibe as informações digitadas no console para o usuário.
        System.out.println("Nome " + nomeProfessor);


        /*
        Continue o código, faça a impressão por meio do objeto ProfessorRodrigoFujioka, colhendo
        também as informações de idade*/

    }


}
