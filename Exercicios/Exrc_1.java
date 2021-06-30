package Exercicios;

import java.util.Scanner;

public class Exrc_1 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double produto = entrada.nextDouble();

        System.out.println("Digite o valor a ser Pago: ");
        double pago = entrada.nextDouble();

        if (pago < produto) System.out.println("Transação cancelada\n Valor pago é menor que o valor do produto!");
        else System.out.println("O troco desta transação é de R$"+ (pago - produto));
    }
}
