package POO.Veiculos;

public class Moto extends Veiculo{

    public Moto(String marca, String modelo, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public void empinar() {
        System.out.println("Você está empinando a moto!!!");
    }

    @Override
    public void buzinar() {
        System.out.println("A moto está buzinando, BI BI BI BI!!!");
    }
}
