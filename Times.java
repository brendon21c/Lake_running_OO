package com.Brendon;


import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Times {

    private String lake;
    private LinkedList<Double> timesList;


    public String getLake() {
        return lake;
    }

    public void setLake(String lake) {
        this.lake = lake;
    }

    public void Lake(LinkedList times) {

        this.timesList = times;
        System.out.println("For lake " + getLake() + ", your best running time was: ");
        System.out.println();
        System.out.println(Collections.min(times));


    }

    public LinkedList timeEntry() {

        LinkedList timeRun = new LinkedList();

        while (true) {

            Scanner timeEntry = new Scanner(System.in);
            Scanner runagain = new Scanner(System.in);

            System.out.println("Enter your run time: ");
            Double run = timeEntry.nextDouble();
            timeRun.add(run);

            System.out.println();
            System.out.println("Do you want to enter another time?");
            String timeLoop = runagain.nextLine();

            if (timeLoop.equalsIgnoreCase("n")) {
                break;
            }

        }

        return timesList;

    }


}
