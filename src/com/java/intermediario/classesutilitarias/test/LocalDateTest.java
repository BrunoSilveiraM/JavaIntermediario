package com.java.intermediario.classesutilitarias.test;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDateTime agoraCompleto = LocalDateTime.now();
        //uso de offset
        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto,offset);
        System.out.println(offsetdt);//adiciona o offset na data.
        ZoneId fortal = ZoneId.of("America/Fortaleza");
        // É possível realizar a conversão de API's mais antigas para a LocalDate
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        // to.Instante substitui Date após Java 8, se é preciso fazer um mapeamento de um
        // coluna de objetos para uma coluna que é do tipo DateTime então no lugar de usar Date
        // usa-se Instant
        LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), fortal);
        System.out.println(ldtDate);
        // convertendo do tipo Calendar
        System.out.println(LocalDateTime.ofInstant(c.toInstant(), fortal));
    }
}
