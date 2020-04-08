package com.java.intermediario.expressoesregulares.test;

import com.java.intermediario.expressoesregulares.classes.RegexPadraoEmail;

public class RegexPadraoTest {
    public static void main(String[] args) {
        String emails = "bruno@hotmail.com , #@!aba@outlook.com , $$@gmail.com , leticia@gmail.com, " +
                "leticiaMeuAmor@gmail.com.br, #242abcde@yahoo.com.br.br";
        RegexPadraoEmail lista1 = new RegexPadraoEmail(emails);
        lista1.validaEmails();
        String[] emailsValidados = lista1.getEmailsValidos();

        for(String valores : emailsValidados){
            if(valores != null)
                System.out.println(valores);
        }
    }
}
