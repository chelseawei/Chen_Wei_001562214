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
public class PersonDirectory {
    private ArrayList<Person> catalog;

    public ArrayList<Person> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<Person> catalog) {
        this.catalog = catalog;
    }
    public Person addNewPerson(){
        Person person = new Person();
        catalog.add(person);
        return person;
    }
    public Person addNewPerson(Person person){
        
        catalog.add(person);
        return person;
    }
    public void deletePerson(Person person){
        catalog.remove(person);
    }
 
    public PersonDirectory() {
        this.catalog = new ArrayList<Person>();
    }
    
    
}
