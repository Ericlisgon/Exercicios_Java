package POO.Veiculos;

public class Carro extends Veiculo{


    public Carro(String marca, String modelo, String cor, String tipoCambio, String tipopCombustivel, int anoFabricacao, int anoModelo){
        setMarca(marca);
        setModelo(modelo);
        setCor(cor);
        setTipoCambio(tipoCambio);
        setTipoCombustivel(tipopCombustivel);
        setAnoFabricacao(anoFabricacao);
        setAnoModelo(anoModelo);
    }

    public void ligarArcondicionado() {
        System.out.println("O ar-condicionado está sendo ligado!");
    }

    @Override
    public void buzinar() {
        System.out.println("O Carro está buzinando, FON FON FON FON FON!!!");
    }
}