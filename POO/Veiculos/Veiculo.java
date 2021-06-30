package POO.Veiculos;

public class Veiculo {
    protected String marca, modelo, cor, placa, tipoCambio, tipoCombustivel;
    protected int anoFabricacao, anoModelo;


    public void ligar(){
        System.out.println("O Veículo agora está ligado");
    }
    public void desligar(){
        System.out.println("O Veículo agora está desligado");
    }
    public void acelerar(){
        System.out.println("O Veículo agora está acelerando");
    }
    public void frear(){
        System.out.println("O Veículo agora está freando");
    }
    public void buzinar(){
        System.out.println("O Veículo agora está buzinando, FON FON!!!");
    }


    // Getrrs e Seters
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

}
