/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Charity;

import Business.Enterprise.CharityEnterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VolunteerWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kathe
 */
public class ProcessVolunteerJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    //private UserAccount useraccount;
    private VolunteerWorkRequest volunteerWorkRequest;
    /**
     * Creates new form ProcessVolunteerSubmitResultJPanel
     */
    public ProcessVolunteerJPanel(JPanel userProcessContainer,VolunteerWorkRequest volunteerWorkRequest) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.volunteerWorkRequest=volunteerWorkRequest;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(194, 222, 164));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        backJButton.setText("<<back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Result:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 110, -1));

        resultTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        resultTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultTextFieldActionPerformed(evt);
            }
        });
        add(resultTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 230, 30));

        submitJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\NEU_Study\\INFO 5100 Spring\\Final_Project_Zeta\\Zeta_Images\\wolunteerwpangea.gif")); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 820, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AssignVolunteerJPanel avj=(AssignVolunteerJPanel)component;
        avj.populateTable();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void resultTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultTextFieldActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        String submitresult=resultTextField.getText();
        
        if(volunteerWorkRequest.getResult()!=null){
            JOptionPane.showMessageDialog(this, "You can't submit result twice!", "INFORMATION", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(submitresult==null||submitresult.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "You must input something!");
            return;
        }else{
            JOptionPane.showMessageDialog(null, "Submit Successfully!");
            resultTextField.setText("");
        }
        
        volunteerWorkRequest.setResult(submitresult);
        volunteerWorkRequest.setStatus("Completed");
    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField resultTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}