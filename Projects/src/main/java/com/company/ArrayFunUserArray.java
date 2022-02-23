package com.company;

import java.util.Scanner;

public class ArrayFunUserArray
{
    public static void main(String[] args)
    {
        System.out.println("Please Enter 5 integers!");
        int [] yourArray = new int[5];
        Scanner myscanner = new Scanner(System.in);
        for(int i = 0; yourArray.length > i; i++)
        {
            yourArray[i] = myscanner.nextInt();
            System.out.println(yourArray[i]);
        }



    }
}
