package POO.Exercicio_4;

import java.util.Scanner;

public class ContaPoupanca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float saque=0, total=0, deposito=0, saldo =0;

        ContaBancaria conta = new ContaBancaria(
                52000,
                "Ericlis",
                saldo
        );
        saldo = conta.getSaldo();

        System.out.println("Escolha uma das opções\n1 - Saque\n2 - Depósito\n3 - Consultar saldo");
        int escolha = entrada.nextInt();
        if (escolha == 1){
            System.out.println("O seu saldo é de "+conta.getSaldo()+"\nQual valor você deseja sacar: ");
            saque = entrada.nextFloat();
           total = (saldo - saque);
        }else if (escolha == 2){
            System.out.println("O seu saldo é de "+conta.getSaldo()+"\nQual valor você deseja depositar: ");
            deposito = entrada.nextFloat();
            total = (saldo + deposito);
        }else if (escolha == 3){
            System.out.println(saldo);
        }else System.out.println("Número digitado não existe!");


        System.out.println(conta.toString());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
