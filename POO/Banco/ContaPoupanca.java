package POO.Banco;

public class ContaPoupanca extends ContaBancaria{

    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(
                "Ericlis Gonçalves",
                "123.456.789.10",
                789456,
                3,
                7454655,
                2
        );

        System.out.println(contaPoupanca.toString());
        System.out.println(contaPoupanca.consultarSaldo());
        System.out.println(contaPoupanca.sacar(10.00F));
        System.out.println(contaPoupanca.depositar(20.00F));
        System.out.println(contaPoupanca.depositar(20.00F));
        System.out.println(contaPoupanca.sacar(10.00F));
        System.out.println(contaPoupanca.consultarSaldo());

    }

    public ContaPoupanca(String nome, String cpf, long nAgencia, int dAgencia, long nConta, int dConta){
        this.nome = nome;
        this.cpf = cpf;
        this.nAgencia = nAgencia;
        this.dAgencia = dAgencia;
        this.nConta = nConta;
        this.saldo = 0.0F;
    }

    public float valorTaxado(float valorTransacao){
        double taxa = 2.0 / 100;
        System.out.println("Será cobrado um valor de R$"+(taxa * valorTransacao)+", sobre a transação de R$"+valorTransacao);
        return (float) (valorTransacao - (taxa * valorTransacao));
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String depositar(float valorDeposito) {
        return super.depositar(valorTaxado(valorDeposito));
    }

    @Override
    public String sacar(float valorSaque) {
        return super.sacar(valorTaxado(valorSaque));
    }
}
