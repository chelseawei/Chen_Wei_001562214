/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import UI.TimeUtil;

/**
 *
 * @author chen.wei
 */
public class ProductCatalog {
    private ArrayList<Product> catalog;
    private HashSet<Product> brandList;
    private HashSet<Product> availableCityList;
    private HashSet<String> allBrandList = new HashSet<>();
    private HashSet<String> allCitiesList = new HashSet<>();
    private HashSet<String> allManufacturers = new HashSet<>();
    private HashSet<Product> availableCars = new HashSet<Product>();
    private HashSet<Product> notAvailableCars = new HashSet<Product>();
    private ArrayList<Product> expiredCars;
    private ArrayList<Product> searchBySeatList;
    private ArrayList<Product> getCarsByProduceYear = new ArrayList<Product>();
    private TimeUtil tu;
  //String brands, String produceYear, int seatNumbers, String serialNumber, String modelNumber, 
    //boolean isAvailable, String manufacturers, boolean isExpired, String city
   
    
    public ProductCatalog(){
        this.catalog = new ArrayList<Product>();
    }

    public ArrayList<Product> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<Product> catalog) {
        this.catalog = catalog;
    }
    public Product addNewProduct(){
        Product product = new Product();
        catalog.add(product);
//        Product product1 =new Product("tesa","2021",6,"t1234","t3",true,"t1",false,"malden");
//        Product product2 =new Product("tesa1","2020",6,"t12","t3",false,"t1",true,"ma");
//        Product product3 =new Product("tesa","2019",6,"t1234fyt","t3",true,"t1",false,"malden");
//        Product product4 =new Product("fysr","2011",6,"f1234","f3",false,"t2",true,"malden");
//        catalog.add(product1);
//        catalog.add(product2);
//        catalog.add(product3);
//        catalog.add(product4); 
        return product;
    }
    public String getTime(){
        Stack<String> s = new Stack<>();
        String t = tu.getTime();
        System.out.println(t);
        s.add(t);
        return s.pop();
    }
    public Product addNewProduct(Product product){
 
        catalog.add(product);
       
        return product;
    }
    public void deleteProduct(Product product) {
        catalog.remove(product);
        
    }
    public HashSet<String> getALlBrands(){  
        for(Product p : catalog) {
            allBrandList.add(p.getBrands()+"");
        }
        return allBrandList; 
        
    }
    public HashSet<String> getAllCities(){
        for(Product p : catalog) {
            allCitiesList.add(p.getCity()+"");
        }
        return allCitiesList;
    }
          
            
        
    public HashSet<String> getAllManufacturers(){
        for(Product p : catalog) {
            allManufacturers.add(p.getManufacturers());
        }
        return allManufacturers;
    }
    public HashSet<Product> getAvailableCityList(String city) {
        availableCityList = new HashSet<Product>();
        for(Product p : catalog) {
            if(p.getCity().equalsIgnoreCase(city) && p.isIsAvailable() == true) {
                availableCityList.add(p);
            }
        }
        return availableCityList;
        
    }
    public HashSet<Product> getBlandsList(String brands){
        brandList = new HashSet<Product>();
        for(Product p : catalog){
             
            if(p.getBrands().equals(brands)) {
                brandList.add(p);
                //System.out.println(p.getSerialNumber()+"被加入進去");
            }
        }
      return brandList;
        
    }
    public HashSet<Product> getAvailableCars(){
        for(Product p : catalog) {
           if(p.isIsAvailable() == true) {
               availableCars.add(p);
           }
        }
        return availableCars;
    }
    public HashSet<Product> getNotAvailableCars(){
        for(Product p : catalog) {
           if(p.isIsAvailable() == false) {
               notAvailableCars.add(p);
           }
        }
        System.out.println(notAvailableCars);
        return notAvailableCars;
    }
    public ArrayList<Product> getExpiredCars(){
         expiredCars = new ArrayList<Product>();
        for(Product p : catalog) {
           if(p.isIsExpired()== true) {
               expiredCars.add(p);
           }
        }
        return expiredCars;
    }
     public ArrayList<Product> getCarsByProdeceYear(String year){
        for(Product p : catalog) {
           if(p.getProduceYear() == year) {
               getCarsByProduceYear.add(p);
           }
        }
        return getCarsByProduceYear;
    }
     public ArrayList<Product> getCarsBySeats(int min,int max) {
         searchBySeatList = new ArrayList<Product>();
         for(Product p: catalog) {
             if(p.getSeatNumbers() >= min && p.getSeatNumbers() <= max) {
                 searchBySeatList.add(p);
             }
         }
         
         return searchBySeatList;
     }
      
      
    
}
