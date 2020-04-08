package com.java.intermediario.enums.test;

import com.java.intermediario.enums.classes.DiaSemana;

public class TestEnum2 {
    public static void main(String[] args) {
        System.out.println(Enum.valueOf(DiaSemana.class,"DOMINGO"));
        // retorna o valor DOMINGO para a variável dia
        // se fosse colocado qualquer Domingo no lugar de DOMINGO seria acusado erro que não se encontra
        // a string Domingo no enum DiaSemana
        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

        System.out.println(dia);
    }
}
