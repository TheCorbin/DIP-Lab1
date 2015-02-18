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
public class PizzaTipStrategy implements TipStrategy{
    double billAmt;
    String service;
    
    
    public PizzaTipStrategy(double billAmt, String service){
        this.billAmt = billAmt;
        this.service = service; 
    }

    @Override
    public Double getTip() {
        double tip = 0.00;
        
        if ("good".equals(service)) {
            if (billAmt < 20){
                tip = 1.00;
            } else if (billAmt >= 20) {
                tip = 1.00 * (int)(billAmt/20);
            }
        } else if ("bad".equals(service)) {
            tip = 0.0;
        }
        return tip; 
    }
    
}
