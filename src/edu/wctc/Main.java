package edu.wctc;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nEma Nimphius" +
                "\nJava Lab 5" +
                "\n**FUN FACT I SAW U2 IN CONCERT**");
        //1. Calculate and print how many days, months, and years have elapsed since U2
        //released their album, The Joshua Tree, which was released on March 9th, 1987.
        System.out.println("\nJoshua Tree - Now");
        //Today's Date
        LocalDate today = LocalDate.now();
        //Joshua Tree Released
        LocalDate jTree = LocalDate.of(1987, 3, 9);
        //Period: P-36Y-6M-24D
        Period p1 = Period.between(jTree, today);
        System.out.println("Years: " + p1.getYears()
                + "\nMonths: " + p1.getMonths()
                + "\nDays: " + p1.getDays());

        //2. Calculate and print the amount of time between The Joshua Tree and their next album,
        //Rattle and Hum, which was released on October 10th, 1988.
        System.out.println("\nJoshua Tree - Rattle and Hum");

        LocalDate rHum = LocalDate.of(1988, 10, 10);
        LocalTime jS = LocalTime.of(0,0,0);
        //Rattle and Hum Date
        LocalTime rH = LocalTime.of(0, 0,0);
        //Duration for Time:
        Duration d1 = Duration.between(jS.atDate(jTree), rH.atDate(rHum));
        Period p2 = Period.between(jTree, rHum);

        System.out.println("\nYears: " + p2.getYears()
                + "\nMonths: " + p2.getMonths()
                + "\nDays: " + p2.getDays()
                + "\nHours: " + d1.toHours()
                + "\nMinutes: " + d1.toMinutes()
                + "\nSeconds: " + d1.getSeconds());

        //3. Calculate and print the release date for a hypothetical third album that released the
        //same amount of time after Rattle and Hum.
        System.out.println("\nRattle and Hum - Bum and Chum");

        LocalDate bumChum = rHum.plus(p2);

        System.out.println("\nRelease Date Rattle and Hum: " + rHum
                + "\nRelease Date of Bum and Chum: " + bumChum);


    }

}

