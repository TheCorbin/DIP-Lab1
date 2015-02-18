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
public class CabbieStrategy implements TipStrategy {
    int hours;
    double amount;
    String service;
    
    
    public CabbieStrategy(double amount, int hours, String service){
        this.hours = hours;
        this.service = service;
        this.amount = amount;
    }

    @Override
    public Double getTip(){
        double tip = 0.00;
        
        if ("good".equals(service)) {
            tip = (amount * .2);
        } else if ("bad".equals(service)) {
            tip = (amount * .1) - (hours*1.0);
        }
        
        return tip; 
    }
    
    
    
    
    
}
