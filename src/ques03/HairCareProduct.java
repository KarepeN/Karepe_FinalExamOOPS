/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques03;

/**
 *
 * @author Nithya Karepe
 */
public class HairCareProduct {

    private String brand;
    private double price;

    /**
     *
     * @param brand
     * @param price
     */
    public HairCareProduct(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    /**
     *
     * @return
     */
    public String getBrand() {
        return brand;
    }

    /**
     *
     * @return
     */
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "brand=" + brand + ", price=" + price ;
    }


}
