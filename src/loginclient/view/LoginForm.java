/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginclient.view;

import javax.swing.JOptionPane;
import loginclient.logic.connection.ConnectionDB;
import loginclient.logic.dao.UserDAOIMP;

/**
 *
 * @author Kevin Chavarria
 */
public class LoginForm extends javax.swing.JFrame {
     private ConnectionDB con= null;
     private UserDAOIMP us= null;
     private UpdateForm updateform=null;
    public LoginForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        accountTF = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passwordTF = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        signedCB = new javax.swing.JCheckBox();
        forgotpassLabel = new javax.swing.JLabel();
        loginButtom = new javax.swing.JButton();
        createaccLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("login");
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginclient/images/imagen.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("The Bold Font", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Login account");

        accountTF.setBackground(new java.awt.Color(255, 255, 255));
        accountTF.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        accountTF.setForeground(new java.awt.Color(102, 102, 102));
        accountTF.setText("account");
        accountTF.setBorder(null);
        accountTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountTFActionPerformed(evt);
            }
        });

        passwordTF.setBackground(new java.awt.Color(255, 255, 255));
        passwordTF.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        passwordTF.setForeground(new java.awt.Color(102, 102, 102));
        passwordTF.setText("jPasswordField1");
        passwordTF.setBorder(null);
        passwordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTFActionPerformed(evt);
            }
        });

        signedCB.setBackground(new java.awt.Color(255, 255, 255));
        signedCB.setForeground(new java.awt.Color(51, 51, 51));
        signedCB.setText("keep me signed");

        forgotpassLabel.setForeground(new java.awt.Color(51, 51, 255));
        forgotpassLabel.setText("forgot password?");
        forgotpassLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpassLabelMouseClicked(evt);
            }
        });

        loginButtom.setBackground(new java.awt.Color(0, 51, 255));
        loginButtom.setFont(new java.awt.Font("The Bold Font", 0, 12)); // NOI18N
        loginButtom.setForeground(new java.awt.Color(255, 255, 255));
        loginButtom.setText("Login");
        loginButtom.setBorder(null);
        loginButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtomActionPerformed(evt);
            }
        });

        createaccLabel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        createaccLabel.setForeground(new java.awt.Color(51, 51, 255));
        createaccLabel.setText("create account");
        createaccLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createaccLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(createaccLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(signedCB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(forgotpassLabel))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createaccLabel)
                .addGap(75, 75, 75))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(102, 102, 102)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(47, 47, 47)
                    .addComponent(accountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(3, 3, 3)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(signedCB)
                        .addComponent(forgotpassLabel))
                    .addGap(26, 26, 26)
                    .addComponent(loginButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(102, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accountTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountTFActionPerformed

    private void createaccLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createaccLabelMouseClicked
        RegistrationForm registerform = new RegistrationForm();
        registerform.setVisible(true);
    }//GEN-LAST:event_createaccLabelMouseClicked

    private void loginButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtomActionPerformed
      con= new ConnectionDB();
      us= new UserDAOIMP(con.connect());
      
      if (us.verifyAcc(accountTF.getText(),String.valueOf(passwordTF.getPassword()))){
          JOptionPane.showMessageDialog(rootPane,"you are logg");
      }
      else{
          System.out.println("no estas logeado");
      }
    }//GEN-LAST:event_loginButtomActionPerformed

    private void passwordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTFActionPerformed

    private void forgotpassLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpassLabelMouseClicked
        updateform= new UpdateForm();
        updateform.setVisible(true);
    }//GEN-LAST:event_forgotpassLabelMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountTF;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel createaccLabel;
    private javax.swing.JLabel forgotpassLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton loginButtom;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JCheckBox signedCB;
    // End of variables declaration//GEN-END:variables
}
