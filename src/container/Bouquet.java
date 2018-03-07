/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;
import by.bntu.fitr.povt.cafebabe.model.entity.*;
/**
 *
 * @author user
 */
public class Bouquet {
    
    public static final int DEFAULT_SIZE = 10;

   
    private Flower flowers[];
    private int size = 0;
    
    public Bouquet(){
        flowers = new Flower[DEFAULT_SIZE]; 
    
    }
    
    public Flower getFlower(int n){
    
        return flowers[n];
    }
     
    public int getSize() {
        return size;
    }
    
    public Bouquet(int size){
    
        this.flowers = new Flower[size];
    }
     
    public boolean add(Flower f) {
        if (size < flowers.length) {
            flowers[size++] = f;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String bouquet = "";
        for (int i = 0; i < size; i++) {
            bouquet += flowers[i].toString() + "\n";
            
        }
        return bouquet;
    }
        
}
