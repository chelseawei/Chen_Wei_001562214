/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.AdminOrganization;
import Business.CustomerOrganization;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Role.AdminRole;
import Model.Restaurant;
import Model.UserAccount;
import java.awt.CardLayout;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chen.wei
 */
public class ManageAdmin extends javax.swing.JPanel {

    /**
     * Creates new form ManageAdmin
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    AdminOrganization adminOrganization;
    public DB4OUtil db = new DB4OUtil();
    public ManageAdmin(JPanel userProcessContainer,EcoSystem ecosystem){
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
         populateTable1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        btnCreateCustomer = new javax.swing.JButton();
        btnUpdateCustomer = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lbTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "UserName", "UserPassword"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        btnCreateCustomer.setText("Create");
        btnCreateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCustomerActionPerformed(evt);
            }
        });

        btnUpdateCustomer.setText("Update");
        btnUpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCustomerActionPerformed(evt);
            }
        });

        btnDeleteCustomer.setText("Delete");
        btnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerActionPerformed(evt);
            }
        });

        lbName.setText("userName:");

        lbPassword.setText("userPassword:");

        lbTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Manage Restaurant");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(lbName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCreateCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteCustomer)
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 67, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 68, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateCustomer)
                    .addComponent(btnUpdateCustomer)
                    .addComponent(btnDeleteCustomer))
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 70, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 71, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
        int row = table1.getSelectedRow();
        txtName.setText(table1.getValueAt(row, 0).toString());
        txtPassword.setText(table1.getValueAt(row, 1).toString());
    }//GEN-LAST:event_table1MouseClicked

    private void btnCreateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCustomerActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model1 = (DefaultTableModel)table1.getModel();
        Vector v = new Vector();
        v.add(txtName.getText());
        v.add(txtPassword.getText());
        UserAccount ur = new UserAccount();
        ur.setUsername(txtName.getText());
        ur.setPassword(txtPassword.getText());
        ur.setRole(new AdminRole());
        Restaurant r = new Restaurant(txtName.getText());
        ecosystem.getRestaurantDirectory().getRestaurantAccountList().add(r);
        ecosystem.getOrganizationDirectory().getOrganizationList().get(1).getUserAccountDirectory().getUserAccountList().add(ur);

        db.storeSystem(ecosystem);
        model1.addRow(v);
        //System.out.println(ecosystem.getOrganizationDirectory().getOrganizationList().get(0).getUserAccountDirectory().getUserAccountList());
    }//GEN-LAST:event_btnCreateCustomerActionPerformed

    private void btnUpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCustomerActionPerformed
        // TODO add your handling code here
        DefaultTableModel model1 = (DefaultTableModel)table1.getModel();
        int row = table1.getSelectedRow();
        model1.setValueAt(txtName.getText(), row, 0);
        model1.setValueAt(txtPassword.getText(), row, 1);
        for(UserAccount ur : ecosystem.getOrganizationDirectory().getOrganizationList().get(1).getUserAccountDirectory().getUserAccountList()){
            if(ur.getUsername().equals(txtName.getText())) {
                ur.setPassword(txtPassword.getText());
                break;
            }

        }
        db.storeSystem(ecosystem);
        txtName.setText(null);
        txtPassword.setText(null);
    }//GEN-LAST:event_btnUpdateCustomerActionPerformed

    private void btnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model1 = (DefaultTableModel)table1.getModel();
        int row = table1.getSelectedRow();
        // System.out.println(row);
        if(row < 0) {
            JOptionPane.showMessageDialog(this, "please select the row to delete");
            return;
        }else{

            System.out.println(table1.getValueAt(row, 0));
            //Restaurant r = new Restaurant(String.valueOf(table1.getValueAt(row, 0)));
            ecosystem.getOrganizationDirectory().getOrganizationList().get(1).getUserAccountDirectory().getUserAccountList().remove(table1.getValueAt(row, 0));
            ecosystem.getRestaurantDirectory().deletByName(String.valueOf(table1.getValueAt(row, 0)));
            db.storeSystem(ecosystem);

            model1.removeRow(row);

        }
    }//GEN-LAST:event_btnDeleteCustomerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         SystemAdminWorkAreaJPanel cap =  new SystemAdminWorkAreaJPanel(userProcessContainer,ecosystem);  
         userProcessContainer.add("SystemAdminWorkAreaJPanel",cap);
         CardLayout layout = (CardLayout)userProcessContainer.getLayout();
         layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
 private void populateTable1() {
        DefaultTableModel model1 = (DefaultTableModel)table1.getModel();
        model1.setRowCount(0);
        //System.out.println(ecosystem.getOrganizationDirectory().getOrganizationList().get(3).getUserAccountDirectory().getUserAccountList());
      
                for(UserAccount ur : ecosystem.getOrganizationDirectory().getOrganizationList().get(1).getUserAccountDirectory().getUserAccountList()){
                 Object[] row = new Object[2];
                 row[0] = ur;
                 row[1] = ur.getPassword();
            
          
                model1.addRow(row);    
            }  
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateCustomer;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JButton btnUpdateCustomer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}