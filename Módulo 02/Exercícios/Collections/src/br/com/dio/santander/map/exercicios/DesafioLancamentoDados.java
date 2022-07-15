package br.com.dio.santander.map.exercicios;

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */

import java.util.*;

public class DesafioLancamentoDados {

    public static void main(String[] args) {

        int quantLancamentos = 100;

        List<Integer> valores = new ArrayList<>();
        Random geradorDeLancamentos = new Random();
            for (int i = 0; i < quantLancamentos; i++) {
                int numero = geradorDeLancamentos.nextInt(6) + 1;
                valores.add(numero);
            }

        Map<Integer,Integer> lancamentos = new HashMap<>();
            for (Integer resultado : valores) {
                if (lancamentos.containsKey(resultado))
                    lancamentos.put(resultado, (lancamentos.get(resultado) + 1));
                else lancamentos.put(resultado,1);
            }

        System.out.print("Jogando os dados.");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(3000);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nValor " + " Quant. de vezes");
        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }
    }
}
