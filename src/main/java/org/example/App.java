package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nathaniel Gibson
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        //Input
        System.out.print("What is the input string? ");
        String input = scanner.next();

        //Output
        System.out.println(input + " has " + input.length() + " characters.");
    }
}
