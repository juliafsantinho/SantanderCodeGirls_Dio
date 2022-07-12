package br.com.dio.santander.loops;

/*Faça um programa que leia 5 números e informe o maior número e a média desses números.*/

import java.util.Scanner;

public class MaiorMedia03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int contador = 0;
        int maiorNumero = 0;
        int soma = 0;
        int media;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            soma = soma + numero;
            media = soma / 5;

            if (numero > maiorNumero) maiorNumero = numero;

            contador = contador + 1;


        } while (contador < 5);

        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("A média dos números é: " + media );

    }
}
