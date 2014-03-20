/*
 * File name: Probl1.java
 * Author   : Le Hung Thien
 * ID       : SE61374
 * Class    : SE0865
 * Subject  : Core Java
 * Project  : Workshop 1 (cj_workshop1)
 * Date     : Mar 18 2014
 */
package cj_workshop1.Math;

import java.util.Scanner;
//  Problem 1 implementation
public class Probl1 {
    //  Two number from user

    protected int num1, num2;
//  Funtion to input value

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first number : ");
        num1 = sc.nextInt();
        System.out.print("Please enter the second number: ");
        num2 = sc.nextInt();
    }
//  Calculate Greateast Common Divisor using Eucler algorithm

    public int gcd(int A, int B) {
        while (A != B) {
            if (A > B) {
                A = A - B;
            } else {
                B = B - A;
            }
        }
        return A;
    }
//  Calculate Least Common Multiplier

    public int lcm() {
        return (num1 * num2) / gcd(num1, num2);
    }
//  Display result to console

    public void display() {
        System.out.println();
        System.out.println("Largest Common Divisor : " + gcd(num1, num2));
        System.out.println("Least Common Multiplier: " + lcm());
    }
}
