package Exercicios;

import java.util.Scanner;

public class Exrc_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String jogoDoBicho = "cobra";

        System.out.println("Chute qual o resultado do jogo do bicho! \nPara sair escreva sair");
        while (!entrada.nextLine().toLowerCase().contains("cobra")){
            if (entrada.nextLine().toLowerCase().contains("sair")){
                System.out.println("Encerrando o programa!");
                break;
            }
        }
        System.out.println("\t\t\tVOCÊ ACERTOU!!!! \nO bicho que ganhou foi "+jogoDoBicho);
    }
}
