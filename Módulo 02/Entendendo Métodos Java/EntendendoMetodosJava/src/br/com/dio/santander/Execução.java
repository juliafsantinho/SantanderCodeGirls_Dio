package br.com.dio.santander;

/*  Execução exercício 01 - Calculadora  */
/*  Execução exercício 02 - Mensagem  */
/*  Execução exercício 03 - Empréstimo  */

import java.util.Scanner;

public class Execução {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Calculadora
        System.out.println("Calculadora");
        int a,b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();


        Calculadora.soma(a,b);
        Calculadora.subtracao(a,b);
        Calculadora.multiplicao(a,b);
        Calculadora.divisao(a,b);


        //Mensagem
        System.out.println("\nTenho uma mensagem para você!");

        int hora;
        System.out.println("Digite a hora: ");
        hora = scan.nextInt();
        Mensagem.obterMensagem ( hora);


        //Empréstimo
        System.out.println("\nExercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);



    }
}
