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
public class RestaurantDirectory {
    public  ArrayList< Restaurant>  restaurantAccountList;

    public RestaurantDirectory() {
        restaurantAccountList = new ArrayList<>();
    }

    public ArrayList<Restaurant> getRestaurantAccountList() {
        return restaurantAccountList;
    }

    public void setRestaurantAccountList(ArrayList<Restaurant> restaurantAccountList) {
        this.restaurantAccountList = restaurantAccountList;
    }
       
       
       
       
        public  ArrayList<Restaurant> deletByName(String name){
            for(Restaurant r : restaurantAccountList ){
                if(r.getName().equals(name)){
                    restaurantAccountList.remove(r);
                    break;
                }
            }
        return restaurantAccountList;
    }
        
        
        public Restaurant FindByName(String name){
            for(Restaurant r : restaurantAccountList) {
                if(r.getName().equals(name)){
                    return r;
            }
            }
            return null;
}
    
}
