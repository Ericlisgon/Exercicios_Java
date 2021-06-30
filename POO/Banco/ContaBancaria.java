package POO.Banco;

public class ContaBancaria {

    protected String nome;
    protected String cpf;
    protected long nAgencia;
    protected int dAgencia;
    protected long nConta;
    protected int cConta;
    protected float saldo;

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nome=" + nome +
                ", cpf='" + cpf + '\'' +
                ", nAgencia=" + nAgencia +
                ", dAgencia=" + dAgencia +
                ", nConta=" + nConta +
                ", cConta=" + cConta +
                ", saldo=" + saldo +
                '}';
    }

    public String consultarSaldo(){
        return "\nSaldo de conta de R$"+saldo;
    }

    public String depositar(float valorDeposito){
        saldo += valorDeposito;
        return "Depósito no valor de R$:"+valorDeposito+" realizado com sucesso\nSaldo atual R$"+saldo;
    }

    public String sacar(float valorSaque){
        if (valorSaque <= saldo){
            saldo -= valorSaque;
            return "Saque efetuado com valor de R$"+valorSaque+" realizado com sucesso!\nSaldo atual R$"+saldo;
        }else{
            return "\t\tValor do saque indisponível!!\nO valor solicitado foi de R$"+valorSaque+" e o valor disponível é de R$"+saldo;
        }
    }
}
