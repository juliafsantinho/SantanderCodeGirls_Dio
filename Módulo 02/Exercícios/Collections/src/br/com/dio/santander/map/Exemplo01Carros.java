package br.com.dio.santander.map;

/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

//        Map carrosPopulares2020 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

import java.util.*;

public class Exemplo01Carros {

    public static void main(String[] args) {

        System.out.println("\nCrie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>() { //hashMap na implementação
            {
                put("Gol", 14.4);
                put("Uno", 15.6);
                put("Mobi", 16.1);
                put("Hb20", 14.5);
                put("Kwid", 15.6);
            }};

        System.out.println(carrosPopulares.toString());

        System.out.println("\nSubstitua o consumo do Gol por 15,2 km/l: ");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("\nExiba o consumo do uno: " + carrosPopulares.get("uno"));

        //  System.out.println("Exiba o terceiro modelo adicionado: "); //Não tem o método que possa realizar.

        System.out.println("\nExiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("\nExiba os consumos dos carros: ");
        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);

        System.out.println("\nExiba o modelo mais econômico e seu consumo: ");
        Double consumoEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String,Double>> entries = carrosPopulares.entrySet();
        String modeloEficiente = "";

        for (Map.Entry<String, Double> entry : entries){
            if (entry.getValue().equals(consumoEficiente)){
                modeloEficiente = entry.getKey();
                System.out.println("O modelo mais econômico é o " + modeloEficiente + " e seu consumo é " + consumoEficiente);
            }
        }

        System.out.println("\nExiba o modelo menos econômico e seu consumo: " );
        Double consumoIneficiente = Collections.min(carrosPopulares.values());
        String modeloIneficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoIneficiente)){
                modeloIneficiente = entry.getKey();
                System.out.println("O modelo menos econômico é o " + modeloIneficiente + " e o seu consumo é " + consumoIneficiente);
            }
        }

        //SOMA DOS CONSUMOS
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("\nA soma dos consumos totaliza " + soma);

        System.out.println("\nA média dos consumos desse dicionário de carros é de " + (soma/carrosPopulares.size()));

        System.out.println("\nA lista do dicionário de carros é: \n" + carrosPopulares);

        System.out.println("\nRemova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double>iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("\nExiba todos os carros na ordem em que foram informados: ");
        Map<String,Double> carrosPopulares1 = new LinkedHashMap<>() {{ // LinkedHashMap para a ordem informada
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("\nExiba o dicionário ordenado pelo modelo: ");
        Map<String,Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("\nApague o dicionário de carros... ");
        carrosPopulares.clear();

        System.out.println("\nO dicionário está vazio? " + carrosPopulares.isEmpty());


    }
}
