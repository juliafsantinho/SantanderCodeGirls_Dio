package br.com.dio.santander;

/*Classe de exemplo para o exercício da Aula 1 de Variáveis, Tipos de Dado e Operadores aritméticos.*/

public class Exercitando01 {

    public static void main(String[] args) { /*Método main é o ais simples e o ponto inicial para as execuções em Java,*/

        int i; // ok 	São case-sensitive
        /*int i; Não se pode repetir a variável*/
        int I; // ok 	São case-sensitive
       /* int 1a; Não pode iniciar o nome da variável com número */
        int _1a; // fere a boa prática
        int $aq; // fere a boa prática

        i = 5;
        I = 10;
        _1a = 20; // fere a boa prática
        $aq = 7; // fere a boa prática

        final int j = 10; // variável final é constante
       // j = 15; não poderá ser mudada pois é constante
        int asrn24678nd; //ok
       // int asrn246 78nd; // dá erro pelo espaço no nome da variável
        int asrn24$678_nd = 10; // ok, mas fere a boa prática
        //int asrn246%78nd = 15; // dá erro pelo uso do %

        asrn24678nd = 100;
       // asrn24$678_nd = 10;

        int quantidadeProduto = 50; //ok
        //int QuantidadeProduto; // ok, mas fere a boa prática
        final int NUMERO_TENTATIVAS = 5; //ok, mas fere a boa prática
       // final int numeroTentativas = 5; //ok, mas fere a boa prática
        int QUANTIDADE_OPCOES = 25; //ok, mas fere a boa prática
      //  int qtdProd; // ok, mas fere a boa prática, sem exprecividade

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);


        System.out.println(j);
        System.out.println(asrn24678nd);
        System.out.println(asrn24$678_nd);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);



    }

}
