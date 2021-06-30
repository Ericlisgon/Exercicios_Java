package POO.Exercicio_4;

public class ContaBancaria {
    private int conta;
    private String nome;
    private float saldo;

    public ContaBancaria(int conta, String nome, float saldo) {
        this.conta = conta;
        this.nome = nome;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "conta=" + conta +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getConta() {
        return conta;
    }
}
