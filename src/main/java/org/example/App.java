/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;



public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");


        System.out.print("Enter the principal: ");
        double principle = scanner.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        double time = scanner.nextDouble();

        double A = principle * (1 +(rate*time)/100);
        int y =(int)time;
        int outcome = (int)A;
        System.out.println("After "+y+" years at "+df.format(rate)+"%, the investment will be worth $"+outcome+".");


    }
}
