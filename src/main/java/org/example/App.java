package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App
{
    public static void main(String[] args)
    {
        //Initialize Scanner to receive input
        Scanner input = new Scanner(System.in);
        String Input;

        //First question, if answer is y then will keep prompting more questions till "n" is inputted.
        System.out.print("Is the car silent when you turn the key? Use y for yes and n for no. ");
        Input = input.next();
        if (Input.equals("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            Input = input.next();

            if (Input.equals("y"))
            {
                System.out.print("Clean terminals and try starting again.");
                System.exit(0);
            }

            else
            {
                System.out.print("Replace cables and try again.");
                System.exit(0);
            }

        }

        else
        {
            System.out.print("Does the car make a slicking noise? ");
            Input = input.next();

            if (Input.equals("y"))
            {
                System.out.print("Replace the battery.");
                System.exit(0);
            }
            else
            {
                System.out.print("Does the car crank up but fail to start? ");
                Input = input.next();

                if (Input.equals("y"))
                {
                    System.out.print("Check spark plug connections");
                    System.exit(0);
                }

                else
                {
                    System.out.print("Does the engine start and then die? ");
                    Input = input.next();
                    if (Input.equals("y"))
                    {
                        System.out.print("Does your car have fuel injection? ");
                        Input = input.next();

                        if (Input.equals("y"))
                        {
                            System.out.print("Get it in for service.");
                            System.exit(0);
                        }
                        else

                        {
                            System.out.print("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }

                    else
                    {
                        System.out.print("This should not be possible");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
