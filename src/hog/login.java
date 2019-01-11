/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hog;

import javax.swing.JOptionPane;
/**
 *
 * @author Christoffer
 */
public class login extends javax.swing.JFrame {
    //Importerar validerinsklassen
    private validering val;

    /**
     * Creates new form larareStart
     */
    public login() {
        initComponents();
        val = new validering();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTillbaka = new javax.swing.JToggleButton();
        btnLoginLarare = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLoginAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTillbaka.setText("Gå Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnLoginLarare.setText("Lärare");
        btnLoginLarare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginLarareActionPerformed(evt);
            }
        });

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        btnLoginAdmin.setText("Admin");
        btnLoginAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnTillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername)
                            .addComponent(txtPassword)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLoginLarare, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoginLarare)
                    .addComponent(btnLoginAdmin))
                .addGap(111, 111, 111)
                .addComponent(btnTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        //Stänger ner den här rutan och går tillbaka till startsidan
        new valElevLarare().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        //Ska vara tomt
    }//GEN-LAST:event_txtUsernameActionPerformed
    //Testknapp, ta bort ur systemet sen (används för att skippa inloggning
    private void btnLoginLarareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginLarareActionPerformed
        if (val.isUsernameCorrect(txtUsername)) {
            String pws = new String(txtPassword.getPassword());
            if(val.isPasswordCorrect(txtUsername, pws) && val.isUsernameCorrect(txtUsername)) {
                new lararStart().setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_btnLoginLarareActionPerformed
    //Loggar in användaren i systemet om valideringen stämmer
    private void btnLoginAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAdminActionPerformed
        //Kollar om användarnamnet finns i databasen
        if (val.isUsernameCorrect(txtUsername)) {
            String pws = new String(txtPassword.getPassword());
            //Kollar om användarnamnet är lagrad som en admin i databasen, och om lösenordet stämmer överens med användarnamnet
            if(val.isAdminCorrect(txtUsername) && val.isPasswordCorrect(txtUsername, pws)) {
                //Kör konstruktorn i adminStart och öppnar det fönstret
                new adminStart().setVisible(true);
                //Stänger ner login rutan
                dispose();
                } else if (val.isPasswordCorrect(txtUsername, pws) && val.isUsernameCorrect(txtUsername)) {
                //Om det ovanstående returnerar true betyder det att användarens lösenord stämmer överens med använarnamnet i databasen
                //Och då körs konstruktorn i lararStart och öppnar det fönstret
                JOptionPane.showMessageDialog(null, "Du är inte admin, testa logga in som lärare istället");
                
            }
        }
    }//GEN-LAST:event_btnLoginAdminActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginAdmin;
    private javax.swing.JButton btnLoginLarare;
    private javax.swing.JToggleButton btnTillbaka;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
