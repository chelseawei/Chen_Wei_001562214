/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author chen.wei
 * 
 */ 

public class VitalSigns {
     private String date;
     private double bloodPressure;
     private double temperature; 
 
    

    public double getBloodPressure() {
        return bloodPressure;    
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public VitalSigns(String date,double bloodPressure, double temperature) {
        this.date = date;
        this.bloodPressure = bloodPressure;
        this.temperature = temperature;
        
       
    } 
 @Override
    public String toString(){
        return date;
        
        
    }
   
   
}
