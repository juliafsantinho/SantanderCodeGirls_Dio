package br.com.dio.santander.loops;

/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue
pedindo até que o usuário informe um valor válido.*/

import java.util.Scanner;

public class Nota02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Passe uma nota de 0 à 10: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Valor incorreto, digite novamente uma nota de 0 à 10: ");
            nota = scan.nextInt();
        }

    }
}
