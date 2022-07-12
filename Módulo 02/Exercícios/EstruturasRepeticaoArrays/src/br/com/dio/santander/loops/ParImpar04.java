package br.com.dio.santander.loops;

/*Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números
 pares e a quantidade de números impares.*/

import java.util.Scanner;

public class ParImpar04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0;
        int quantidadeImpares = 0;


        System.out.println("Me passe uma quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        int contador = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;

            contador++;


        } while (contador < quantidadeNumeros);

        System.out.println("Quantidade de números Pares: " + quantidadePares);
        System.out.println("Quantidade de números Impares: " + quantidadeImpares);


    }

}
