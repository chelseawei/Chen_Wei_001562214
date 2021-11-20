package Business;

import Business.DB4OUtil.DB4OUtil;

import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Model.Customer;
import Model.DeliveryMan;
import Model.Menu;
import Model.Restaurant;
import Model.UserAccount;

//import Model.UserAccountDirectory;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        DB4OUtil db = new DB4OUtil();
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
           
       SystemAdminOrganization systemAdminOrganization = new SystemAdminOrganization();
        system.getOrganizationDirectory().getOrganizationList().add(systemAdminOrganization);
        AdminOrganization adminOrganization = new AdminOrganization();
        system.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        DeliveryOrganization deliveryOrganization = new DeliveryOrganization();
        system.getOrganizationDirectory().getOrganizationList().add(deliveryOrganization);
        CustomerOrganization customerOrganization = new CustomerOrganization();
        system.getOrganizationDirectory().getOrganizationList().add(customerOrganization);
     
        UserAccount account1 = new UserAccount();
        account1.setUsername("sysadmin");
        account1.setPassword("sysadmin");
        account1.setRole(new SystemAdminRole());
        
        UserAccount account2 = new UserAccount();
        account2.setUsername("restaurant");
        account2.setPassword("restaurant");
        account2.setRole(new AdminRole());
        Restaurant r = new Restaurant("restaurant");
        system.getRestaurantDirectory().getRestaurantAccountList().add(r);
        
        System.out.println(system.getRestaurantDirectory().getRestaurantAccountList().get(0));
        
        UserAccount account3 = new UserAccount();
        account3.setUsername("deliver1");
        account3.setPassword("deliver1");
        account3.setRole(new DeliverManRole());
        DeliveryMan d = new DeliveryMan("deliver1");
        system.getDeliveryManDirectory().getDeliveryManAccountList().add(d);
        UserAccount account4 = new UserAccount();
        account4.setUsername("customer1");
        account4.setPassword("customer1");
        account4.setRole(new CustomerRole());
        Customer c = new Customer("customer1");
        system.getCustomerDirectory().getCustomerList().add(c);
      
        systemAdminOrganization.getUserAccountDirectory().getUserAccountList().add(account1);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account2);
        deliveryOrganization.getUserAccountDirectory().getUserAccountList().add(account3);
        customerOrganization.getUserAccountDirectory().getUserAccountList().add(account4);
        
        Menu menu1 = new Menu("Combo1","8");
        Menu menu2 = new Menu("Combo2","10");
        Menu menu3 = new Menu("Combo3","12");
        Menu menu4 = new Menu("Combo4","13");
        system.getRestaurantDirectory().getRestaurantAccountList().get(0).getMenuList().add(menu1);
        system.getRestaurantDirectory().getRestaurantAccountList().get(0).getMenuList().add(menu2);
        system.getRestaurantDirectory().getRestaurantAccountList().get(0).getMenuList().add(menu3);
        system.getRestaurantDirectory().getRestaurantAccountList().get(0).getMenuList().add(menu4);
        System.out.println(system.getRestaurantDirectory().getRestaurantAccountList().get(0).getMenuList());
        System.out.println(system.getOrganizationDirectory().getOrganizationList());
        db.storeSystem(system);
      // System.out.println("22772");
       //System.out.println(adminOrganization.getUserAccountDirectory().getUserAccountList());
       return system;
    }
    
}
