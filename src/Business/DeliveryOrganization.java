/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author chen.wei
 */
public class DeliveryOrganization extends Organization {

    public DeliveryOrganization() {
        super(Organization.Type.DeliveryMan.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DeliverManRole());
        return roles;
    }
    
}
