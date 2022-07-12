package br.com.dio.santander.loops;

import java.util.Scanner;

public class NumerosInteiros07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scan.nextInt();

        System.out.print("Digite o segundo número:: ");
        int segundoNumero = scan.nextInt();

        int soma = 0;

        if (primeiroNumero < segundoNumero) {
            for (int i = primeiroNumero+1; i < segundoNumero; i++) {
                soma += i;
            }
        } else if (primeiroNumero > segundoNumero) {
            for (int i = primeiroNumero-1; i > segundoNumero; i--) {
                soma += i;
            }
        }
        System.out.println("A soma dos números entre "+ primeiroNumero + " e " + segundoNumero + " é " + soma);
    }
}


