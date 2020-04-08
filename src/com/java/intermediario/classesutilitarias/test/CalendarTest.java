package com.java.intermediario.classesutilitarias.test;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance(); // singleton
        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        //é possível formatar a data com print
        System.out.printf("Hoje é : %02d/%02d/%02d\n",dia,mes + 1,ano);
        //Método add adiciona valores ao atributos
        hoje.add(Calendar.YEAR,1);
        System.out.println(hoje.get(Calendar.YEAR));
        //Para subtrair utiliza valores negativos.
        hoje.add(Calendar.YEAR,-1);
    }
}
