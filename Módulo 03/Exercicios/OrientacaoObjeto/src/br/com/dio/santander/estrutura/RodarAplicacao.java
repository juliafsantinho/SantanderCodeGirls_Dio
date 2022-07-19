package br.com.dio.santander.estrutura;

import br.com.dio.santander.relações.exerc1_heranca.Veiculo;

public class RodarAplicacao extends Veiculo {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Elantra");
        carro1.setCapacidadeTanque(50);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.50));

        Carro carro2 = new Carro();

        carro2.setCor("Preto");
        carro2.setModelo("\nVoyage");
        carro2.setCapacidadeTanque(55);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(7.85));


    }
}
