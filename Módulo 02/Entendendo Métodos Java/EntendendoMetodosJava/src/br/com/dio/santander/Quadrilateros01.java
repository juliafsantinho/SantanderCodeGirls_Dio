package br.com.dio.santander;

    /*  Exercicio 04 - Quadrilátero01  */

public class Quadrilateros01 {

    //Uma assinatura com um nome e um parâmetro
    public static void area(double lado) {

        System.out.println("A área do quadrado é: " + lado * lado);

    }
    //Uma assinatura com um nome e dois parâmetros
    public static void area(double lado1, double lado2) {

        System.out.println("A área do retângulo é: " + lado1 * lado2);

    }
    //Uma assinatura com um nome e três parâmetros
    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("A área do trapézio é: " + ((baseMaior+baseMenor)*altura) / 2);

    }

    public static void area(float diagonal1, float diagonal2) { // dois parametros mas com tipos de dados diferentes.

        System.out.println("A área do trapézio é: " + diagonal1 * diagonal2);

    }

}
