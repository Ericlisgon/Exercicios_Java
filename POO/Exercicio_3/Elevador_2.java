package POO.Exercicio_3;

public class Elevador_2 {
    public static void main(String[] args) {
        Elevador_2 elevador = new Elevador_2(
                5,
                6
        );
        System.out.println(elevador.descerAndar());
        System.out.println(elevador.sairElevador());

        System.out.println(elevador.entrarElevador());
        System.out.println(elevador.entrarElevador());
        System.out.println(elevador.entrarElevador());
        System.out.println(elevador.entrarElevador());
        System.out.println(elevador.entrarElevador());
        System.out.println(elevador.entrarElevador());

        System.out.println(elevador.sairElevador());
        System.out.println(elevador.sairElevador());

        System.out.println(elevador.subirAndar());
        System.out.println(elevador.subirAndar());
        System.out.println(elevador.subirAndar());
        System.out.println(elevador.subirAndar());
        System.out.println(elevador.subirAndar());
        System.out.println(elevador.subirAndar());

        System.out.println(elevador.descerAndar());
        System.out.println(elevador.descerAndar());


        System.out.println(elevador.toString());
    }




    private int andarAtual = 0;
    private int totalDeAndares;
    private int capacidadeMax;
    private int quantidaDePessoas = 0;

    public Elevador_2(int totalDeAndares, int capacidadePessoas) {
        this.totalDeAndares = totalDeAndares;
        this.capacidadeMax = capacidadePessoas;
    }

    @Override
    public String toString() {
        return "Elevador_2{" +
                "andarAtual=" + andarAtual +
                ", totalDeAndares=" + totalDeAndares +
                ", capacidadeMax=" + capacidadeMax +
                ", quantidaDePessoas=" + quantidaDePessoas +
                '}';
    }

    public String entrarElevador(){
        if (quantidaDePessoas < capacidadeMax){
            quantidaDePessoas = quantidaDePessoas + 1;
            return "Uma pessoa entrou no elevado, quantidade atual: "+ getQuantidaDePessoas()+"\n";
        }else{
            return "N??o foi poss??vel entrar no elevador, capacidade M??xima atingida: "+getCapacidadePessoas()+"\n";
        }
    }

    public String sairElevador(){
        if (quantidaDePessoas > 0){
            quantidaDePessoas = quantidaDePessoas - 1;
            return "Uma pessoa saiu do Elevador, quantidade atual: "+ getQuantidaDePessoas()+"\n";
        }else{
         return "N??o foi poss??vel sair do elevador, pois n??o possui pessoas dentro dele!\nA quantidade de pessoas ??: "+quantidaDePessoas;
        }
    }

    public String subirAndar(){
        if (andarAtual < totalDeAndares){
            andarAtual = andarAtual + 1;
            return "O elevador esta subindo para o andar"+ andarAtual+"\n";
        }else return "O elevador se encontra no ??ltimo andar\nAndar: "+andarAtual+"\n";
    }

    public String descerAndar(){
        if (andarAtual != 0){
            andarAtual = andarAtual - 1;
            return "O elevador esta descendo para o andar"+ andarAtual+"\n";
        }else return "O elevador j?? se encontra no "+andarAtual+" terreo.\nPor isso n??o ?? poss??vel descer!"+"\n";
    }

    public int getTotalDeAndares(){
        return totalDeAndares;
    }

    public int getCapacidadePessoas(){
        return capacidadeMax;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getQuantidaDePessoas() {
        return quantidaDePessoas;
    }
}
