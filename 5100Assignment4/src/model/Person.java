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
public class Person {
    private String neme;
    private String age;
    private String house;
    private String community;
    private String city;
    private double bloodPressure;
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

    public String getNeme() {
        return neme;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Person(String neme, String age, String house, String community, String city, double bloodPressure) {
        this.neme = neme;
        this.age = age;
        this.house = house;
        this.community = community;
        this.city = city;
        this.bloodPressure = bloodPressure;
    }

    public Person() {
    }

     @Override
    public String toString(){
        return neme;
        
    }
    
}
