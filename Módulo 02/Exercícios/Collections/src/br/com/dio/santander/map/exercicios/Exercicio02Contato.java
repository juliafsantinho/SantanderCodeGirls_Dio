package br.com.dio.santander.map.exercicios;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

import static javax.swing.UIManager.put;

public class Exercicio02Contato {

    public static void main(String[] args) {

        System.out.println("\n-----\tOrdem Aleatória\t-----");
        Map<Integer,Contato> agenda = new HashMap<>() {{
                put(1, new Contato("Simba", 2222));
                put(4, new Contato("Cami", 5555));
                put(3, new Contato("Jon", 1111));
            }};
        System.out.println(agenda);
        for(Map.Entry<Integer,Contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n-----\tOrdem Inserção\t-----");
        Map<Integer,Contato> agenda2 = new LinkedHashMap<>() {{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
        System.out.println(agenda2);
        for (Map.Entry<Integer,Contato> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n-----\tOrdem Id\t-----");
        Map<Integer,Contato> agenda3 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer,Contato> entry: agenda3.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n-----\tOrdem número telefone\t-----");
        Set<Map.Entry<Integer,Contato>> set = new TreeSet<>(new ComparatorNumero());
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }

        System.out.println("\n-----\tOrdem nome contato\t-----");
        Set<Map.Entry<Integer,Contato>> set2 = new TreeSet<>(new ComparatorNome());
        set2.addAll(agenda.entrySet());
        for (Map.Entry<Integer,Contato> entry: set2) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }

}

class ComparatorNumero implements Comparator<Map.Entry<Integer,Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
        return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
    }
}

class ComparatorNome implements Comparator<Map.Entry<Integer,Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> n1, Map.Entry<Integer, Contato> n2) {
        return n1.getValue().getNome().compareToIgnoreCase(n2.getValue().getNome());
    }
}
