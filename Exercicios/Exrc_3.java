package Exercicios;

import java.util.Scanner;

public class Exrc_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número, irei retornar se ele é impar ou par");
        double numero = entrada.nextDouble();

        if (numero % 2 ==0){
            System.out.println("O número que me passou é par! ");
        }else System.out.println("O número que passou é impar!");

    }
}
