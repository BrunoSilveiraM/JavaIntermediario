package com.java.intermediario.classesutilitarias.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestResourceBundle {
    public static void main(String[] args) {
        System.out.println("Locale atual : "+ Locale.getDefault());
        // ler arquivo resource bundle
        ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
        System.out.println("Olá : "+rb.getString("hello"));//
        System.out.println("Mundo : "+rb.getString("world"));

        Locale.setDefault(new Locale("pt_BR", "pt_BR"));
        // como o Locale foi setado para pt_BR, a linguagem java vai procurar o meu-texto_pt_BR
        rb = ResourceBundle.getBundle("meu-texto");

    }
}
