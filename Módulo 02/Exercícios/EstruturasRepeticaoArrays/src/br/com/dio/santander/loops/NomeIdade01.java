package br.com.dio.santander.loops;

/*Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo
representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome)*/

import java.util.Scanner;

public class NomeIdade01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Digite o nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Digite a idade: "); // ctrl + d repete a linha
            idade = scan.nextInt();
        }

        System.out.println("Fim do laço de repetição.");


    }

}
