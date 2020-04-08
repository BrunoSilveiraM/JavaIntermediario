package com.java.intermediario.enums.test;

import com.java.intermediario.enums.classes.Data;
import com.java.intermediario.enums.classes.DiaSemana;

public class TestEnum {
    public static void main(String[] args) {
        // cria uma array com os valores do enumerado
        DiaSemana[] dias = DiaSemana.values();

        for(DiaSemana dia: dias){
            System.out.println(dia);
        }
    }
}
