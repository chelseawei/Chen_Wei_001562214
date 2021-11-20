/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * @author chen.wei
 * 
 */
public class Menu {
    
    private String type;
    private String price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

  

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Menu(String type, String price) {
        this.type = type;
        this.price = price;
    }

    

    public Menu() {
    }

    @Override
    public String toString() {
        return type;
    }
    
    
}
