package br.com.dio.desafio.dominio;

public abstract class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }
    public Pessoa(String nome){
        this.nome = nome;
    }
}
