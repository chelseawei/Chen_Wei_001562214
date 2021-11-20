/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 *@author chen.wei
 */
public class OrderDirectory {
    
     public  ArrayList<Order>  orderAccountList;
    
    public OrderDirectory() {
        orderAccountList = new ArrayList();
    }

    public ArrayList<Order> getOrderAccountList() {
        return orderAccountList;
    }

    public void setOrderAccountList(ArrayList<Order> orderAccountList) {
        this.orderAccountList = orderAccountList;
    }
     
     

  
}