package com.java.intermediario.classesutilitarias.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        String data = "12/02/2017 14:25";
        // tenta transforma em Data
        try {
            Date date = DateFormat.getInstance().parse(data);
            System.out.println(date);
            //transforma String em Calendar
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            System.out.println(calendar);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
