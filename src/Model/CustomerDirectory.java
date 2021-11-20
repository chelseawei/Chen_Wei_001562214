/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;
    public CustomerDirectory(){
        customerList = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
     

    
    
    
    
     public  ArrayList<Customer> deletByName(String name){
        for(int i=0 ;i<customerList.size();i++){
            if(customerList.get(i).getUsername().equals(name)){
                customerList.remove(i);
            }
        }
        return customerList;
    }
    
}
