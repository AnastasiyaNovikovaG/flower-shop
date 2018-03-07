/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import by.bntu.fitr.povt.cafebabe.model.entity.BlueBell;
import container.Bouquet;
import by.bntu.fitr.povt.cafebabe.model.entity.Flower;
import by.bntu.fitr.povt.cafebabe.model.entity.Peony;
import by.bntu.fitr.povt.cafebabe.model.entity.Rose;
import java.util.Random;

/**
 *
 * @author user
 */
public class ShopAssistance {
    
    public static Bouquet getBouquet(int n){
        int  r;
        Rose rose = new Rose("Rose","red",13.3,1.0, 5 , 3);
        Peony peony = new Peony ("Peony", "pink", 10, 0.5, 10, 3);
        BlueBell bluebell = new BlueBell("Bluebell" , "blue", 3, 0.2,2,10);
        Flower flower[] = {rose,peony,bluebell};
        Bouquet bq = new Bouquet();
        Random rd = new Random() ;
        for (int i=0; i<n;i++){
            r = rd.nextInt(3);
            bq.add(flower[r]);
        }
        
    return bq;
    }
   
    public static double calculateTotalPrice(Bouquet bouquet) {
        double total = 0;
        
        for (int i = 0; i < bouquet.getSize(); i++) {
            total += bouquet.getFlower(i).getPrice();
        }
        
        return total;
    }
    
}
