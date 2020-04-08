package com.java.intermediario.classesutilitarias.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MathTest {
    public static void main(String[] args) {
        /*
        Existem 4 opções de construtores
        1. Construtor padrão que utiliza as informações do próprio computador ou do próprio servidor
        2. Construtor em que se passa um padrão
        3. Construtor que aceita um Locale
        4. Construtor que aceita alguns símbolos
         */

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yy HH:mm:ss z");

        Calendar data = new GregorianCalendar(2010,2,21,12,11,30);

        System.out.println(sdf.format(data.getTime())); // retorna uma instância da classe Date
        Date hoje = new Date();
        String d = sdf.format(hoje); // transforma date em String

        String minhaData = "20/02/2020";
        // precisa ter o mesmo formato de minhaData
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yy");

        try {
            Date minhaDataEmDate = sdf2.parse(minhaData);// método parse pode gerar exceção
            System.out.println(minhaDataEmDate);
            System.out.println(sdf.format(minhaDataEmDate)); // passando como string
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
