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
public abstract class PizzaType implements ItalianFood {

    /**
     *
     */
    public String vegPizza;

    /**
     *
     */
    public String nonVegPizza;
    String type;

    /**
     *
     * @param type
     */
    public PizzaType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean getPepperroni() {
        if (!type.equalsIgnoreCase("nonVegPizza")) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean getPineapple() {
        if (!type.equalsIgnoreCase("vegPizza")) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    public abstract double getCost();

    /**
     *
     * @return
     */
    public String AboutPizza() {
        return "Pizza is a savory dish of Italian origin consisting of \n "
                + "a usually round, flattened base of leavened wheat-based dough \n"
                + " topped with tomatoes, cheese, and often various other ingredients, \n"
                + " which is then baked at a high temperature, traditionally in a wood-fired oven.";

    }

    @Override
    public String toString() {
        return "type: " + type;
    }

}
