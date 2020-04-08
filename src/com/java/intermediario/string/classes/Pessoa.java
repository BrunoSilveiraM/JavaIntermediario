package com.java.intermediario.string.classes;

public class Pessoa {
    private int codigo;
    private int idade;
    private String nome;

    public Pessoa(){
        super();
    }
    public Pessoa(int codigo, int idade, String nome) {
        this.codigo = codigo;
        this.idade = idade;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "codigo=" + codigo +
                ", idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }
}
