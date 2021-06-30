package POO.Exercicios_1_2;

public class Panda {
    public static void main(String[] args) {
        Panda creuza = new Panda(
                "Creuza da Silva Souza",
                null,
                "China",
                "Zoológico de São Paulo",
                16
        );

        System.out.println(creuza.toString());
        System.out.println(creuza.espirrar());
        System.out.println(creuza.rugir());
        System.out.println(creuza.pararComer());
        System.out.println(creuza.comer());
        System.out.println(creuza.pararComer());


    }


    private String nome;
    private String comidaFavorita;
    private String localNascimento;
    private String localDeMoradia;
    private int idade;
    private Boolean estaComendo = false;

    public Panda(String nome, String comidaFavorita, String localNascimento, String localDeMoradia, int idade) {
        this.nome = nome;
        this.comidaFavorita = comidaFavorita;
        this.localNascimento = localNascimento;
        this.localDeMoradia = localDeMoradia;
        this.idade = idade;
    }

    public String rugir() {
        return "ROAAR";
    }

    public String espirrar(){
        return "TTTCHIIINNNNN";
    }

    public String comer(){
        estaComendo = true;
        if (comidaFavorita != null) {
            return nome +" está comendo sua comida favorita: " + comidaFavorita;
        }else {
            return nome +" está comendo Ovo";
        }
    }

    public String pararComer(){
        if (estaComendo){
            return nome +" parou de comer";
        }else{
            return nome +" não estava comendo";
        }
    }

    @Override
    public String toString() {
        return "Panda{" +
                "nome='" + nome + '\'' +
                ", comidaFavorita='" + comidaFavorita + '\'' +
                ", localNascimento='" + localNascimento + '\'' +
                ", localDeMoradia='" + localDeMoradia + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public String getLocalDeMoradia() {
        return localDeMoradia;
    }

    public void setLocalDeMoradia(String localDeMoradia) {
        this.localDeMoradia = localDeMoradia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

