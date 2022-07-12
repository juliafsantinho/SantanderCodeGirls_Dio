package br.com.dio.santander.loops;

/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Tabuada05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tabuada você quer ver?");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada do número " + tabuada + ": ");

            //contador; repetição; incremento
        for (int i = 1; i <= 10; i++){
            System.out.println(tabuada + "x" + i + " = " + (tabuada * i));
        }
    }

}
