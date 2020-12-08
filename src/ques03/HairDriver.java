/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques03;

/**
 *
 * @author S540109
 */
public class HairDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int price = 12;
        double price2 = (double)price;
       HairConditioner c = new HairConditioner("Herbal Essences", price2);
       
       //upcasting
       HairCareProduct h= c;
       h = (HairCareProduct) c;
       System.out.println(h.toString());
       
       HairCareProduct h1 = new HairConditioner("Dove", 11);
       
       if(h1 instanceof HairConditioner ){
           //downcasting
       ((HairConditioner) h1).getPrice();
       ((HairConditioner) h1).veganProduct();
       }
       
        System.out.println(h1.toString());

    }
    
}
