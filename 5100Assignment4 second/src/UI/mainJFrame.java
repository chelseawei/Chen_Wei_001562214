/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.City;
import model.Community;
import model.Encounter;
import model.House;
import model.Patient;
import model.PatientDirectory;

import model.Person;
import model.PersonDirectory;
import model.VitalSigns;


/**
 *
 * @author chen.wei
 */
public class mainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainJFrame
     */
    
    City city;
    PersonDirectory person;
    PatientDirectory patient;
   
    public mainJFrame() {
        initComponents();
        person = new PersonDirectory();
        city = new City("boston");
        patient = new PatientDirectory();
        iniData();
    
    }
    
    
    public void iniData(){
        Person person1 = new Person("Alice","34","house1","community1","boston",140);
        Person person2 = new Person("Bob","3","house1","community1","boston",110);
        Person person3 = new Person("Susan","87","house2","community2","boston",120);
        Person person4 = new Person("Alien","32","house2","community2","boston",140);
        Person person5 = new Person("Ann","24","house21","community2","boston",150);
        Person person6 = new Person("Mike","54","house11","community1","boston",160);
        Person person7 = new Person("Jenny","14","house11","community1","boston",170);
        Person person8 = new Person("Rita","74","house21","community2","boston",100);
        person.addNewPerson(person1);
        person.addNewPerson(person2);
        person.addNewPerson(person3);
        person.addNewPerson(person4);
        person.addNewPerson(person5);
        person.addNewPerson(person6);
        person.addNewPerson(person7);
        person.addNewPerson(person8);
        House house1 = new House("house1");
        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(person1);
        list1.add(person2);
        house1.setPersonList(list1);
        House house2 = new House("house2");
        ArrayList<Person> list2 = new ArrayList<>();
        list2.add(person3);
        list2.add(person4);
        house2.setPersonList(list2);
        House house11 = new House("house11");
         ArrayList<Person> list3 = new ArrayList<>();
        list3.add(person6);
        list3.add(person7);
        house11.setPersonList(list3);
        House house21 = new House("house21");
         ArrayList<Person> list4 = new ArrayList<>();
        list4.add(person5);
        list4.add(person8);
        house21.setPersonList(list4);
        Community community1 = new Community("communuty1");
        Community community2 = new Community("communuty2");
        ArrayList<House> houseList1 = new ArrayList<>();
        houseList1.add(house1);
        houseList1.add(house11);
        community1.setHouseList(houseList1);
        ArrayList<House> houseList2 = new ArrayList<>();
        houseList2.add(house2);
        houseList2.add(house21);
        community2.setHouseList(houseList2);
        ArrayList<Community> communityList = new ArrayList<>();
        communityList.add(community1);
        communityList.add(community2);
        
        
       
        city.setCommunityList(communityList);
        VitalSigns v1 = new VitalSigns("2020-3-2",150,37);
        VitalSigns v2 = new VitalSigns("2020-4-2",160,38);
        VitalSigns v3 = new VitalSigns("2020-5-2",170,36);
        VitalSigns v4 = new VitalSigns("2020-6-2",165,37);
        VitalSigns v5 = new VitalSigns("2018-7-23",165,37);
        VitalSigns v6 = new VitalSigns("2016-8-17",165,37);
        VitalSigns v7 = new VitalSigns("2014-9-29",165,37);
        
        Encounter encounter1 = new Encounter();
        encounter1.getEncouter().add(v1);
        encounter1.getEncouter().add(v2);
        Encounter encounter2 = new Encounter();
        encounter2.getEncouter().add(v3);
        encounter2.getEncouter().add(v4);
        Encounter encounter3 = new Encounter(); 
        encounter3.getEncouter().add(v5);
        Encounter encounter4 = new Encounter();
        encounter4.getEncouter().add(v6);
        Encounter encounter5 = new Encounter(); 
        encounter5.getEncouter().add(v7);
            
        //city1.setCommunityList();
        for(Person p : person.getCatalog()){
            if(p.getBloodPressure() > 130){
                
  
               Patient q = new Patient(p.getNeme(),p.getAge(),p.getHouse(),p.getCommunity(),p.getCity(),p.getBloodPressure());
    
                patient.addNewPatient(q);
            }
        }
        patient.getCatalog().get(0).setEncounter(encounter1);
        patient.getCatalog().get(1).setEncounter(encounter2);
        patient.getCatalog().get(2).setEncounter(encounter3);
        patient.getCatalog().get(3).setEncounter(encounter4);
        patient.getCatalog().get(4).setEncounter(encounter5);
        
        //System.out.println(patient.getCatalog().get(0).getEncounter());
      
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        createPanel = new javax.swing.JPanel();
        btnCity = new javax.swing.JButton();
        btnPerson = new javax.swing.JButton();
        btnPatient = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 600));

        createPanel.setEnabled(false);

        btnCity.setText("City");
        btnCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityActionPerformed(evt);
            }
        });

        btnPerson.setText("Person");
        btnPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonActionPerformed(evt);
            }
        });

        btnPatient.setText("Patient");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createPanelLayout = new javax.swing.GroupLayout(createPanel);
        createPanel.setLayout(createPanelLayout);
        createPanelLayout.setHorizontalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btnCity)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPerson)
                .addContainerGap())
            .addGroup(createPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPatient)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        createPanelLayout.setVerticalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnCity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPerson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPatient)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(createPanel);

        workArea.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityActionPerformed
        // TODO add your handling code here:
        
        cityJPanel cjp = new cityJPanel(workArea,city,person,patient);
       
        workArea.add("cityJPanel",cjp);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnCityActionPerformed

    private void btnPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonActionPerformed
        // TODO add your handling code here:
        PersonJPanel pejp = new PersonJPanel(workArea,person);
        workArea.add("PersonJPanel",pejp);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnPersonActionPerformed

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // TODO add your handling code here:
         PatientJPanel pejp = new PatientJPanel(workArea,patient);
        workArea.add("PatientJPanel",pejp);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnPatientActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCity;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnPerson;
    private javax.swing.JPanel createPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
