package POO.UsandoVeiculo;


import POO.Veiculos.Moto;
import java.util.Scanner;

public class UsandoMoto  {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite as seguintes informações sobre a moto");

        Moto motoca = new Moto("Yamaha","Kawasaki", "Verde" );
        System.out.println(motoca.getCor());
        motoca.setCor("Rosa");
        System.out.println(motoca.getCor());
        motoca.buzinar();
        motoca.empinar();

    }
}
