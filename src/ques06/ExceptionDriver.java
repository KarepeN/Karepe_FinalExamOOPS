/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques06;

/**
 *
 * @author S540109
 */
public class ExceptionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Checked Exceptions
        CheckedExceptions e = new CheckedExceptions();
        e.fileNotFoundException();
        e.classNotException();
        UncheckedException e2 = new UncheckedException(30,0, "Final Exam");
        e2.arithemeticException();
        e2.stringIndexOutOfBoundsException();
    }
    
    
}
