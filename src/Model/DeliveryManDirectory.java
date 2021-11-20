/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.DeliveryMan.*;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
     public  ArrayList<DeliveryMan>  DeliveryManAccountList;
    
    
     public DeliveryManDirectory() {
     DeliveryManAccountList = new ArrayList<>();
    }

    public ArrayList<DeliveryMan> getDeliveryManAccountList() {
        return DeliveryManAccountList;
    }

    public void setDeliveryManAccountList(ArrayList<DeliveryMan> DeliveryManAccountList) {
        this.DeliveryManAccountList = DeliveryManAccountList;
    }
    
    public  ArrayList<DeliveryMan> deletByName(String name){
        for(int i=0 ;i<DeliveryManAccountList.size();i++){
            if(DeliveryManAccountList.get(i).getName().equals(name)){
                DeliveryManAccountList.remove(i);
            }
        }
        return DeliveryManAccountList;
    }
    
}
