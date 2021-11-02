/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.CardLayout;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.House;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author chen.wei
 */
public class cityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form cityJPanel
     */
    private JPanel workArea;
    private City catalog;
    private House house;
    private Community community;
     private PersonDirectory personDirectory;
     private PatientDirectory patientDirectory;
    public cityJPanel(JPanel workArea,City catalog,PersonDirectory personDirectory,PatientDirectory patientDirectory) {
        initComponents();
        this.workArea = workArea;
        this.catalog = catalog;
        house =null;
        community = null;
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        populateCombo();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCity = new javax.swing.JLabel();
        comCity = new javax.swing.JComboBox<>();
        lbCommunity = new javax.swing.JLabel();
        comCommunity = new javax.swing.JComboBox<>();
        lbHouse = new javax.swing.JLabel();
        comHouse = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        btnAddPerson = new javax.swing.JButton();
        btnUpdatePerson = new javax.swing.JButton();
        btnDeletePerson = new javax.swing.JButton();
        btnCheckUnnormal = new javax.swing.JButton();
        txtTotalNumber = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();

        lbCity.setText("choose city:");

        comCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comCityActionPerformed(evt);
            }
        });

        lbCommunity.setText("choose community:");

        comCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comCommunityActionPerformed(evt);
            }
        });

        lbHouse.setText("choose house:");

        comHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comHouseActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "House", "Community", "City", "BloodPressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        btnAddPerson.setText("Create ");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        btnUpdatePerson.setText("Update ");
        btnUpdatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePersonActionPerformed(evt);
            }
        });

        btnDeletePerson.setText("Delete");
        btnDeletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePersonActionPerformed(evt);
            }
        });

        btnCheckUnnormal.setText("Community unnormal person");
        btnCheckUnnormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckUnnormalActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lbCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comCity, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAddPerson)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdatePerson)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDeletePerson)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCheckUnnormal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCommunity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbHouse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 35, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(77, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCity)
                    .addComponent(comCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCommunity)
                    .addComponent(comCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHouse)
                    .addComponent(comHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPerson)
                    .addComponent(btnUpdatePerson)
                    .addComponent(btnDeletePerson)
                    .addComponent(btnCheckUnnormal)
                    .addComponent(txtTotalNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
     private void populateCombo() {
        comCity.removeAllItems();
        comCity.addItem(catalog.getName());
        
            
        
     }
     private void populateCombo1() {
        comCommunity.removeAllItems();
       for(Community p : catalog.getCommunityList()){
            comCommunity.addItem(p.getName());
       }
        
            
        
     }
    private void comCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comCityActionPerformed
        // TODO add your handling code here:
      populateCombo1();
    }//GEN-LAST:event_comCityActionPerformed

    private void comCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comCommunityActionPerformed
        // TODO add your handling code here:
        String selectedCommunity = String.valueOf(comCommunity.getSelectedItem());
         comHouse.removeAllItems();
        for(Community p: catalog.getCommunityList()){
            if(selectedCommunity.equalsIgnoreCase(p.getName())){
                for(House q: p.getHouseList()){
                     comHouse.addItem(q.getName());
                }
                break;
            }
        }
    }//GEN-LAST:event_comCommunityActionPerformed

    private void comHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comHouseActionPerformed
        // TODO add your handling code here:
         String selectedCommunity = String.valueOf(comCommunity.getSelectedItem());
          String selectedHouse = String.valueOf(comHouse.getSelectedItem());
          for(Community p : catalog.getCommunityList()) {
             if(selectedCommunity.equalsIgnoreCase(p.getName())){
//                house =  p.getHouseList().get(0);
//                populateTable1( p.getHouseList().get(0));
                  for(House q: p.getHouseList()){
                      if(selectedHouse.equals(q.getName())){
                          house = q;
                          populateTable1(q);
                          break;
                      }
                  }
//                 
             }
          }
        //populateTable1();
    }//GEN-LAST:event_comHouseActionPerformed

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        // TODO add your handling code here:
        //Product product = (Product) table1.getValueAt(selectedRowIndex, 0);
        String city = String.valueOf(comCity.getSelectedItem());
        String community = String.valueOf(comCommunity.getSelectedItem());
        
        createPersonJPanel vdjp = new createPersonJPanel(workArea,city,community,house,personDirectory,patientDirectory);
       
        workArea.add("createPersonJPanel",vdjp);
        
        CardLayout layout = (CardLayout)workArea.getLayout();
        
        layout.next(workArea);
    }//GEN-LAST:event_btnAddPersonActionPerformed

    private void btnUpdatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePersonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = table1.getSelectedRow();
        if(selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "please select the row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        Person person = (Person) model.getValueAt(selectedRowIndex, 0);
        String city = String.valueOf(comCity.getSelectedItem());
        String community = String.valueOf(comCommunity.getSelectedItem());
        
        updatePersonJPanel vdjp = new updatePersonJPanel(workArea,person,patientDirectory);
       
        workArea.add("updatePersonJPanel",vdjp);
        
        CardLayout layout = (CardLayout)workArea.getLayout();
        
        layout.next(workArea);
    }//GEN-LAST:event_btnUpdatePersonActionPerformed

    private void btnDeletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePersonActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = table1.getSelectedRow();
        if(selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "please select the row to delete");
            return;
        }else{
            DefaultTableModel model = (DefaultTableModel)table1.getModel();
            Person person = (Person)model.getValueAt(selectedRowIndex, 0);
            if(person.getBloodPressure() >130){
                patientDirectory.delete(person.getNeme());
            }
            personDirectory.deletePerson(person);
            house.getPersonList().remove(person);
            refreshTable();
            JOptionPane.showMessageDialog(this, "product deleted");
           
            
        } 
       
    }//GEN-LAST:event_btnDeletePersonActionPerformed

    private void btnCheckUnnormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckUnnormalActionPerformed
        // TODO add your handling code here:
        String selectedCommunity = String.valueOf(comCommunity.getSelectedItem());
        for(Community c: catalog.getCommunityList()){
            if(c.getName().equals(selectedCommunity)){
                community = c;
            }
        }
        refreshTableForUnnomal(community);
    }//GEN-LAST:event_btnCheckUnnormalActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = table1.getSelectedRow();
        if(selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "please select the row to view");
            return;
        }else{
              DefaultTableModel model = (DefaultTableModel)table1.getModel();
              Person person = (Person) model.getValueAt(selectedRowIndex, 0);
              viewDetailsJPanel vdjp = new viewDetailsJPanel(workArea,person);
       
                workArea.add("viewDetailsJPanel",vdjp);

                CardLayout layout = (CardLayout)workArea.getLayout();

                layout.next(workArea);
            
        }
    }//GEN-LAST:event_btnViewActionPerformed
private void populateTable1(House house) {
        DefaultTableModel model1 = (DefaultTableModel)table1.getModel();
        model1.setRowCount(0);
        for(Person p: house.getPersonList()){
            //System.out.println(p.getSerialNumber());
            Object[] row = new Object[6];
            row[0] = p;
            row[1] = p.getAge();
            row[2] = p.getHouse();
            row[3] = p.getCommunity();
            row[4] = p.getCity();
            row[5] = p.getBloodPressure();
          
            model1.addRow(row);
        }
        
    }

 public void refreshTable() {
    DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.setRowCount(0);
        for(Person p:house.getPersonList()){
            //System.out.println(p.getSerialNumber());
            Object[] row = new Object[6];
            row[0] = p;
            row[1] = p.getAge();
            row[2] = p.getHouse();
            row[3] = p.getCommunity();
            row[4] = p.getCity();
            row[5] = p.getBloodPressure();
          
            model.addRow(row);
        }
    }
 public void refreshTableForUnnomal(Community community) {
    DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.setRowCount(0);
        int number = 0;
        for(House q: community.getHouseList()){
          for(Person p: q.getPersonList()){
            if(p.getBloodPressure() > 130) {
                number++;
                Object[] row = new Object[6];
                row[0] = p;
                row[1] = p.getAge();
                row[2] = p.getHouse();
                row[3] = p.getCommunity();
                row[4] = p.getCity();
                row[5] = p.getBloodPressure();
                model.addRow(row);
            }
            
            //System.out.println(p.getSerialNumber());
           
        }  
        }
        
        txtTotalNumber.setText(String.valueOf(number));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnCheckUnnormal;
    private javax.swing.JButton btnDeletePerson;
    private javax.swing.JButton btnUpdatePerson;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> comCity;
    private javax.swing.JComboBox<String> comCommunity;
    private javax.swing.JComboBox<String> comHouse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCity;
    private javax.swing.JLabel lbCommunity;
    private javax.swing.JLabel lbHouse;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtTotalNumber;
    // End of variables declaration//GEN-END:variables
}
