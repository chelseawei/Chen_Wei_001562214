package Business;

import Business.DB4OUtil.DB4OUtil;
import Business.Employee.Employee;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
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
        account2.setUsername("admin");
        account2.setPassword("admin");
        account2.setRole(new AdminRole());
        UserAccount account3 = new UserAccount();
        account3.setUsername("deliver1");
        account3.setPassword("deliver1");
        account3.setRole(new DeliverManRole());
        UserAccount account4 = new UserAccount();
        account4.setUsername("customer1");
        account4.setPassword("customer1");
        account4.setRole(new CustomerRole());
        
        systemAdminOrganization.getUserAccountDirectory().getUserAccountList().add(account1);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account2);
        deliveryOrganization.getUserAccountDirectory().getUserAccountList().add(account3);
        customerOrganization.getUserAccountDirectory().getUserAccountList().add(account4);
      
       //UserAccount ua = business.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", new SystemAdminRole());
        //DB4OUtil.getInstance().storeSystem(system);
       System.out.println(adminOrganization.getUserAccountDirectory().getUserAccountList());
       return system;
    }
    
}
