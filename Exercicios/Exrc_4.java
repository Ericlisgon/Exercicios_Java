package Exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exrc_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//       System.out.print("Digite o ano do seu nascimento no formato DD/MM/YYYY (com as barras)");
//        int anoDeNascimento= entrada.nextInt();
//        int anoAtual = 2021;
//        int dataAtual = LocalDate.now().getYear();
//        System.out.println("Você deve fazer "+(anoAtual- anoDeNascimento));
        System.out.println("Digite o ano do seu nascimento no formato DD/MM/YYYY (com as barras)");
        String dataNascimento = entrada.nextLine();
        int anoNascimentoUsuario = Integer.parseInt(dataNascimento.substring(6));
        int anoAtual = LocalDate.now().getYear();

        System.out.println("Voce deve ter ou fazer "+(anoAtual - anoNascimentoUsuario)+" anos de idade.");

//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String dataAtual = LocalDate.now().format(dateTimeFormatter);


    }
}
