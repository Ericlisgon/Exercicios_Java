package Exercicios;

import java.util.*;

public class Exrc_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        System.out.println("Digite um número: ");
//        double num1 = entrada.nextDouble();
//
//        System.out.println("Digite um número: ");
//        double num2 = entrada.nextDouble();
//
//        System.out.println("Digite um número: ");
//        double num3 = entrada.nextDouble();
//
//        if (num1 > num2 && num1 > num3) System.out.println("O maior número é o "+ num1);
//        if (num2 > num1 && num2 > num3) System.out.println("O maior número é o "+ num2);
//        else System.out.println("O maior número é o "+ num3);

        System.out.println("\t\tIrei retornar o maior número dentro de uma lista!  ");
        System.out.println("\nDigite a quantidade desejada de números a serem inseridos na Lista!");
        int quantidadeDeNumeros = entrada.nextInt();

        System.out.println("Por Favor, poderia me informar os "+quantidadeDeNumeros+" números a serem inseridos!");
        List<Double> numeros = new ArrayList<>();
        for (int i = 0; i < quantidadeDeNumeros; i++) {
            numeros.add(entrada.nextDouble());
        }

        System.out.println("O maior npumero que você digitou doi o: " + Collections.max(numeros));
    }
}
