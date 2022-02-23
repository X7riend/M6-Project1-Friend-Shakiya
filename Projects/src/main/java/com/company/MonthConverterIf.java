package com.company;

import java.util.Scanner;

public class MonthConverterIf
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

        // Check for error or continue
        // Else if's to print out each month 1-12
        if (numMonth < 1 || numMonth > 12)
        {
            System.out.println("You have entered an invalid number.");
            System.out.println("You must enter a number between 1 and 12. Goodbye.");
        }
        else if (numMonth == 1)
        {
          System.out.println("You have chosen the month of January!");
        }
        else if (numMonth == 2)
        {
            System.out.println("You have chosen the month of February!");
        }
        else if (numMonth == 3)
        {
            System.out.println("You have chosen the month of March!");
        }
        else if (numMonth == 4)
        {
            System.out.println("You have chosen the month of April!");
        }
        else if (numMonth == 5)
        {
            System.out.println("You have chosen the month of May!");
        }
        else if (numMonth == 6)
        {
            System.out.println("You have chosen the month of June!");
        }
        else if (numMonth == 7)
        {
            System.out.println("You have chosen the month of July!");
        }
        else if (numMonth == 8)
        {
            System.out.println("You have chosen the month of August!");
        }
        else if (numMonth == 9)
        {
            System.out.println("You have chosen the month of September!");
        }
        else if (numMonth == 10)
        {
            System.out.println("You have chosen the month of October!");
        }
        else if (numMonth == 11)
        {
            System.out.println("You have chosen the month of November!");
        }
        else if (numMonth == 12)
        {
            System.out.println("You have chosen the month of December!");
        }



    }




}
