/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.regex.Pattern;

/**
 *
 * @author chen.wei
 */
public class Product {

   
    private String brands;
    private String produceYear;
    private int seatNumbers;
    private String serialNumber;
    private String modelNumber;
    private boolean isAvailable;
    private String manufacturers; 
    private boolean isExpired;
    private String city;

    public Product() {
    }

    public Product(String brands, String produceYear, int seatNumbers, String serialNumber, String modelNumber, boolean isAvailable, String manufacturers, boolean isExpired, String city) {
        this.brands = brands;
        this.produceYear = produceYear;
        this.seatNumbers = seatNumbers;
        this.serialNumber = serialNumber;
        this.modelNumber = modelNumber;
        this.isAvailable = isAvailable;
        this.manufacturers = manufacturers;
        this.isExpired = isExpired;
        this.city = city;
    }
    

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isIsExpired() {
        return isExpired;
    }

    public void setIsExpired(boolean isExpired) {
        this.isExpired = isExpired;
    }

    public int getSeatNumbers() {
        return seatNumbers;
    }

    public void setSeatNumbers(int seatNumbers) {
        this.seatNumbers = seatNumbers;
    }

    public String getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(String manufacturers) {
        this.manufacturers = manufacturers;
    }
    
    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }
    private static final String NUMBER = "^(19|20)\\d{2}$"; //数字
     public static boolean check(String reg,String value){
        return Pattern.matches(reg,value); 
    }
    public static boolean isNull(String v){
        if(v == null||v.equals("")){
            return true;
        }
        return false; 
    }
    public static boolean checkNumber(String v){
        return check(NUMBER,v); 
    }
    public String getProduceYear() {
        return produceYear;
    }

    public void setProduceYear(String produceYear) {
        this.produceYear = produceYear;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    
    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    @Override
    public String toString(){
        return brands;
        
    }
    

}
