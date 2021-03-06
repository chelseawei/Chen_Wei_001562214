/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.Product;
import model.ProductCatalog;
import UI.TimeUtil;

/**
 *
 * @author chen.wei
 */
public class mainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainJFrame
     */
    ProductCatalog catalog;
    private TimeUtil tu;
    public mainJFrame() {
        initComponents();
        catalog = new ProductCatalog();
        iniData();
    
    }
    
    
    public void iniData(){
        Product product = new Product();
        
        Product product1 =new Product("tesla","2021",5,"t34567","t5",true,"com3",false,"malden");
        Product product2 =new Product("tesla","2020",5,"t23456","t4",false,"com1",true,"boston");
        Product product3 =new Product("tesla","2019",4,"t12345","t3",true,"com1",false,"boston");
        Product product4 =new Product("ford","2011",5,"f34567","f4",true,"fmc2",false,"malden");
        Product product5 =new Product("ford","2012",7,"f12345","f2",false,"fmc1",true,"malden");
        Product product6 =new Product("volvo","2013",5,"v12345","v20",true,"jmc2",false,"tokyo");
        Product product7 =new Product("honda","2014",5,"h12345","h12",true,"jmc2",false,"tokyo");
        Product product8 =new Product("toyota","2015",5,"t12345","t24",true,"jmc2",false,"tokyo");
        Product product9 =new Product("benz","2016",6,"b12345","b3",true,"bmc2",false,"berlin");
        
        catalog.addNewProduct(product1);
        catalog.addNewProduct(product2);
        catalog.addNewProduct(product3);
        catalog.addNewProduct(product4); 
        catalog.addNewProduct(product5);
        catalog.addNewProduct(product6);
        catalog.addNewProduct(product7);
        catalog.addNewProduct(product8);
        catalog.addNewProduct(product9);
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
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 600));

        createPanel.setEnabled(false);

        btnCreate.setText("create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnView.setText("view");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createPanelLayout = new javax.swing.GroupLayout(createPanel);
        createPanel.setLayout(createPanelLayout);
        createPanelLayout.setHorizontalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        createPanelLayout.setVerticalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnView)
                .addContainerGap(309, Short.MAX_VALUE))
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

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
//        createJPanel createPanel = new createJPanel(catalog);
//        jSplitPane1.setRightComponent(createPanel);
         createJPanel awajp = new createJPanel(workArea, catalog);
        workArea.add("createJPanel",awajp);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
   
//        viewJPanel viewPanel = new viewJPanel(workArea,catalog);
//        jSplitPane1.setRightComponent(viewPanel);
        viewJPanel awajp = new viewJPanel(workArea, catalog );
        workArea.add("viewJPanel",awajp);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.next(workArea);
        
    }//GEN-LAST:event_btnViewActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel createPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
