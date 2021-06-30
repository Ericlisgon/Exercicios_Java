package POO.UsandoVeiculo;

import POO.Veiculos.Carro;

import java.util.Scanner;

public class UsarCarro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\t\t\tDigite as seguintes informações sobre o carro");
        //System.out.println("Marca, Modelo, Cor, Tipo de Câmbio, Tipo de Combustível, Ano de Fabricação e o Ano do Modelo");
        String marca ="", modelo = "", cor = "", cambio = "", combutivel = "";
        int anoFab = 0000, anoMod = 0000;

        System.out.println("Escreva o nome marca que deseja gravar no Sistema!");
        System.out.println("Toyota\nVolkswagen\nFord\nHonda\nHyundai\nResposta:");
        marca = entrada.nextLine();
        marca.toLowerCase();

        if (marca.toLowerCase().equals("toyota")){
            System.out.println("Escreva uma das opções de carros abaixo!\nCorolla\nHilux\nEtios\nRAV4\nSW4");
            modelo = entrada.nextLine();
            modelo.toLowerCase();
            if (modelo!="corolla"||modelo!="hilux"||modelo!="etios"||modelo!="rav4"||modelo!="sw4") {
                System.out.println("Poderia escrever a cor do carro:");
                cor = entrada.nextLine();
                System.out.println("Poderia nos infomar o câmbio: Manuel ou Automático");
                cambio = entrada.nextLine();
                System.out.println("Poderia nos infomar o Tipo de combustível: \nFlex, Gasolina ou Álcool.");
                combutivel = entrada.nextLine();
                System.out.println("Poderia nos infomar o ano de frabricação: ");
                anoFab = entrada.nextInt();
                System.out.println("Poderia nos infomar o ano do modelo: ");
                anoMod = entrada.nextInt();
            }
        }
        else if (marca.toLowerCase().equals("volkswagen")){
            System.out.println("Escreva uma das opções de carros abaixo!\nOnix\nGol\nUp\nGolf\nTiguan");
            modelo = entrada.nextLine();
            modelo.toLowerCase();
            if (modelo!="onix"||modelo!="gol"||modelo!="up"||modelo!="golf"||modelo!="tiguan") {
                System.out.println("Poderia escrever a cor do carro:");
                cor = entrada.nextLine();
                System.out.println("Poderia nos infomar o câmbio: Manuel ou Automático");
                cambio = entrada.nextLine();
                System.out.println("Poderia nos infomar o Tipo de combustível: \nFlex, Gasolina ou Álcool.");
                combutivel = entrada.nextLine();
                System.out.println("Poderia nos infomar o ano de frabricação: ");
                anoFab = entrada.nextInt();
                System.out.println("Poderia nos infomar o ano do modelo: ");
                anoMod = entrada.nextInt();
            }else System.out.println("Esse modelo não existe!");
        }
        else if (marca.toLowerCase().equals("ford")){
            System.out.println("Escreva uma das opções de carros abaixo!\nKa\nMustang\nEcosport\nRanger\nMaverick");
            modelo = entrada.nextLine();
            modelo.toLowerCase();
            if (modelo!="ka"||modelo!="mustang"|modelo!="ecosport"||modelo!="ranger"||modelo!="maverick") {
                System.out.println("Poderia escrever a cor do carro:");
                cor = entrada.nextLine();
                System.out.println("Poderia nos infomar o câmbio: Manuel ou Automático");
                cambio = entrada.nextLine();
                System.out.println("Poderia nos infomar o Tipo de combustível: \nFlex, Gasolina ou Álcool.");
                combutivel = entrada.nextLine();
                System.out.println("Poderia nos infomar o ano de frabricação: ");
                anoFab = entrada.nextInt();
                System.out.println("Poderia nos infomar o ano do modelo: ");
                anoMod = entrada.nextInt();
            }else System.out.println("Esse modelo não existe!");
        }
        else if (marca.toLowerCase().equals("honda")){
            System.out.println("Escreva uma das opções de carros abaixo!\nCivic\nCity\nAccord\nFit\nHRV");
            modelo = entrada.nextLine();
            modelo.toLowerCase();
            if (modelo!="civic"||modelo!="city"||modelo!="accord"||modelo!="fit"||modelo!="hrv") {
                System.out.println("Poderia escrever a cor do carro:");
                cor = entrada.nextLine();
                System.out.println("Poderia nos infomar o câmbio: Manuel ou Automático");
                cambio = entrada.nextLine();
                System.out.println("Poderia nos infomar o Tipo de combustível: \nFlex, Gasolina ou Álcool.");
                combutivel = entrada.nextLine();
                System.out.println("Poderia nos infomar o ano de frabricação: ");
                anoFab = entrada.nextInt();
                System.out.println("Poderia nos infomar o ano do modelo: ");
                anoMod = entrada.nextInt();
            }
        }
        else if (marca.toLowerCase().equals("hyundai")){
            System.out.println("Escreva uma das opções de carros abaixo!\ni30\nix35\nAzera\nHB20\nCreta");
            modelo = entrada.nextLine();
            modelo.toLowerCase();
            if (modelo!="i30"||modelo!="ix35"||modelo!="azera"||modelo!="hb20"||modelo!="creta") {
                System.out.println("Poderia escrever a cor do carro:");
                cor = entrada.nextLine();
                System.out.println("Poderia nos infomar o câmbio: Manuel ou Automático");
                cambio = entrada.nextLine();
                System.out.println("Poderia nos infomar o Tipo de combustível: \nFlex, Gasolina ou Álcool.");
                combutivel = entrada.nextLine();
                System.out.println("Poderia nos infomar o ano de frabricação: ");
                anoFab = entrada.nextInt();
                System.out.println("Poderia nos infomar o ano do modelo: ");
                anoMod = entrada.nextInt();
            }else System.out.println("Esse modelo não existe!");
        }
        else System.out.println("Opção escolhida indisponivel!!");

        Carro carro = new Carro(marca, modelo , cor, cambio,combutivel,anoFab,anoMod);
        carro.setPlaca("AUD-3201");

        System.out.println("O carro foi criado com as seguintes informações");
        System.out.println("Marca: "+carro.getMarca());
        System.out.println("Modelo: "+carro.getModelo());
        System.out.println("Cor: "+carro.getCor());
        System.out.println("Tipo do Câmbio: "+carro.getTipoCambio());
        System.out.println("Tipo de Combustível: "+carro.getTipoCombustivel());
        System.out.println("Ano de Fabricação: "+carro.getAnoFabricacao());
        System.out.println("Ano do Modelo: "+carro.getAnoModelo());
        System.out.println("Sua placa: "+carro.getPlaca());

        carro.ligarArcondicionado();
        carro.buzinar();
    }
}
