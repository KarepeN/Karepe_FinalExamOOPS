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
public class HairConditioner extends HairCareProduct {

    /**
     *
     * @param brand
     * @param price
     */
    public HairConditioner(String brand, double price) {
        super(brand, price);
    }
    
    /**
     *
     * @return
     */
    public String veganProduct() {
        if (super.getBrand().equalsIgnoreCase("Herbal Essences")) {
            return "It's a vegan product which means that a product does"
                    + " not contain any animal products or animal-derived ingredients.";
        }
        return "Not a HairCare Vegan Product ";//To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public double getPrice(){
        return super.getPrice();
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+ veganProduct();
    }
            
}
