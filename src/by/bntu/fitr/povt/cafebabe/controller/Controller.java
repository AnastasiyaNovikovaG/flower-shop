/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.cafebabe.controller;

import by.bntu.fitr.povt.cafebabe.view.Printer;
import by.bntu.fitr.povt.cafebabe.model.entity.*;
import container.*;
import logic.*;
/**
 *
 * @author user
 */
public class Controller {
    public static void main(String[] args) {
        Printer printer = new Printer();
       Bouquet bouquet = new Bouquet();
       bouquet = logic.ShopAssistance.getBouquet(5);
        printer.print(bouquet.toString());
        double total = logic.ShopAssistance.calculateTotalPrice(bouquet);
        printer.print("Price: " + total);
    }
   
    
}
