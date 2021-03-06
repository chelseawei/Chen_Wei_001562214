/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.House;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.VitalSigns;




/**
 *
 * @author chen.wei
 */
public class VitalSignsJPanel extends javax.swing.JPanel {

    /** Creates new form VitalSignsJPanel */
    private JPanel workArea;
    private Patient patient;
    private Person person;
    private PatientDirectory patientDirectory;
    public VitalSignsJPanel(JPanel workArea,Patient patient) {
        initComponents();
        this.workArea = workArea;
        this.patient = patient;
        populateTable1();
    }
    public void populateTable1() {
        DefaultTableModel model1 = (DefaultTableModel)table1.getModel();
        model1.setRowCount(0);
        for(VitalSigns p: patient.getEncounter().getEncouter()){
            
            Object[] row = new Object[3];
            row[0] = p;
            row[1] = p.getBloodPressure();
            row[2] = p.getTemperature();
            
          
            model1.addRow(row);
        }
        
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        lbTitle = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "BloodPressure", "Temperature"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        lbTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Encounter History");

        btnCreate.setText("Create new Encounter");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Encounter");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update Encounter");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
                    .addComponent(lbTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnCreate)
                                .addGap(28, 28, 28)
                                .addComponent(btnDelete)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate))
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
         addNewCounterJPanel vdjp = new addNewCounterJPanel(workArea,patient,patientDirectory);
       
            workArea.add("addNewCounterJPanel",vdjp);
        
            CardLayout layout = (CardLayout)workArea.getLayout();
        
           layout.next(workArea);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = table1.getSelectedRow();
        if(selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "please select the row to delete");
            return;
        }else{
            DefaultTableModel model = (DefaultTableModel)table1.getModel();
            VitalSigns v1 = (VitalSigns)model.getValueAt(selectedRowIndex, 0);
            //System.out.println(v1);
            patient.getEncounter().delete(v1.getDate());
            populateTable1();
            JOptionPane.showMessageDialog(this, "encounter deleted");
           
            
        } 
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = table1.getSelectedRow();
        if(selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "please select the row to update");
            return;
        }else{
            DefaultTableModel model = (DefaultTableModel)table1.getModel();
            VitalSigns v1 = (VitalSigns)model.getValueAt(selectedRowIndex, 0);
            //System.out.println(v1);
           
            updateVitalJPanel vdjp = new updateVitalJPanel(workArea,patient,v1);
       
            workArea.add("updateVitalJPanel",vdjp);
        
            CardLayout layout = (CardLayout)workArea.getLayout();
        
           layout.next(workArea);
            
        } 
    }//GEN-LAST:event_btnUpdateActionPerformed
private void backAction() {
        
        workArea.remove(this);
        Component[] componentArray = workArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PatientJPanel vp = (PatientJPanel) component;
        //vp.refreshTable();
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables

}
