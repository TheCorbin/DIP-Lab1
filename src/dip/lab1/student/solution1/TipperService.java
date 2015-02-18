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
public class TipperService {
//    private TipStrategy tipStrategy;
//    
//    
//    public TipperService (TipStrategy tipStrategy){
//        this.tipStrategy = tipStrategy;
//    }
//    
//    public Double getTip(){
//        return tipStrategy.getTip();
//    }
    
    public static Double getTip(TipStrategy tipStrategy){
        return tipStrategy.getTip();
    }
    
    

    
}
