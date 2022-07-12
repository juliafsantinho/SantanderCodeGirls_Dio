package br.com.dio.santander.array;

/*Faça um Programa que leia um vetor de 6 números inteiros e mostre-os na ordem inversa.*/

public class OrdemInversa01 {

    public static void main(String[] args) {

        int[] vetor = {-2, 3, 5, 8, 9, 15};

        System.out.println("\nA quantidade de números que temos em nosso vetor é: " + vetor.length); // o tamanho do vetor, quantos elementos tem dentro dele.

        System.out.print("Vetor ordem original: ");
        int countador =0;
        while(countador < (vetor.length)) {
            System.out.print(vetor[countador] + " ");
            countador++;
        }

        System.out.print("\nVetor invertido: ");
        for(int i = (vetor.length - 1); i >= 0; i --) {
            System.out.print(vetor[i] + " ");
        }

    }

}
