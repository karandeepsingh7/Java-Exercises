/**
 * Author : Karandeep Singh
 * Description : Swap Two Numbers Without Using Third Variable
 */

package org.swapTwoNumberWOThird;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        a=a+b; // Make a sum of both the numbers
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);

    }
}