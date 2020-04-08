package com.java.intermediario.classesutilitarias.test;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale us = new Locale("us","USA");
        //seta o local como padrão
        Locale.setDefault(us);
        System.out.println(Locale.getDefault());
        //Usando NumberFormat
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.CANADA);
        System.out.println(nf.format(100000d)); //imprime 100,000.00
    }

}
