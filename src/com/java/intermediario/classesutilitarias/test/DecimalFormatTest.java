package com.java.intermediario.classesutilitarias.test;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DecimalFormatTest {
    public static void main(String[] args) {
        String padrao = "###,###.##";
        DecimalFormat df = new DecimalFormat(padrao);
        //Alternativa para o método acima df.applyLocalizedPattern(padrao);
        //Alternativa para o método acima df.applyPattern(padrao);
        System.out.println(df.format(123546988787.3369));

        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt","Brazil"));
        dfs.setDecimalSeparator('.'); // indica que os decimais serão separados por ","
        dfs.setGroupingSeparator(','); // indica que o número será agrupado por pontos
        df = new DecimalFormat(padrao,dfs);
        System.out.println(df.format(123546988787.3369));

        String padrao2 = "###,###.##";
         df = new DecimalFormat(padrao2,dfs);
         df.setGroupingSize(2); // agrupa de 2 em 2
        System.out.println(df.format(123546988787.3369));
        //Também é possível utilizar o sinal de menos(-)
        // o código \u00A4 exibe o símbolo de moeda
        String padrao3 = "###,###,##.00"; // adiciona um zero
        df = new DecimalFormat(padrao3,dfs);
        System.out.println(df.format(123646.2));

    }
}
