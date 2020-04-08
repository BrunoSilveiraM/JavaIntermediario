package com.java.intermediario.classesutilitarias.test;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        //Diferenças de representação decimal:
        //1.000,00 - Brasil
        //1,000.00 - EUA
        Locale en = new Locale("en", "United States");
        NumberFormat nf = NumberFormat.getInstance(en);

        String num = nf.format(100.99); // imprime 100.99, pois Locale está em en
        System.out.println(num);

        Locale br = new Locale("pt", "Brazil");

        nf = NumberFormat.getInstance(br);
        num = nf.format(100.99);
        System.out.println(num);//imprime 100.99

        //MOEDA, CurrencyInstance é da moeda
        NumberFormat moeda = NumberFormat.getCurrencyInstance(en);
        String valor = moeda.format(100.99);
        System.out.println(valor);
        //É preciso passar getDefault para Java ser mais preciso
        moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        Currency currency = moeda.getCurrency();
        System.out.println(currency);

        //PORCENTAGEM
        NumberFormat porcent = NumberFormat.getPercentInstance();//usa locale padrão
        String porcentagem = porcent.format(99.987); // 99.98 / 100 transformado em porcentagem
        System.out.println(porcentagem);

        //Definindo o máximo de casas decimais na porcentagem
        porcent.setMaximumIntegerDigits(5);
        porcent.setMinimumIntegerDigits(4);

        porcent.setMaximumFractionDigits(3);
        porcent.setMinimumFractionDigits(2);
        porcentagem = porcent.format(99.987);
        //Faltando número, java adiciona zero na esquerda para formatar de acordo com o limite
        System.out.println(porcentagem);

        //ARREDONDAMENTO
        nf = NumberFormat.getInstance();
        //RoundingMode é um enumerador, só funciona o arredonamento se for feito o setMaximum e Minimum
        nf.setRoundingMode(RoundingMode.DOWN); // existem vários tipos de arredondamento
        //Assegura não ter casa decimal
        nf.setMaximumFractionDigits(0);
        nf.setMinimumFractionDigits(0);
        System.out.println(nf.format(99.8888));

        //Outro exemplo de formatação(Passando String como parâmetro)
        try {
            Number numF = nf.parse("100,00"); // como Locale está pt-Br, então exibe 100
            System.out.println(numF.intValue());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
