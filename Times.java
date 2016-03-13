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

    public void Lake(String lake) { // this displays the best time for each lake in the Main class.


        System.out.println("For lake " + getLake() + ", your best running time was: ");
        System.out.println();
        System.out.println(Collections.min(timesList));


    }

    /*
    this method runs through the laks list in the Main and returns the best time for given lake.
     */
    public LinkedList timeEntry(String lake) {

        this.lake = lake;
        this.timesList = new LinkedList<>();


        while (true) {

            Scanner timeEntry = new Scanner(System.in);
            Scanner runagain = new Scanner(System.in);

            System.out.println("Enter your run time for lake " + lake + ":");
            Double run = timeEntry.nextDouble();
            timesList.add(run);

            System.out.println();
            System.out.println("Do you want to enter another time?");
            String timeLoop = runagain.nextLine();

            if (timeLoop.equalsIgnoreCase("n")) {
                break;
            } else if (timeLoop.equalsIgnoreCase("no")) {

                break;

            }

        }

        return timesList;
    }



}
