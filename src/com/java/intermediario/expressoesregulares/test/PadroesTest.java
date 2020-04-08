package com.java.intermediario.expressoesregulares.test;

import com.java.intermediario.expressoesregulares.classes.RegexData;
import com.java.intermediario.expressoesregulares.classes.RegexEmail;


public class PadroesTest {
    public static void main(String[] args) {
        String emailsValidados;
        RegexEmail emails = new RegexEmail("bruno@hotmail.com , #@!aba@outlook.com , " +
                "$$@gmail.com , " + "leticia@gmail.com , " +
                "leticiaMeuAmor@gmail.com.br, #242abcde@yahoo.com.br.br");
        emailsValidados = emails.valoresValidados();
        System.out.print(emailsValidados);

        String datasValidadas;
        RegexData datas = new RegexData("20/02/2014, 20/2/2014, 20/2/14, 2/20/15, 20/02/15");
        datasValidadas = datas.separaValida();
        System.out.println(datasValidadas);
    }
}
