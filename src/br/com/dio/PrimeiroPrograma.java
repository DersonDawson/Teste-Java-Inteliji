package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Object gato = new Gato();
        System.out.println(gato);

        Object book1 = new Livro("O problema da rola", 300);
        System.out.println(book1);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello Wolrd! " + (a+b));*/
    }
}


class Livro{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(numPaginas, livro.numPaginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numPaginas);
    }
}