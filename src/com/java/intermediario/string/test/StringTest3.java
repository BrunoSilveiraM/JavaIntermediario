package com.java.intermediario.string.test;

import com.java.intermediario.string.classes.Pessoa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTest3 {
    public static void main(String[] args) {
        String doArquivo = "1;30;Letícia";
        //Argumento 1: Qual a String que se quer extrair informações.
        //Argumento 2: Delimitador
        StringTokenizer st = new StringTokenizer(doArquivo,";");
        //Enquanto houver tokens se extrai informações
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken()); //extrai informação
        }
    }
}
