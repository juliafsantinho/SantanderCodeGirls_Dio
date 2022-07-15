package br.com.dio.santander.set.exercicios;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

import java.util.*;

public class Exercício02Linguagem {

    public static void main(String[] args) {

        Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "Eclipse"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Python", 1991, "Pycharm"));

        System.out.println("\n------- Ordem de Inserção -------");
        Set<LinguagemFavorita> linguagemFavoritas1 = new LinkedHashSet<>(
                Arrays.asList(
                        new LinguagemFavorita("Java", 1991, "Eclipse"),
                        new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"),
                        new LinguagemFavorita("Python", 1991, "Pycharm")
                )
        );

        for (LinguagemFavorita linguagem : linguagemFavoritas1) System.out.println(linguagem);

        System.out.println("\n-------- Ordem Natural: Nome --------");
        Set<LinguagemFavorita> linguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : linguagensFavoritas2) System.out.println(linguagem);

        System.out.println("\n-------- Ordem IDE --------");
        Set<LinguagemFavorita> linguagensFavoritas3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        linguagensFavoritas3.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : linguagensFavoritas3) System.out.println(linguagem);

        System.out.println("\n-------- Ordem Ano de Criacao e Nome --------");
        Set<LinguagemFavorita> linguagensFavoritas4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
        linguagensFavoritas4.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : linguagensFavoritas4) System.out.println(linguagem);

        System.out.println("\n-------- Ordem Nome - Ano de Criacao - IDE --------");
        Set<LinguagemFavorita> linguagensFavoritas5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
        linguagensFavoritas5.addAll(linguagensFavoritas3);
        for (LinguagemFavorita linguagem : linguagensFavoritas5) System.out.println(linguagem);


    }
}




class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    public String nome;
    public Integer anoDeCriacao;
    public String ide;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
    this.nome = nome;
    this.anoDeCriacao = anoDeCriacao;
    this.ide = ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }
}




class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.ide.compareToIgnoreCase(l2.ide);
    }
}




class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int anoDeCriacao = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return l1.nome.compareToIgnoreCase(l2.nome);
    }
}





class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.nome.compareToIgnoreCase(l2.nome);
        int anoDeCriacao = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
        if (nome != 0) return nome;
            if (anoDeCriacao != 0) return anoDeCriacao;
        return l1.ide.compareToIgnoreCase(l2.ide);
    }
}


