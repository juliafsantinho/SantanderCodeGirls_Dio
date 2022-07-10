package br.com.dio.santander;

/*  Execução exercício 04 - Quadrilátero01  */

public class QuadrilateroExecucao {

    public static void main(String[] args) {

        //Exercicio 04 - Quadrilátero01
        System.out.println("Execução Exercício Quadrilátero");
        Quadrilateros01.area(3);
        Quadrilateros01.area(5,5);
        Quadrilateros01.area(7,8,9);
        Quadrilateros01.area(3f,5f);

        //Exercício 05 - Quadrilateros02
        System.out.println("Exercício retornos");
        double areaQuadrado = Quadrilateros02.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);
        double areaRetangulo = Quadrilateros02.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);
        double areaTrapezio = Quadrilateros02.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);




    }


}
