package com.company;

import java.util.Scanner;

public class MonthConverterSwitch
{
    public static void main(String[] args)
    {
        // Prompt user to insert an int to convert to month
        System.out.println("Please Enter an integer that corresponds with a month!");
        System.out.println("For Example 1 = January, 2 = February, etc.");

        // Scan user input
        Scanner myScanner = new Scanner (System.in);
        int numMonth;
        numMonth = Integer.parseInt(myScanner.nextLine());

       // Case 1-12 to represent the month and covert each to a month
        switch (numMonth)
        {
            case 1:
                System.out.println("You have chosen the month of January!");
                break;
            case 2:
                System.out.println("You have chosen the month of February!");
                break;
            case 3:
                System.out.println("You have chosen the month of March!");
                break;
            case 4:
                System.out.println("You have chosen the month of April!");
                break;
            case 5:
                System.out.println("You have chosen the month of May!");
                break;
            case 6:
                System.out.println("You have chosen the month of June!");
                break;
            case 7:
                System.out.println("You have chosen the month of July!");
                break;
            case 8:
                System.out.println("You have chosen the month of August!");
                break;
            case 9:
                System.out.println("You have chosen the month of September!");
                break;
            case 10:
                System.out.println("You have chosen the month of October!");
                break;
            case 11:
                System.out.println("You have chosen the month of November!");
                break;
            case 12:
                System.out.println("You have chosen the month of December!");

                // Check for error
            default:
                System.out.println("You have entered an invalid number.");
                System.out.println("You must enter a number between 1 and 12. Goodbye.");


        }
    }
}
