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
public class Peony extends Flower {
    
    private int leaves;

    public Peony(String name, String color, double price, 
            double length, int buttomsize, int leaves) {
        super(name, color, price, length, buttomsize);
        this.leaves = leaves;
    }

    public int getLeaves() {
        return leaves;
    }

    public void setLeaves(int leaves) {
        this.leaves = leaves;
    }


    @Override
    public String toString() {
        return super.toString() + "leaves = " + leaves + '}';
    }
    
}
