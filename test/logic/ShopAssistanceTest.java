/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import by.bntu.fitr.povt.cafebabe.model.entity.BlueBell;
import by.bntu.fitr.povt.cafebabe.model.entity.Peony;
import by.bntu.fitr.povt.cafebabe.model.entity.Rose;
import container.Bouquet;
import org.junit.Assert;
//import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class ShopAssistanceTest {
    
    public ShopAssistanceTest() {
    }

    @Test
    public void testSomeMethod() {
        Rose rose = new Rose("Rose","red",13.3,1.0, 5 , 3);
        Peony peony = new Peony ("Peony", "pink", 10, 0.5, 10, 3);
        BlueBell bluebell = new BlueBell("Bluebell" , "blue", 3, 0.2,2,10);
        Bouquet bouquet = new Bouquet(5);
        bouquet.add(rose);
        bouquet.add(peony);
        bouquet.add(bluebell);
        double total = logic.ShopAssistance.calculateTotalPrice(bouquet);
        double true_total = 26.3;
        if (true_total!=total){
            Assert.fail();
        }
    }
    
    public void testSomeMethod2() {
        Rose rose = new Rose("Rose","red",13.3,1.0, 5 , 3);
        Rose rose2 = new Rose("Rose","blue",23.3,1.5, 5 , 0);
        BlueBell bluebell = new BlueBell("Bluebell" , "blue", 3, 0.2,2,10);
        Bouquet bouquet = new Bouquet(5);
        bouquet.add(rose);
        bouquet.add(rose2);
        bouquet.add(bluebell);
        double total = logic.ShopAssistance.calculateTotalPrice(bouquet);
        double true_total = 39.6;
        if (true_total!=total){
            Assert.fail();
        }
    }
    
}
