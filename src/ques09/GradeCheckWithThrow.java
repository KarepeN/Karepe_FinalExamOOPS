/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques09;

import java.io.IOException;
/**
 *
 * @author S540109
 */
public class GradeCheckWithThrow {

    static void checkGrade(String grade) {
        if (!grade.equalsIgnoreCase("A") || !grade.equalsIgnoreCase("B")) {
            throw new ArithmeticException("Retake Course");
        } else {
            System.out.println("Good Job!");
        }

    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        checkGrade("B");
    }
}
