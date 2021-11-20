/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import  Model.UserAccount;
import userinterface.CustomerRole.CustomerOrderJPanel;
import javax.swing.JPanel;
import userinterface.CustomerRole.CustomerAreaJPanel1;

/**
 *
 * @author raunak
 */
public class CustomerRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,EcoSystem business) {
        return new CustomerAreaJPanel1(userProcessContainer, account,business);
    }
    
    
}
