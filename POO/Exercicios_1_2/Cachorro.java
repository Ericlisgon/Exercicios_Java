package POO.Exercicios_1_2;

import java.util.Scanner;

public class Cachorro {
    private String nome;
    private String raca;
    private String origem;
    private String dono;
    private int idade;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do Dog: ");
        String nome = entrada.nextLine();

        System.out.println("Digite a raça do Dog: ");
        String raca = entrada.nextLine();

        System.out.println("Digite a origem do Dog: ");
        String origem = entrada.nextLine();

        System.out.println("Digite o nome do dono: ");
        String dono = entrada.nextLine();

        System.out.println("Digite a idade do Dog");
        int idade = entrada.nextInt();

        if (idade > 18){
            System.out.println("\n\nCoitado do Dog!!!\nO dog está bem velhinho!\n\n");
        }else if (idade < 18) System.out.println("\n\nDog está novinho!!!\n\n");

        Cachorro meno = new Cachorro(
                nome,
                raca,
                origem,
                dono,
                idade
        );
        System.out.println(meno.toString());

        System.out.println(meno.comer());
        System.out.println(meno.latir());
        System.out.println(meno.pegandoMotoqueiro());
        System.out.println(meno.mordendoMotoqueiro());
        System.out.println(meno.cachorroFeliz());
    }
    public Cachorro(String nome, String raca, String origem, String dono, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.origem = origem;
        this.dono = dono;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", origem='" + origem + '\'' +
                ", dono='" + dono + '\'' +
                ", idade=" + idade +
                '}';
    }


    //Métodos construtrores
    public String latir(){
        return " O "+nome+" está latindo.";
    }

    public String comer(){
        return "O "+nome+" está comendo...";
    }

    public String pegandoMotoqueiro(){
        return "O "+nome+" está correndo atrás do motoqueiro!!!!";
    }

    public String mordendoMotoqueiro(){
        return "O "+nome+" está mordendo o motoqueiro";
    }

    public String cachorroFeliz(){
        return "O "+nome+" mordeu o motoqueiro e agora está FELIZ!!!";
    }

    //Getterrs e Setterrs
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
