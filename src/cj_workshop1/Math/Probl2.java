/*
 * File name: Probl2.java
 * Author   : Le Hung Thien
 * ID       : SE61374
 * Class    : SE0865
 * Subject  : Core Java
 * Project  : Workshop 1 (cj_workshop1)
 * Date     : Mar 18 2014
 */

package cj_workshop1.Math;

import java.util.Scanner;
//  Problem 2 implementation
public class Probl2 {
//  Integer number from user
    protected int num;
//  Funtion to input value
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        num = sc.nextInt();
    }
//  Display the result to console
    public void display()   {
        if (num % 2 == 0)   System.out.println("\n" + num + " is a power of 2.");
        else System.out.println("\n" + num + " is not a power of 2.");
    }
}
