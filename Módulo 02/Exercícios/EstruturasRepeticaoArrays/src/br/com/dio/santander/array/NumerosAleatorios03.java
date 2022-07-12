package br.com.dio.santander.array;

/* Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final, mostre os números e seus sucessores.*/

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios03 {

    public static void main(String[] args) {

        //classe que gera números aleatórios
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros aleatorios:");
        for (int numero: numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores dos numeros aleatorios:");
        for (int numero: numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

        System.out.println("\nAntecessores dos numeros aleatorios:");
        for (int numero: numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }
    }
}
