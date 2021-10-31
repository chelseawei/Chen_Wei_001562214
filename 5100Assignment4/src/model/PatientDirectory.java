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
public class PatientDirectory {
    private ArrayList<Patient> catalog;
    public PatientDirectory(){
        this.catalog = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<Patient> catalog) {
        this.catalog = catalog;
    }
    public Patient addNewPatient(){
        Patient patient = new Patient();
        catalog.add(patient);
        return patient;
    }
     public Patient addNewPatient(Patient patient){
       
        catalog.add(patient);
        return patient;
    }
    public void deletePatient(Patient patient){
        catalog.remove(patient);
    }
   public void deletePatient(String name){
        for(Patient p: catalog){
            if(p.getNeme().equalsIgnoreCase(name)){
                catalog.remove(p);
                break;
            }
        }
    }
    public void update(String name, double bloodPressure){
        for(Patient p: catalog){
            if(p.getNeme().equals(name)){
                p.setBloodPressure(bloodPressure);
                break;
            }
        }
    }
    public void delete(String name){
        for(Patient p: catalog){
            if(p.getNeme().equals(name)){
                catalog.remove(p);
                break;
            }
        }
    }
}
