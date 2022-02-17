package com.company;

import java.util.Scanner;

public class ArrayFun5Words
{
    public static void main(String[] args)
    {
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Please Enter 5 Words");
        String arrayWords[] = new String[5];
        for(int i = 0; i < 5; i++)
        {
            arrayWords[i] = myscanner.nextLine();
            System.out.println(arrayWords[i]);
        }
    }

}
