/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hog;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Christoffer
 */
public class lararStart extends javax.swing.JFrame {
    
    private InfDB idb;

    /**
     * Creates new form lararStart
     */
    public lararStart() {
        initComponents();
          try {
            idb = new InfDB("C:\\db\\HOGDB.FDB");
        } catch (InfException undantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTillbaka = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        btnAddStudent = new javax.swing.JButton();
        txtNewPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        cboxElevhem = new javax.swing.JComboBox<>();
        btnRemovePoints = new javax.swing.JButton();
        btnAddPoints = new javax.swing.JButton();
        txtPoang = new javax.swing.JTextField();
        txtOutput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTillbaka.setText("Gå Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnChangePassword.setText("Byt Lösenord");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        btnAddStudent.setText("Administrera Elev");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        jLabel1.setText("Nytt Lösenord");

        cboxElevhem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Slytherin", "Hufflepuff", "Gryffindor", "Ravenclaw" }));
        cboxElevhem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxElevhemActionPerformed(evt);
            }
        });

        btnRemovePoints.setText("Ta bort poäng");
        btnRemovePoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePointsActionPerformed(evt);
            }
        });

        btnAddPoints.setText("Lägg till poäng");
        btnAddPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPointsActionPerformed(evt);
            }
        });

        txtOutput.setEditable(false);

        jLabel2.setText("Hantera huspoäng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTillbaka)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboxElevhem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPoang, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddPoints)
                                    .addComponent(btnRemovePoints)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnChangePassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAddStudent))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2)))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangePassword)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnAddStudent)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemovePoints)
                    .addComponent(cboxElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPoints)
                    .addComponent(txtPoang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new valElevLarare().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        new lararElev().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void cboxElevhemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxElevhemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxElevhemActionPerformed

    private void btnRemovePointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePointsActionPerformed
        try {
            String itemText = (String) cboxElevhem.getSelectedItem(); //Tar det valda värdet ur comboxboxen och sätter det i en sträng
            int poang = Integer.parseInt(txtPoang.getText());
            String fraga ="SELECT HUSPOANG FROM ELEVHEM WHERE ELEVHEMSNAMN = '" + itemText + "';";
            poang = (Integer.parseInt(idb.fetchSingle(fraga)) - poang);
            System.out.println(poang);
            fraga = "UPDATE ELEVHEM SET HUSPOANG = '" + poang + "' WHERE ELEVHEMSNAMN = '" + itemText + "';";
            System.out.println(fraga);
            idb.update(fraga);
            txtOutput.setText(itemText + " har nu " + poang + " poäng.");

        }
        catch (InfException undantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }

    }//GEN-LAST:event_btnRemovePointsActionPerformed

    private void btnAddPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPointsActionPerformed
        try {
            String itemText = (String) cboxElevhem.getSelectedItem(); //Tar det valda värdet ur comboxboxen och sätter det i en sträng
            int poang = Integer.parseInt(txtPoang.getText());
            String fraga ="SELECT HUSPOANG FROM ELEVHEM WHERE ELEVHEMSNAMN = '" + itemText + "';";
            poang = (Integer.parseInt(idb.fetchSingle(fraga)) + poang);
            System.out.println(poang);
            fraga = "UPDATE ELEVHEM SET HUSPOANG = '" + poang + "' WHERE ELEVHEMSNAMN = '" + itemText + "';";
            System.out.println(fraga);
            idb.update(fraga);
            txtOutput.setText(itemText + " har nu " + poang + " poäng.");

        }
        catch (InfException undantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }
    }//GEN-LAST:event_btnAddPointsActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPoints;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnRemovePoints;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cboxElevhem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtOutput;
    private javax.swing.JTextField txtPoang;
    // End of variables declaration//GEN-END:variables
}
