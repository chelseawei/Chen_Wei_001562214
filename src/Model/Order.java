/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author chen.wei
 */
public  class Order {

    private String customer;
    private String deliveryman;
    private String restaurant;
    private String menu;
    private String status;
    private String comment;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getDeliveryman() {
        return deliveryman;
    }

    public void setDeliveryman(String deliveryman) {
        this.deliveryman = deliveryman;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Order() {
    }

    public Order(String customer, String restaurant, String menu, String deliveryman, String status,String comment) {
        this.customer = customer;
        this.deliveryman = deliveryman;
        this.restaurant = restaurant;
        this.menu = menu;
        this.status = status;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return customer;
    }


    

    
   

   
}
