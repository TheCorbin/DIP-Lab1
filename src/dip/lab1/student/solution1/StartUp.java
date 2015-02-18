/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author ryancorbin
 */
public class StartUp {
    
    
    public static void main(String[] args) {

        TipStrategy pizzaDelivery = new PizzaTipStrategy(55.00, "good");
        
        System.out.println(TipperService.getTip(pizzaDelivery));
    }   
    
    
    
}
