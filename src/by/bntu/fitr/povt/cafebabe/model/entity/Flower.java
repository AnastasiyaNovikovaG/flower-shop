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
public abstract class Flower {
    
    private String name;
    private String color;
    private double price;
    private double length;
    private int buttomsize;

    public Flower(){
    }
    
    public Flower(String name, String color, double price, double length, int buttomsize) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.buttomsize = buttomsize;
    }

    public int getButtomsize() {
        return buttomsize;
    }

    public void setButtomsize(int buttomsize) {
        this.buttomsize = buttomsize;
    }

    @Override
    public String toString() {
        return "Flower{ " + "name = " + name + ", color = " + color + ","
                + " price = " + price + ", length = " + length + ","
                + " buttom size = " + buttomsize + ',';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
 
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
