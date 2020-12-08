/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques07;

import java.util.Scanner;
/**
 *
 * @author S540109
 */
public class OutOfBound {
    /**
     * @param args the command line arguments
     */
    int[] a = new int[100];

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int i = 0;
        while (i < a.length) {
            a[i] = (int) (Math.random() * 100) + 1;
            i++;
        }
        // Prompt the user to enter the index of the array
        System.out.print("Enter index: ");

        try {
            // Display the corresponding element value
            System.out.println("The corresponding element is "
                    + a[sc.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds.");
        }
    }
}
