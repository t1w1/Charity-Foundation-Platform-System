/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Charity;

import Business.Enterprise.CharityEnterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author kathe
 */
public class VolunteerWorkAreaJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    private UserAccount userAccount;
    private CharityEnterprise charity;
    /**
     * Creates new form VolunteerWorkAreaJPanel
     */
    public VolunteerWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount,CharityEnterprise charity) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.charity=charity;
        valueLabel.setText(charity.getName());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        assignJButton = new javax.swing.JButton();
        viewEvaluationJButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(194, 222, 164));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        valueLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 180, 26));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText("Volunteer Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 360, 39));

        assignJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        assignJButton.setText("Assign Work Request");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 200, -1));

        viewEvaluationJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        viewEvaluationJButton.setText("View Work Evaluation");
        viewEvaluationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEvaluationJButtonActionPerformed(evt);
            }
        });
        add(viewEvaluationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 200, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Enterprise:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\NEU_Study\\INFO 5100 Spring\\Final_Project_Zeta\\Zeta_Images\\voltunnerxx2.png")); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 490, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        // TODO add your handling code here:
        AssignVolunteerJPanel assignVolunteerJPanel=new AssignVolunteerJPanel(userProcessContainer,userAccount,charity);
        userProcessContainer.add("AssignVolunteerJPanel",assignVolunteerJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void viewEvaluationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEvaluationJButtonActionPerformed
        // TODO add your handling code here:
        ViewVolunteerEvaluationJPanel viewVolunteerEvaluationJPanel=new ViewVolunteerEvaluationJPanel(userProcessContainer,userAccount,charity);
        userProcessContainer.add("ViewVolunteerEvaluationJPanel",viewVolunteerEvaluationJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewEvaluationJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton viewEvaluationJButton;
    // End of variables declaration//GEN-END:variables
}