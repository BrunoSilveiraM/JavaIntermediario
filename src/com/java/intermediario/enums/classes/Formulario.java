package com.java.intermediario.enums.classes;

public class Formulario {

    enum Genero{
        FEMININO('F'),MASCULINO('M');

        private char valor;

        Genero(char valor){
            this.valor = valor;
        }

        public char getValor() {
            return valor;
        }

        @Override
        public String toString() {
            return "Genero{" +
                    "valor=" + valor +
                    '}';
        }
    }
    private String nome;
    private Genero genero;

    @Override
    public String toString() {
        return "Formulario{" +
                "nome='" + nome + '\'' +
                ", genero=" + genero +
                '}';
    }
}
