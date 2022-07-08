package br.com.dio.santander;

import br.com.dio.santander.model.Gato;

public class PrimeiroProjetoIntelliJ {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("O Problema do Azul", 389);


       /*int a = 5;
       int b = 3;

        System.out.println("Hello World!" + (a+b));*/
    }

}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }
}
