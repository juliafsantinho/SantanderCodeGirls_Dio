package br.com.dio.santander.estrutura;

public class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public Carro() {

    }

    public String getCor() {    //Retornar o atributo
        return cor;
    }

    public void setCor(String cor) {    //Colocar o atributo
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}
