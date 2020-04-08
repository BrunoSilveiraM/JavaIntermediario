package com.java.intermediario.classesutilitarias.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneTest {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy hh:mm:ss a z");
        System.out.println(sdf.format(agora.getTime()));

        TimeZone tzNY = TimeZone.getTimeZone("America/New_York");
        Calendar agoraNY = Calendar.getInstance(tzNY);
        //É preciso adicionar a hora no offset para surtir efeito na mudança de horário
        agoraNY.add(Calendar.HOUR_OF_DAY, tzNY.getOffset((System.currentTimeMillis())) / 1000 / 60 / 60);
        System.out.println(sdf.format(agoraNY.getTime()));

    }
}
