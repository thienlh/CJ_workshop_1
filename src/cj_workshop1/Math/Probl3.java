/*
 * File name: Probl3.java
 * Author   : Le Hung Thien
 * ID       : SE61374
 * Class    : SE0865
 * Subject  : Core Java
 * Project  : Workshop 1 (cj_workshop1)
 * Date     : Mar 18 2014
 */
package cj_workshop1.Math;

import java.util.Scanner;
//  Problem 3 implementation
public class Probl3 {
//  Two integer numbers from user
    protected int num1, num2;
//  Function to input value
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first number : ");
        num1 = sc.nextInt();
        System.out.print("Please enter the second number: ");
        num2 = sc.nextInt();
    }
//  Display result to console
    public void display() {
        System.out.println();
        System.out.println("AND: " + (num1 & num2));
        System.out.println("OR : " + (num1 | num2));
        System.out.println("XOR: " + (num1 ^ num2));
    }
}
