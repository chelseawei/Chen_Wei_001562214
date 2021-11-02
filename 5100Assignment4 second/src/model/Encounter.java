/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author chen.wei
 */
public class Encounter {
    private ArrayList<VitalSigns> encouter;
    public Encounter(){
        this.encouter = new ArrayList<VitalSigns>();
        
    }

    public ArrayList<VitalSigns> getEncouter() {
        return encouter;
    }

    public void setEncouter(ArrayList<VitalSigns> encouter) {
        this.encouter = encouter;
    }
    public void delete(String date){
        for(VitalSigns p: encouter){
            if(p.getDate().equals(date)){
                encouter.remove(p);
                break;
            }
            
        }
    }
   
    
}
