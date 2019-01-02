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

    /**
     * Creates new form lararElev
     */
    public lararElev() {
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
        btnAddElev = new javax.swing.JButton();
        btnChangeElev = new javax.swing.JButton();
        btnHanteraBetyg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFaltSovsal = new javax.swing.JTextField();
        txtFaltFornamn = new javax.swing.JTextField();
        txtFaltEfternamn = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        btnGeneratePW = new javax.swing.JButton();
        btnListaElever = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTillbaka.setText("Gå Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnAddElev.setText("Registrera Elev");
        btnAddElev.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAddElev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddElevActionPerformed(evt);
            }
        });

        btnChangeElev.setText("Ändra Elevinfo");
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

        txtFaltSovsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaltSovsalActionPerformed(evt);
            }
        });

        txtFaltFornamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaltFornamnActionPerformed(evt);
            }
        });

        txtFaltEfternamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaltEfternamnActionPerformed(evt);
            }
        });

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        btnGeneratePW.setText("Generera lösenord //LÅG");
        btnGeneratePW.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnListaElever.setText("Lista elever //LÅG");
        btnListaElever.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnChangeElev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddElev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTillbaka, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFaltFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFaltEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtFaltSovsal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(26, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHanteraBetyg)
                            .addComponent(btnGeneratePW)
                            .addComponent(btnListaElever))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddElev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChangeElev))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFaltFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFaltSovsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFaltEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHanteraBetyg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGeneratePW)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnListaElever)
                        .addGap(76, 76, 76)
                        .addComponent(btnTillbaka))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new lararStart().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnAddElevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddElevActionPerformed
        try {
            String fornamn = txtFaltFornamn.getText();
            String efternamn = txtFaltEfternamn.getText();
            String sovsal = txtFaltSovsal.getText();

            //Combobox för att välja sovsal?
            if (!fornamn.isEmpty() && !efternamn.isEmpty() && !sovsal.isEmpty()) {
                String increment = idb.getAutoIncrement("ELEV", "ELEV_ID");
                System.out.println(increment);
                String fraga = "INSERT INTO ELEV VALUES (" + "" + increment + " " + ", '" + fornamn + "', '" + efternamn + "', '" + sovsal + "');";
                System.out.println(fraga);
                idb.insert(fraga);

                txtOutput.setText("En ny elev har registrerats");
            }
        } catch (InfException undantag) { //om databasen inte hittas så kommer ett felmeddelande upp
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + undantag.getMessage());
        }
    }//GEN-LAST:event_btnAddElevActionPerformed

    private void btnChangeElevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeElevActionPerformed
        //new lararElevInfo().setVisible(true);
        //dispose();
    }//GEN-LAST:event_btnChangeElevActionPerformed

    private void txtFaltSovsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaltSovsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaltSovsalActionPerformed

    private void txtFaltFornamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaltFornamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaltFornamnActionPerformed

    private void txtFaltEfternamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaltEfternamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaltEfternamnActionPerformed

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
    private javax.swing.JButton btnGeneratePW;
    private javax.swing.JButton btnHanteraBetyg;
    private javax.swing.JButton btnListaElever;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFaltEfternamn;
    private javax.swing.JTextField txtFaltFornamn;
    private javax.swing.JTextField txtFaltSovsal;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
