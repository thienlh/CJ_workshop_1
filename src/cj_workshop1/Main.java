/*
 * File name: Main.java
 * Author   : Le Hung Thien
 * ID       : SE61374
 * Class    : SE0865
 * Subject  : Core Java
 * Project  : Workshop 1 (cj_workshop1)
 * Date     : Mar 18 2014
 */
package cj_workshop1;

import java.util.Scanner;
import cj_workshop1.Math.*; //  My library to perform 3 problems solving
//  Main class
public class Main {
//  Funtion that show the main screen and acept user option

    public static int mainscreen() {
        Scanner sc = new Scanner(System.in);
        //  Print out main screen
        System.out.println("*********************************************");
        System.out.println("*  THIENLHSE61374 - CORE JAVA - WORKSHOP 1  *");
        System.out.println("*********************************************");
        System.out.println("* 1        Problem 1: GCD and LCM.          *");
        System.out.println("* 2        Problem 2: Power of 2 checker    *");
        System.out.println("* 3        Problem 3: AND, OR and XOR       *");
        System.out.println("* Other    Quit                             *");
        System.out.println("*********************************************");
        System.out.print("Enter your selection: ");
        //  Try to get user option
        try {
            return sc.nextInt();
        } catch (Exception e) {
            //  Quit program
            return 4;
        }
    }
//  main function

    public static void main(String[] args) {
        int userChoice;     //  Letting user to choose if they want to QUIT or not
        //  Loop until user want to quit
        do {
            //  Show the main screen
            int choice = mainscreen();
            //  Switch between options
            switch (choice) {
                case 1: //  Problem 1
                    System.out.println();
                    Probl1 p1 = new Probl1();
                    try {
                        p1.input();
                        p1.display();
                    } catch (Exception e) {
                        System.out.println("WRONG INPUT!");
                    }
                    break;
                case 2: //  Problem 2
                    System.out.println();
                    Probl2 p2 = new Probl2();
                    try {
                        p2.input();
                        p2.display();
                    } catch (Exception e) {
                        System.out.println("WRONG INPUT!");
                    }
                    break;
                case 3: //  Problem 3
                    System.out.println();
                    Probl3 p3 = new Probl3();
                    try {
                        p3.input();
                        p3.display();
                    } catch (Exception e) {
                        System.out.println("WRONG INPUT!");
                    }
                    break;
            }
            //  Promt user for quiting
            System.out.print("\nDo you want to QUIT? (0 for NO): ");
            Scanner sc = new Scanner(System.in);
            try {
                userChoice = sc.nextInt();
            } catch (Exception e) {
                userChoice = 1;
            }
        } while (userChoice == 0);
        System.out.println("HAVE A NICE DAY. GOODBYE!");
    }
}
