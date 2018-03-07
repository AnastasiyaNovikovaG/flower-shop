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
public class BlueBell extends Flower {
    
    private int countButton;

    public BlueBell(String name, String color, double price, 
            double length, int buttomsize, int countButton) {
        super(name, color, price, length, buttomsize);
        this.countButton = countButton;
    }

    public int getCountButton() {
        return countButton;
    }

    public void setCountButton(int countButton) {
        this.countButton = countButton;
    }

    @Override
    public String toString() {
        return super.toString() + " count of button = " + countButton + '}';
    }
    
}
