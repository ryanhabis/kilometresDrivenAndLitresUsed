package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double travelCost = 0;
        double average = 0;


        for(int i = 1; i<=4; i++)
        {

            System.out.println("Enter the number of kilometres that you have driven ");
            int kilometres = scanner.nextInt();

            System.out.println("What type of fuel does your car use?");
            String fuelType = scanner.next();



            if(fuelType.equals("Diesel") || fuelType.equals("diesel"))
            {
                System.out.println("Enter number of litres of diesel used ");
                int litres = scanner.nextInt();

                double cost = 1.25;

                double total = litres * cost;

                System.out.println("User " + i + "  journey of " + kilometres +" kilometres will cost " + total + " of litres.");
            }
            else if (fuelType.equals("Petrol") || fuelType.equals("petrol"))
            {
                System.out.println("Enter number of litres of petrol used ");
                int litres = scanner.nextInt();

                double cost = 1.65;

                double total = litres * cost;

                System.out.println("User " + i + " journey is " + kilometres +" kilometres and will cost " + total + " of litres.");


            }
            else
            {
                System.out.println("Error");
            }

            travelCost = kilometres + travelCost;

            int count = 4;

            average = kilometres/count;


        }
        System.out.println("Travel cost through kilometers " + travelCost);

        System.out.println("This is the average of the kilometres driven " + average);


    }
}
