package Exercicios;

import java.util.Scanner;

public class Exrc_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3, media ;
    System.out.println("Digite sua 3 notas");
    nota1 = entrada.nextDouble();
    nota2 = entrada.nextDouble();
    nota3 = entrada.nextDouble();

    media = ((nota1 + nota2 + nota3)/3);

    if (media >= 7 ) System.out.println("Você foi APROVADO!!!");
    else if (media == 5 || media == 6) System.out.println("Você está de RECUPERAÇÃO!!!");
    else System.out.println("Você está REPROVADO!!!");
    }
}
