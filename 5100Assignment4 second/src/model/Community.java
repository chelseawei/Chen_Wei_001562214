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
public class Community {
    private String name;
    private ArrayList<House> houseList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }

    public Community(String name) {
        this.name = name;
    }

    public Community() {
        this.houseList = new ArrayList<House>();
    }

   
    
    
    
    
}
