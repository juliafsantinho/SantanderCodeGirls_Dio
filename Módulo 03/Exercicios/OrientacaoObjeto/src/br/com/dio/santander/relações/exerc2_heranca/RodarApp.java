package br.com.dio.santander.relações.exerc2_heranca;

public class RodarApp {

    public static void main(String[] args) {

        Funcionário funcionario = new Funcionário();

        Funcionário gerente = new Gerente();         //UPCAST
        Funcionário vendedor = new Vendedor();      //UPCAST
        Funcionário faxineiro = new Faxineiro();    //UPCAST

        //Gerente gerente_ = (Gerente) new Funcionário();     //DOWNCAST NÃO É ACONSELHADO TRABALHAR EM O.O, POIS VAI DAR ERRO
       // Vendedor vendedor_ = (Vendedor) new Funcionário();  //DOWNCAST NÃO É ACONSELHADO TRABALHAR EM O.O, POIS VAI DAR ERRO
    }
}
