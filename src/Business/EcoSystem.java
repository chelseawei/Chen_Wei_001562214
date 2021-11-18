/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Model.CustomerDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccountDirectory;
import Model.DeliveryManDirectory;
import Model.RestaurantDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem system;
    private RestaurantDirectory restaurantDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private OrganizationDirectory organizationDirectory;
    private UserAccountDirectory userAccountDirectory;

    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(system==null){
            system=new EcoSystem();
        }
        return system;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
       // super(null);
        organizationDirectory = new OrganizationDirectory();
       // networkList=new ArrayList<Network>();
    }
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
    
}
