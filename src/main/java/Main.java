import java.time.Year;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Strickland
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("What is your current age? ");
            int age = scan.nextInt();
            System.out.print("At what age would you like to retire? ");
            int retAge = scan.nextInt();
            int year = Year.now().getValue();
            // check to see if user can already retire.
            if (age >= retAge) {
                System.out.println("You can retire already...");
                scan.close();
                return;
            }
            System.out.println("You have " + (retAge - age) + " years until you can retire.");
            System.out.println("It's " + year + ", so you can retire in " + (year + (retAge - age)) + ".");
            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
