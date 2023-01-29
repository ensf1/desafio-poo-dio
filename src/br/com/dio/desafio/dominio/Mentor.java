package br.com.dio.desafio.dominio;

public class Mentor extends Pessoa{
    public Mentor(String nome) {
        super(nome);
    }

    @Override
    public String getNome() {
        return "Mentor(a) "+super.getNome();
    }

}
