package br.com.dio.santander.loops;

/*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
* Ex.: 5!=5.4.3.2.1=120 */

import java.util.Scanner;

public class Fatorial06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int multiplicacao = 1;

        for (int i = fatorial; i >= 1; i--){
            multiplicacao = multiplicacao * i;

        }
        System.out.println(fatorial + "! = " + multiplicacao);

    }

}
