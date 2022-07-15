package br.com.dio.santander.set.exercicios;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

import java.util.*;

public class Exercicio01ArcoIris {

    public static void main(String[] args) {


        System.out.println("\nCrie um conjunto contendo as cores do arco-íris: ");

        Set<String> arcoIris = new HashSet<>();
        arcoIris.add("Violeta");
        arcoIris.add("Anil");
        arcoIris.add("Azul");
        arcoIris.add("Verde");
        arcoIris.add("Amarelo");
        arcoIris.add("Laranja");
        arcoIris.add("Vermelho");
        System.out.println(arcoIris);


        System.out.println("\nExiba todas as cores o arco-íris uma abaixo da outra: ");

        for (String cor : arcoIris) {
            System.out.println(cor);
        }


        System.out.println("\nA quantidade de cores que o arco-íris tem: " + arcoIris.size());


        System.out.println("\nExiba as cores em ordem alfabética: ");

        Set<String> arcoIris2 = new TreeSet<>(arcoIris);
        System.out.println(arcoIris2);


        System.out.println("\nExiba as cores na ordem informada: ");

        Set<String> arcoIris3 = new LinkedHashSet<>(
                Arrays.asList("Violeta", "Anil", "Azul", "Verde", "Amarelo", "Laranja", "Vermelho"));
        System.out.println(arcoIris3);


        /*System.out.println("\nExiba as cores na ordem inversa da que foi informada ");
        List<String> arcoIrisList = new ArrayList<>(arcoIris3);
        Collectios.reverse(arcoIrisList);
        System.out.println(arcoIrisList);*/


        System.out.println("\nExiba todas as cores que começam com a letra ”v”: ");

        for (String cor: arcoIris) {
            if(cor.startsWith("v")) System.out.println(cor);
        }


        System.out.println("\nRemova todas as cores que não começam com a letra “v”: ");

        Iterator<String> iterator2 = arcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("V")) iterator2.remove();
        }
        System.out.println(arcoIris);


        System.out.println("\nLimpe o conjunto: ");

        arcoIris.clear();


        System.out.println("\nConfira se o conjunto está vazio: " + arcoIris.isEmpty());

    }
}
