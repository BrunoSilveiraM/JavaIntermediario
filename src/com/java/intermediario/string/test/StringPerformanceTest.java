package com.java.intermediario.string.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio =  System.currentTimeMillis();
        concatString(500000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto : "+ (fim - inicio) + " MS");

        inicio = System.currentTimeMillis();
        concatStringBuilder(500000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com StringBuilder: "+ (fim - inicio)+" MS");

        inicio = System.currentTimeMillis();
        concatStringBuffer(500000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com StringBuffer: "+ (fim - inicio)+" MS");
    }

    private static void concatString(int tam){
        String string = "";
        for (int i = 0; i < tam; i++){
            string += i; // cada alteração gera um novo valor na memória
        }
    }

    private static void concatStringBuilder(int tam){
        StringBuilder sb = new StringBuilder(tam);
        for (int i = 0; i < tam; i++){
            sb.append(i); // cada alteração gera um novo valor na memória
        }
    }

    private static void concatStringBuffer(int tam){
        StringBuffer sb = new StringBuffer(tam);
        for (int i = 0; i < tam; i++){
            sb.append(i); // cada alteração gera um novo valor na memória
        }
    }
}
