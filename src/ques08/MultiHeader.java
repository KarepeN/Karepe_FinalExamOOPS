/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques08;

import java.io.*;
import java.text.NumberFormat;

/**
 *
 * @author nithya Karepe
 */
public class MultiHeader {

    /**
     * @param args the command line arguments
     */
    static void myMethod() throws ArithmeticException, NumberFormatException {

        int a = 9;
        int b = 0;
        if (b == 0) {
            throw new ArithmeticException("Arithmetic Exception");
        }
        a = Integer.parseInt(null);
        throw new NumberFormatException("NumberFormat Exception");

    }

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        try {
            myMethod();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
