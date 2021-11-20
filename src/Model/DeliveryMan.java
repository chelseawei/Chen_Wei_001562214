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
public class DeliveryMan {
     private String name ;
      private ArrayList<Order> orders;

    public DeliveryMan() {
        orders = new ArrayList<>();
    }
    public DeliveryMan(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
    
}
