package Exercicios;

import java.util.Scanner;

public class Exrc_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase em MAISÚSCULO");
        String frase = entrada.nextLine();
        System.out.println("A sua frase em minusculo: "+ frase.toLowerCase());
    }
}
