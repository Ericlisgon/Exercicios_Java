package POO.Banco;

public class ContaCorrente extends ContaBancaria{

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(
                "Ericlis Gonçalves",
                "123.456.789.10",
                789456,
                3,
                7454655,
                2
        );

        System.out.println(contaCorrente.toString());
        System.out.println(contaCorrente.consultarSaldo());
        System.out.println(contaCorrente.sacar(10.00F));
        System.out.println(contaCorrente.depositar(20.00F));
        System.out.println(contaCorrente.depositar(20.00F));
        System.out.println(contaCorrente.sacar(10.00F));
        System.out.println(contaCorrente.consultarSaldo());

    }


    public ContaCorrente(String nome, String cpf, long nAgencia, int dAgencia, long nConta, int dConta){
        this.nome = nome;
        this.cpf = cpf;
        this.nAgencia = nAgencia;
        this.dAgencia = dAgencia;
        this.nConta = nConta;
        this.saldo = 0.0F;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String depositar(float valorDeposito) {

        return super.depositar(valorDeposito);
    }

    @Override
    public String sacar(float valorSaque) {
        return super.sacar(valorSaque);
    }
}
