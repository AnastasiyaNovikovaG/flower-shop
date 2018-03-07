/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.cafebabe.model.entity;

/**
 *
 * @author user
 */
public class Rose extends Flower {
    
    private int thorns;

    public Rose(String name, String color, double price, 
            double length, int buttomsize, int thorns) {
        super(name, color, price, length, buttomsize);
        this.thorns = thorns;
    }

    public int getThorns() {
        return thorns;
    }

    public void setThorns(int thorns) {
        this.thorns = thorns;
    }

    @Override
    public String toString() {
        return super.toString() + "thorns = " + thorns + '}';
    }
     
    
}
