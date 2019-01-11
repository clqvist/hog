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
public class lararElev extends javax.swing.JFrame {

    private InfDB idb;
    private validering val;
    UpdateCombobox updateCBox;

    /**
     * Creates new form lararElev
     */
    public lararElev() {
        initComponents();
        val = new validering();
        try {
            idb = new InfDB(Hog.userDir);
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
        btnAddElev = new javax.swing.JButton();
        btnChangeElev = new javax.swing.JButton();
        btnHanteraBetyg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFaltFornamnNy = new javax.swing.JTextField();
        txtFaltEfternamnNy = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFaltFornamnOld = new javax.swing.JTextField();
        txtFaltEfternamnOld = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboxSovsal = new javax.swing.JComboBox<>();
        updateCBox.cboxAddSovsal(cboxSovsal);
        cboxSovsalOld = new javax.swing.JComboBox<>();
        updateCBox.cboxAddSovsal(cboxSovsalOld);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTillbaka.setText("Gå Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnAddElev.setText("Registrera ny elev");
        btnAddElev.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAddElev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddElevActionPerformed(evt);
            }
        });

        btnChangeElev.setText("Ändra elevuppgifter");
        btnChangeElev.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnChangeElev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeElevActionPerformed(evt);
            }
        });

        btnHanteraBetyg.setText("Hantera kursbetyg");
        btnHanteraBetyg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHanteraBetyg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHanteraBetygActionPerformed(evt);
            }
        });

        jLabel1.setText("Förnamn");

        jLabel2.setText("Efternamn");

        jLabel3.setText("Sovsal");

        txtFaltFornamnNy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaltFornamnNyActionPerformed(evt);
            }
        });

        txtFaltEfternamnNy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaltEfternamnNyActionPerformed(evt);
            }
        });

        txtOutput.setEditable(false);
        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Nya uppg.");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Gamla uppg.*");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Elevadministration");

        jLabel7.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        jLabel7.setText("*Används bara vid uppdatering av befintlig elev.");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Betysadministration");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnChangeElev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddElev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTillbaka, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel6))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFaltFornamnNy, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(txtFaltEfternamnNy)
                                    .addComponent(jLabel4)
                                    .addComponent(cboxSovsal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFaltFornamnOld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFaltEfternamnOld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboxSovsalOld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(btnHanteraBetyg))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddElev)
                        .addComponent(txtFaltFornamnNy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFaltFornamnOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangeElev)
                    .addComponent(jLabel2)
                    .addComponent(txtFaltEfternamnNy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFaltEfternamnOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboxSovsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxSovsalOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHanteraBetyg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnTillbaka)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new lararStart().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnAddElevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddElevActionPerformed
        try {
            String fornamn = txtFaltFornamnNy.getText();
            String efternamn = txtFaltEfternamnNy.getText();
            String sovsal = (String) cboxSovsal.getSelectedItem();

            if (val.txtFieldEmpty(txtFaltFornamnNy) && val.txtFieldEmpty(txtFaltEfternamnNy)) {
                fornamn = val.formatName(fornamn); //Formaterar namnet så det fungerar i databasen
                efternamn = val.formatName(efternamn);
                String increment = idb.getAutoIncrement("ELEV", "ELEV_ID");
                String fraga = "INSERT INTO ELEV VALUES (" + "" + increment + " " + ", '" + fornamn + "', '" + efternamn + "', '" + sovsal + "');";
                idb.insert(fraga);

                txtOutput.setText("En ny elev har registrerats");
                txtFaltFornamnNy.setText(null);
                txtFaltEfternamnNy.setText(null);
            }

        } catch (InfException undantag) { //om databasen inte hittas så kommer ett felmeddelande upp
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }
    }//GEN-LAST:event_btnAddElevActionPerformed

    private void btnChangeElevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeElevActionPerformed
        String nyttFnamn = txtFaltFornamnNy.getText();
        String nyttEnamn = txtFaltEfternamnNy.getText();
        String newSovsal = (String) cboxSovsal.getSelectedItem();
        String oldFnamn = txtFaltFornamnOld.getText();
        String oldEnamn = txtFaltEfternamnOld.getText();
        String oldSovsal = (String) cboxSovsalOld.getSelectedItem();

        try {
            if (val.txtFieldEmpty(txtFaltFornamnNy) && val.txtFieldEmpty(txtFaltEfternamnNy) && val.txtFieldEmpty(txtFaltFornamnOld)) {
                oldFnamn = val.formatName(oldFnamn); //Formaterar namnet så det fungerar i databasen
                oldEnamn = val.formatName(oldEnamn);
                String z = idb.fetchSingle("SELECT FORNAMN FROM ELEV WHERE FORNAMN = '" + oldFnamn + "' ");
                String x = idb.fetchSingle("SELECT EFTERNAMN FROM ELEV WHERE EFTERNAMN = '" + oldEnamn + "' ");
                String y = idb.fetchSingle("SELECT SOVSAL FROM ELEV WHERE SOVSAL = '" + oldSovsal + "' ");

                if (val.isNameCorrect(oldFnamn, oldEnamn)) {

                    if (!oldFnamn.equals(z) && !oldEnamn.equals(x) && !oldSovsal.equals(y)) {
                        JOptionPane.showMessageDialog(null, "Du har angett fel värden.");
                    } else {
                        nyttFnamn = val.formatName(nyttFnamn); //Formaterar namnet så det fungerar i databasen
                        nyttEnamn = val.formatName(nyttEnamn);
                        String temp = idb.fetchSingle("SELECT ELEV_ID FROM ELEV WHERE FORNAMN = '" + oldFnamn + "' AND EFTERNAMN = '" + oldEnamn + "' AND SOVSAL = '" + oldSovsal + "' ");
                        idb.update("UPDATE ELEV SET FORNAMN = '" + nyttFnamn + "', EFTERNAMN = '" + nyttEnamn + "', SOVSAL = '" + newSovsal + "' WHERE ELEV_ID = '" + temp + "' ");

                        txtOutput.setText("Elevens information har uppdateras");
                        txtFaltFornamnNy.setText(null);
                        txtFaltFornamnOld.setText(null);
                        txtFaltEfternamnNy.setText(null);
                        txtFaltEfternamnOld.setText(null);
                    }

                }
            }
        } catch (InfException undantag) { //om databasen inte hittas så kommer ett felmeddelande upp
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }

    }//GEN-LAST:event_btnChangeElevActionPerformed

    private void txtFaltFornamnNyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaltFornamnNyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaltFornamnNyActionPerformed

    private void txtFaltEfternamnNyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaltEfternamnNyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaltEfternamnNyActionPerformed

    private void btnHanteraBetygActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHanteraBetygActionPerformed
        new elevBetygReg().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHanteraBetygActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddElev;
    private javax.swing.JButton btnChangeElev;
    private javax.swing.JButton btnHanteraBetyg;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cboxSovsal;
    private javax.swing.JComboBox<String> cboxSovsalOld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFaltEfternamnNy;
    private javax.swing.JTextField txtFaltEfternamnOld;
    private javax.swing.JTextField txtFaltFornamnNy;
    private javax.swing.JTextField txtFaltFornamnOld;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
