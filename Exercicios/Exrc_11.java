package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exrc_11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Double> listaNumeros = new ArrayList<>();

        System.out.println("Digite a quantidade desejada de números que serão in inseridos na Lista:");
        int tamanhoLista = entrada.nextInt();

        System.out.println("Digite os "+tamanhoLista+" números.");
        for (int i = 0; i < tamanhoLista ; i++) {
            listaNumeros.add(entrada.nextDouble());
        }

        Collections.sort(listaNumeros);
        System.out.println("Sua Lista é "+ listaNumeros);
    }
}
