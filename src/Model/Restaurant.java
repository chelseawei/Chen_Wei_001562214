/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Restaurant.*;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String name;
    private ArrayList<Order> orderList; 
    private ArrayList<Menu> menuList; 
    
    public ArrayList<Menu> addMenu(Menu menu){
        System.out.println(menu.getPrice());
         System.out.println(menuList.size());
       menuList.add(menu);
       return menuList;
    }
    public ArrayList<Menu>deleteMenu(String type){
        for(int i =0; i<menuList.size();i++){
            if(menuList.get(i).getType().equals(type)){
                menuList.remove(i);
            }
            
    } 
        return menuList;   
    }

      public Restaurant() {
      this.orderList = new ArrayList();
      this.menuList= new ArrayList();
    }
    
    
    public Restaurant(String name,  ArrayList<Order> orders, ArrayList<Menu> menuList) {
        this.name = name;
  
        this.orderList = orders;
        this.menuList = menuList;
    }
    public Restaurant(String name) {
        this.name = name;
        orderList = new ArrayList<>();
        menuList = new ArrayList<>();
       
    }

 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<Order> getOrders() {
        return orderList;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orderList = orders;
    }

    public ArrayList<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<Menu> menuList) {
        this.menuList = menuList;
    }

    @Override
    public String toString() {
        return name;
    }

    
    
    
    
}
