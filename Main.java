package com.Brendon;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList times = new LinkedList();
        LinkedList lakes = new LinkedList();


        while (true) {
            Scanner lakeEntry = new Scanner(System.in);

            System.out.println("Please enter the lake you ran around: ");
            String lake = lakeEntry.nextLine();
            lakes.add(lake);


            while (true) {

                Scanner timeEntry = new Scanner(System.in);
                Scanner runagain = new Scanner(System.in);

                System.out.println("Enter your run time: ");
                Double run = timeEntry.nextDouble();
                times.add(run.doubleValue());

                System.out.println();
                System.out.println("Do you want to enter another time?");
                String timeLoop = runagain.nextLine();

                if (timeLoop.equalsIgnoreCase("n")) {
                    break;
                }

            }

            Scanner runAgain = new Scanner(System.in);
            System.out.println("Would you like to enter another lake?");
            String loop = runAgain.nextLine();

            if (loop.equalsIgnoreCase("n")) {
                break;
            }

        }

        for (int x = 0; x < lakes.size(); x++) {

            String lake = lakes.get(x).toString();
            Times newLake = new Times();
            newLake.setLake(lake);
            newLake.Lake(times);
        }




    }
}
