package com.java.intermediario.classesutilitarias.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestDate {
    public static void main(String[] args) {
        diferencaDataJava7();
        System.out.println("------------");
        diferencaDataJava8();
        System.out.println("------------");
        diferencaDataTempoJava8();
        System.out.println("------------");
        diferencaDataJava8ChronoUnit();
    }
    public static void diferencaDataJava7(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date primeiraDt = sdf.parse("01/01/2019");
            Date segundaDt = sdf.parse("01/02/2019");
            /*
            retorna a qtd de millisegundos na data e com essa qtd é possível verificar e pegar a diferença
            entre datas
             */
            long diffMilli = Math.abs(segundaDt.getTime() - primeiraDt.getTime());
            /*
            Utiliza a classe TimeUnit para conseguir a diferença entre dias e converte, passando a
            duração e millisegundos e o tipo
            ESSA VERSÃO É MAIS MODERNA
             */
            long diff = TimeUnit.DAYS.convert(diffMilli, TimeUnit.MILLISECONDS);
            //converte os millisegundos para dias
            // Cada segundo tem 1000 millisegundos, cada minuto tem 60 segundos, cada hora tem 60 minutos
            // e cada dia tem 24 horas
            //ESSA VERSÃO É MAIS ANTIGA
            int dias = (int )(diffMilli / (1000 * 60 * 60 * 24 ));

            System.out.println(diff);
            System.out.println(dias);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void diferencaDataJava8(){
        LocalDate data1 = LocalDate.of(2019,01,01);
        LocalDate data2 = LocalDate.of(2019,02,01);

        Period periodo = Period.between(data1,data2);
        // métodos com as diferenças de dias, meses e anos
        // para diferença de 30 dias retorna diferença de dias 0 e retorna 1 para mês
        int dias = periodo.getDays();
        int mes = periodo.getMonths();
        int ano = periodo.getYears();
        System.out.println(dias);
        System.out.println(mes);
        System.out.println(ano);
    }

    public static void diferencaDataTempoJava8(){
        LocalDateTime data1 = LocalDateTime.of(2019,01,01,6,30);
        LocalDateTime data2 = LocalDateTime.of(2019,1,1,8,30);

        Duration duracao = Duration.between(data1,data2);

        long diff = duracao.toHours();

        System.out.println(diff);
    }

    public static void diferencaDataJava8ChronoUnit(){
        LocalDateTime data1 = LocalDateTime.of(2019,01,01,6,30);
        LocalDateTime data2 = LocalDateTime.of(2019,1,1,8,30);

        long diff = ChronoUnit.HOURS.between(data1,data2);

        System.out.println(diff);
    }
}
