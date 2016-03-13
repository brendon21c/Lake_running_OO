package com.Brendon;

import java.util.LinkedList;
import java.util.Scanner;

public class LakeMain {

    public static void main(String[] args) {

        LinkedList lakes = new LinkedList();

        /*
        This block of code sets up the list of lakes for the program to iterate over
         */
        while (true) {

            Scanner lakeEntry = new Scanner(System.in);

            System.out.println("Please enter the lake you ran around: ");
            String lakeInput = lakeEntry.nextLine().toLowerCase();

            /*
            These two blocks are for input verification to make sure the user doesn't add
            the same lake twice.
             */
            if (lakes.contains(lakeInput)) {
                System.out.println("that lake has already been entered. Please enter another lake:" + "\n");
                Scanner lakeEntry2 = new Scanner(System.in);
                String lakeInput2 = lakeEntry2.nextLine().toLowerCase();
                lakes.add(lakeInput2);


            } else {

                lakes.add(lakeInput);

            }

            Scanner runAgain = new Scanner(System.in);
            System.out.println("Would you like to enter another lake?");
            String loop = runAgain.nextLine();

            if (loop.equalsIgnoreCase("n")) {
                break;
            } else if (loop.equalsIgnoreCase("no")) {

                break;

            }
        }

            for (int x = 0; x < lakes.size(); x++) {

                String lake = lakes.get(x).toString();
                Times newLake = new Times();
                newLake.setLake(lake);
                newLake.timeEntry(lake);
                newLake.Lake(lake);
            }

        }
    }

