package Exercicios;

import java.util.Scanner;

public class Exrc_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite dois números");
        double num1 = entrada.nextDouble();
        double num2 = entrada.nextDouble();

        System.out.println("A soma dos números é "+(num1 + num2));
        System.out.println("A subtração dos números é "+(num1 - num2));
        System.out.println("A multiplicação dos números é "+(num1 * num2));
        System.out.println("A divisão dos números é "+(num1 / num2));
    }
}
