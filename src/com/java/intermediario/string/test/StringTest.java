package com.java.intermediario.string.test;

public class StringTest {
    public static void main(String[] args) {
        //Criar string a partir de cadeia de caracteres
        char[] cadeiaCaracter = {'B','E','N','G','I','L'};
        String cadeiaChar = new String(cadeiaCaracter);
        System.out.println(cadeiaChar);
        //Criar string a partir de intervalo de cadeias de caractere
        char[] abcdef = {'A','B','C','D','E','F'};
        String abc = new String(abcdef, 0,3);
        System.out.println(abc);
        //Array de byte, cada byte representa um caractere da tabela ascii
        byte[] ascii = {65,66,67,68,69};
        String abcde = new String(ascii);
        System.out.println(abcde);
        String cde = new String(ascii,1,3);
        System.out.println(cde);
        //Atribuição sem o new
        String let = "Letícia";
        String lettis = "Letícia";
        System.out.println(let);
    }
}
