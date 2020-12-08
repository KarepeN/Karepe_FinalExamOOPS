/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques01;

/**
 *
 * @author Nithya Karepe
 */
public class PizzaBusiness extends PizzaType implements ItalianFood {

    /**
     *
     * @param type
     */
    public PizzaBusiness(String type) {
        super(type);
    }

    /**
     *
     * @return
     */
    @Override
    public double getCost() {
        if (type.equalsIgnoreCase("vegPizza")) {
            return 6.4;
        } else if (type.equalsIgnoreCase("nonVegPizza")) {
            return 7.8;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCost: " + getCost() + "\n" + "Pineapple Topping: " + getPineapple() + "\n"
                + "Pepperroni Topping: " + getPepperroni() + "\n";
    }

}
