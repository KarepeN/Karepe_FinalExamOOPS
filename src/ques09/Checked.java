/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author S540109
 */
public class Checked {

    /**
     *
     * @throws FileNotFoundException
     */
    public void fileNotFound() throws FileNotFoundException{
     File file = new File("nofile.txt");
            FileInputStream sc1 = new FileInputStream(file);
            System.out.println("File Not Found");
           
        }

    /**
     *
     * @throws ClassNotFoundException
     */
    public void classNotException() throws ClassNotFoundException {

            Class.forName("ques09.Unchecked");
        
        }
    }

