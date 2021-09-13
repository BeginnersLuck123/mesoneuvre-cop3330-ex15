package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App 
{
    public static void main( String[] args )
    {
       Scanner input = new Scanner(System.in);
       System.out.println("Username: ");
       String username = input.nextLine(); //Input
       System.out.println("Password: ");
       String password = input.nextLine(); //Input
       System.out.println( "What is the password?" );
       String attempt = input.nextLine(); //Input
        //Making an IF/ELSE statement to see if the password is right or not
       if(attempt.equals(password))
       {
           System.out.println("Welcome!");//Output if password attempt matches password
       }
       else
       {
           System.out.println("I don't know you");//Output if password attempt does not match password
       }
    }
}
