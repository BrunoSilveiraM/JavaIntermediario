package com.java.intermediario.expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        String regex = "([a-z])([^,])+";
        String exLista = "proj.bkp, proj1.java, trab3.c, calculo2.odt, proj1.docx";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(exLista);

        while(matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
