package POO.Veiculos;

public class Bicicleta extends Veiculo{

    @Override
    public void ligar() {
        System.out.println("Você começou a pedalar!!");
    }

    @Override
    public void desligar() {
        System.out.println("Você parou de pedalar!!");
    }

    @Override
    public void acelerar() {
        System.out.println("Você está pedalando mais rápido!!");
    }

    @Override
    public void frear() {
        System.out.println("Você está pedalando mais devagar!!");
    }

    @Override
    public void buzinar() {
        System.out.println("BRIN BRIN!!!");
    }
}
