package POO.Exercicio_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalAndares = 5, elevador = 0, qtdElevador = 5;
        List<String> listaDeMoradores = new ArrayList<>();
        String nome1 = "",nome2 = "",nome3 = "";

        System.out.println("Digite uma das opções disponíveis\n1 - Cadastrar Morador\n2 - Pegar Elevador");
        int decisao = entrada.nextInt();
        System.out.println("Quantas pessoas desejam subir no elevador:\nMáximo suportado: "+qtdElevador);
        int pessoa = entrada.nextInt();
        if (pessoa < 5){
            qtdElevador = pessoa;
        }else if(pessoa > 5){
            System.out.println("Quantidade de pessoas indisponível!!");
            System.out.println("Só vai entrar 5 pessoas!!");
            pessoa = 5;
        }

        if (decisao == 1) {
            System.out.println("Digite um dos andares disponíveis\n Total de Andares: " + totalAndares);
            for (int i = 1; 0 <= totalAndares; i++) {
                System.out.println("Digite o andar que você deseja fazer o cadastro do Morador/Usuário\naté o total de " + totalAndares + " andares!");
                elevador = entrada.nextInt();

                if (elevador == 1) {
                    System.out.println("Andar: " + elevador);
                    System.out.println("\n");
                    System.out.println("Digite o nome de 3 moradores desse andar: ");
                    System.out.println("Primeiro morador: ");
                    nome1 = entrada.next().toLowerCase();
                    System.out.println("Segundo morador: ");
                    nome2 = entrada.next().toLowerCase();
                    System.out.println("Terçeiro morador: ");
                    nome3 = entrada.next().toLowerCase();
                    elevador = 1;
                    break;
                } else if (elevador == 2) {
                    System.out.println("Digite o nome de 3 moradores desse andar: ");
                    System.out.println("Primeiro morador: ");
                    nome1 = entrada.next().toLowerCase();
                    System.out.println("Segundo morador: ");
                    nome2 = entrada.next().toLowerCase();
                    System.out.println("Terçeiro morador: ");
                    nome3 = entrada.next().toLowerCase();
                    elevador = 2;
                    break;
                } else if (elevador == 3) {
                    System.out.println("Andar: " + elevador);
                    System.out.println("Digite o nome de 3 moradores desse andar: ");
                    System.out.println("Primeiro morador: ");
                    nome1 = entrada.next().toLowerCase();
                    System.out.println("Segundo morador: ");
                    nome2 = entrada.next().toLowerCase();
                    System.out.println("Terçeiro morador: ");
                    nome3 = entrada.next().toLowerCase();
                    elevador = 3;
                    break;
                } else if (elevador == 4) {
                    System.out.println("Andar: " + elevador);
                    System.out.println("Digite o nome de 3 moradores desse andar: ");
                    System.out.println("Primeiro morador: ");
                    nome1 = entrada.next().toLowerCase();
                    System.out.println("Segundo morador: ");
                    nome2 = entrada.next().toLowerCase();
                    System.out.println("Terçeiro morador: ");
                    nome3 = entrada.next().toLowerCase();
                    elevador = 4;
                    break;
                } else if (elevador == 5) {
                    System.out.println("Andar: " + elevador);
                    System.out.println("Digite o nome de 3 moradores desse andar: ");
                    System.out.println("Primeiro morador: ");
                    nome1 = entrada.next().toLowerCase();
                    System.out.println("Segundo morador: ");
                    nome2 = entrada.next().toLowerCase();
                    System.out.println("Terçeiro morador: ");
                    nome3 = entrada.next().toLowerCase();
                    elevador = 5;
                    break;
                }
            }
        }
            if (nome1.equals("")||nome2.equals("")||nome3.equals("")){
                nome1 = "Gustavo";
                nome2 = "Debora";
                nome3 = "Henrique";
                elevador = 3;
                listaDeMoradores.add(nome1.toLowerCase());
                listaDeMoradores.add(nome2.toLowerCase());
                listaDeMoradores.add(nome3.toLowerCase());
            }

        System.out.println("Responda inserindo um dos números pré-definidos");
        System.out.println("1 - Morador\n2 - Visitante\n3 - Trabalhador/Serviços");
        int definicao = entrada.nextInt();
        String nome=null;
        if (definicao == 1){
            System.out.println("Nome: "+nome1+"\nNome: "+nome2+"\nNome: "+nome3);
            System.out.println("Você morador, poderia me dizer o seu nome?");
            nome = entrada.next();
            if (nome.equals(nome1)){
                System.out.println("Nome: "+nome);
                System.out.println("Andar "+elevador+" subindo!");
            }else if (nome.equals(nome2)) {
                System.out.println("Nome: "+nome);
                System.out.println("Andar " + elevador + " subindo!");
            }else {
                System.out.println("Nome: "+nome);
                System.out.println("Andar "+elevador+" subinido!");
            }
        }else if (definicao == 2) {
            System.out.println("Visitante seja, BEM VINDO!");
            System.out.println(listaDeMoradores);
            System.out.println("Poderia nos dizer o nome da pessoa que você veio visitar?");
            nome = entrada.next().toLowerCase();
            if (nome.equals(nome1)){
                System.out.println("Nome: "+nome);
                System.out.println("Andar "+elevador+" subindo!");
            }else if (nome.equals(nome2)) {
                System.out.println("Nome: "+nome);
                System.out.println("Andar " + elevador + " subindo!");
            }else {
                System.out.println("Nome: "+nome);
                System.out.println("Andar "+elevador+" subinido!");
            }
        }else if (definicao == 3){
            System.out.println("Trabalhador seja, BEM VINDO!\nTemos "+totalAndares+" deseja qual andar?");
            elevador = entrada.nextInt();
            totalAndares = (totalAndares - elevador);
            if (elevador > 5) System.out.println("Opção inválida, Temos somente 5 andares!"); elevador = 5;
        }
        System.out.println("Temos "+qtdElevador+" pessoas");

        Elevador elevador1 = new Elevador(
                totalAndares,
                elevador,
                qtdElevador,
                nome
        );

        System.out.println(elevador1.toString());

        System.out.println("\n\n\nDeseja descer?\n1 - Sim\n2 - Não");
        int descer = entrada.nextInt();

        if (descer == 1) {
            System.out.println("Quantas pessoas desejam descer no elevador:\nMáximo suportado: 5");
            pessoa = entrada.nextInt();
            if (pessoa < 5) {
                qtdElevador = pessoa;
            } else if (pessoa > 5) {
                System.out.println("Quantidade de pessoas indisponível!!");
                System.out.println("Só vai entrar 5 pessoas!!");
                pessoa = 5;
            }
            System.out.println("Digite um dos andares disponíveis\n Você está no : " + elevador);
            int andar = entrada.nextInt();
            if (andar == 4){
                System.out.println("Andar atual"+elevador+" descendo para o "+andar);
                elevador--;
                System.out.println("Andar atual"+elevador+" desceu para o "+andar);
            }else if (andar == 3) {
                System.out.println("Andar atual" + elevador + " descendo para o " + andar);
                elevador--;
                System.out.println("Andar atual" + elevador + " descendo para o " + andar);
                elevador--;
                System.out.println("Andar atual" + elevador + " desceu para o " + andar);
            }else if (andar == 2) {
                System.out.println("Andar atual" + elevador + " descendo para o " + andar);
                elevador--;
                System.out.println("Andar atual" + elevador + " descendo para o " + andar);
                elevador--;
                System.out.println("Andar atual" + elevador + " descendo para o " + andar);
                elevador--;
                System.out.println("Andar atual" + elevador + " desceu para o " + andar);
            }else if (andar == 1) {
                System.out.println("Andar atual" + elevador + " descendo para o " + andar);
                elevador--;
                System.out.println("Andar atual" + elevador + " descendo para o " + andar);
                elevador--;
                System.out.println("Andar atual" + elevador + " descendo para o " + andar);
                elevador--;
                System.out.println("Andar atual" + elevador + " descendo para o " + andar);
                elevador--;
                System.out.println("Andar atual" + elevador + " desceu para o " + andar);
            }else if (andar == 0) {
                System.out.println("Andar atual" + elevador + " descendo para o Terreo");
                elevador--;
                System.out.println("Andar atual" + elevador + " descendo para o Terreo");
                elevador--;
                System.out.println("Andar atual" + elevador + " descendo para o Terreo");
                elevador--;
                System.out.println("Andar atual" + elevador + " descendo para o Terreo");
                elevador--;
                System.out.println("Andar atual" + elevador + " descendo para o Terreo");
                elevador--;
                System.out.println("Andar atual" + elevador + " desceu para o Terreo");
            }else System.out.println("Número digitado está inválido");

        }else System.out.println("Agradeço a resposta, aguardo orientações!!!");

    }

    private int totalDeAndares;
    private int elevador;
    private int quantidadeElevador;
    private String usuario;

    public Elevador(int totalDeAndares, int elevador, int quantidadeElevador, String usuario) {
        this.totalDeAndares = totalDeAndares;
        this.elevador = elevador;
        this.quantidadeElevador = quantidadeElevador;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Elevador{" +
                "totalDeAndares=" + totalDeAndares +
                ", elevador=" + elevador +
                ", quantidadeElevador=" + quantidadeElevador +
                ", usuario='" + usuario + '\'' +
                '}';
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getQuantidadeElevador() {
        return quantidadeElevador;
    }

    public void setQuantidadeElevador(int quantidadeElevador) {
        this.quantidadeElevador = quantidadeElevador;
    }

    public int getElevador() {
        return elevador;
    }

    public void setElevador(int elevador) {
        this.elevador = elevador;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }
}
