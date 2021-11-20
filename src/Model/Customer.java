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
public class Customer {
    private String username;
    private ArrayList<Order> orderList;

       public Customer() {
     
    }
    
    public Customer(String username) {
        this.username = username;
       
        orderList = new ArrayList<>();
    }
    
    public Customer(String username, ArrayList<Order> orders) {
        this.username = username;
       
        this.orderList = orders;
    }

    public Customer(ArrayList<Order> orders) {
        this.orderList = orders;
    }

 

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public ArrayList<Order> getOrders() {
        return orderList;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orderList = orders;
    }
     
    
    
    
    
}
