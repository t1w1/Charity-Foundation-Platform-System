/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Interface.Charity.DriverWorkAreaJPanel;

/**
 *
 * @author kathe
 */
public class DriverRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network mynetWork, EcoSystem system) {
        return new DriverWorkAreaJPanel(userProcessContainer,account);//To change body of generated methods, choose Tools | Templates.
    }
    public DriverRole(){
        this.roleType=this.roleType.Driver;
    }
}
