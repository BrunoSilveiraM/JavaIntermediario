package com.java.intermediario.expressoesregulares.test;

public class TokenTest {
    public static void main(String[] args) {
        String nomes = "Letícia9, Bruno, Ricardo, Marcia";
        String[] arrStr = nomes.split(","); //Considera a vírgula como delimitador

        for(String x : arrStr) {
            System.out.println(x.trim()); // Elimina espaços em branco
        }

    }
}
