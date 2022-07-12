package br.com.dio.santander.loops;

/*Faça um programa que receba dois números inteiros e gere os números inteiros que
estão no intervalo compreendido por eles.*/

import java.util.Scanner;

public class NumerosInteiros06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = scan.nextInt();

        if (primeiroNumero < segundoNumero) {
            for (int i = primeiroNumero+1; i < segundoNumero; i++) {
                System.out.print(i + " ");
            }
        } else if (primeiroNumero > segundoNumero) {
            for (int i = primeiroNumero-1; i > segundoNumero; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
