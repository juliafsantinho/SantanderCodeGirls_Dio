package br.com.dio.santander;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int soma = soma (a,b);
        int multiplicacao = multiplicacao(a,b);
        int subtracao = subtracao(a,b);
        int divisao = divisao(a,b);

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A subtração dos números é: " + subtracao);
        System.out.println("A multiplicação dos números é: " + multiplicacao);
        System.out.println("A divisão dos números é: " + divisao);


        scan.close();
    }

    public static int soma(int a, int b) {
        return a + b;
    }
    public static int subtracao(int a, int b) {
        return a - b;
    }
    public static int divisao(int a, int b) {
        return a / b;
    }
    public static int multiplicacao(int a, int b) {
        return a * b;
    }

}
