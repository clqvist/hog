/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hog;

import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Jamie
 */
public class elevBetygReg extends javax.swing.JFrame {

    private InfDB idb;
    UpdateCombobox updateCBox;
    private validering val;

    /**
     * Creates new form elevBetygReg
     */
    public elevBetygReg() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFornamn = new javax.swing.JTextField();
        txtEfternamn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboxBetyg = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSvar = new javax.swing.JTextArea();
        btnNyttBetyg = new javax.swing.JButton();
        btnUppdateraBetyg = new javax.swing.JButton();
        cboxKurs = new javax.swing.JComboBox<>();
        updateCBox.cboxAddKurs(cboxKurs);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTillbaka.setText("Gå Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        jLabel1.setText("Hantera kursbetyg för elev");

        jLabel2.setText("Förnamn");

        jLabel3.setText("Efternamn");

        txtFornamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFornamnActionPerformed(evt);
            }
        });

        jLabel4.setText("Kursnamn");

        jLabel5.setText("Betyg");

        cboxBetyg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Troll", "Dreadful", "Poor", "Acceptable", "Exceeds Expectations", "Outstanding" }));

        txtSvar.setColumns(20);
        txtSvar.setRows(5);
        jScrollPane1.setViewportView(txtSvar);

        btnNyttBetyg.setText("Skapa nytt");
        btnNyttBetyg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyttBetygActionPerformed(evt);
            }
        });

        btnUppdateraBetyg.setText("Uppdatera befintligt");
        btnUppdateraBetyg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraBetygActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTillbaka)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNyttBetyg)
                                .addGap(18, 18, 18)
                                .addComponent(btnUppdateraBetyg))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(81, 81, 81)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboxKurs, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(cboxBetyg, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 260, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxBetyg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxKurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNyttBetyg)
                    .addComponent(btnUppdateraBetyg))
                .addGap(88, 88, 88)
                .addComponent(btnTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new lararElev().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnNyttBetygActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyttBetygActionPerformed
        //Registrerar ett nytt betyg för en elev på en kurs. OTESTAD!
        //Den här metoden behöver något som auto incrementar HAR_BETYG_I
        if (val.isString(txtFornamn) && val.isString(txtEfternamn)) {
            String fornamn = txtFornamn.getText();
            String efternamn = txtEfternamn.getText();
            fornamn = val.formatName(fornamn); //Formaterar namnet så det fungerar i databasen
            efternamn = val.formatName(efternamn);
            if (!(fornamn.isEmpty()) && !(efternamn.isEmpty())) {
                try {

                    String betyget = (String) cboxBetyg.getSelectedItem(); //Hämtar valet och sätter det i en sträng.
                    String kursnamn = (String) cboxKurs.getSelectedItem(); //Tar det valda värdet ur comboxboxen och sätter det i en sträng
                    String betygKort = betyget.substring(0, 1); //Förkortar betyget till en bokstav så det fungerar i databasen

                    //Hitta elevens elev id basserat på namnet
                    String elevID = idb.fetchSingle("SELECT ELEV_ID FROM ELEV WHERE FORNAMN = '" + fornamn + "' AND EFTERNAMN = '" + efternamn + "'; ");

                    //Hitta kursens kursID baserat på kursnamn
                    String kursID = idb.fetchSingle("SELECT KURS_ID FROM KURS WHERE KURSNAMN = '" + kursnamn + "'; ");

                    //Kollar vad för betyg som finns för elev på viss kurs
                    String betygFraga = null;
                    System.out.println(betygFraga);
                    betygFraga = idb.fetchSingle("SELECT KURSBETYG FROM HAR_BETYG_I WHERE ELEV_ID = '" + elevID + "' AND KURS_ID = '" + kursID + "'; ");
                    System.out.println(betygFraga);
                    if (betygFraga == null) {
                        idb.insert("INSERT INTO HAR_BETYG_I (ELEV_ID, KURS_ID, KURSBETYG) VALUES (' " + elevID + "', '" + kursID + " ' , '" + betygKort + " ')");
                        updateCBox.cboxAddKurs(cboxKurs);
                        txtSvar.setText("Betyget " + betyget + " har registrerats på " + kursnamn + " för " + fornamn);
                        txtFornamn.setText(null);
                        txtEfternamn.setText(null);
                    } else {
                        JOptionPane.showMessageDialog(null, "Eleven har redan betyg i kursen, testa uppdatera betyget istället");
                    }

                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Något gick fel");
                    System.out.println("Internt felmeddelande" + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Skriv in både för och efternamn");
            }
        }

    }//GEN-LAST:event_btnNyttBetygActionPerformed

    private void txtFornamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFornamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFornamnActionPerformed

    private void btnUppdateraBetygActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraBetygActionPerformed
        //Ska ändra ett gammalt betyg om det finns. OTESTAD!
        //Den här metoden behöver en kontrollfunktion för att se om tidigare betyg finns.

        try {

            String fornamn = txtFornamn.getText();
            String efternamn = txtEfternamn.getText();
            fornamn = val.formatName(fornamn); //Formaterar namnet så det fungerar i databasen
            efternamn = val.formatName(efternamn);
            String kursnamn = (String) cboxKurs.getSelectedItem(); //Tar det valda värdet ur comboxboxen och sätter det i en sträng
            String betyget = (String) cboxBetyg.getSelectedItem(); //Hämtar valet och sätter det i en sträng.
            String betygKort = betyget.substring(0, 1);
            System.out.println(betygKort);

            //Hitta elevens elev id basserat på namnet
            String fraga = "SELECT ELEV_ID FROM ELEV WHERE FORNAMN = '" + fornamn + "' AND EFTERNAMN = '" + efternamn + "'; ";
            String elevID = idb.fetchSingle(fraga);

            //Hitta kursens kursID baserat på kursnamn
            String fraga2 = "SELECT KURS_ID FROM KURS WHERE KURSNAMN = '" + kursnamn + "'; ";
            String kursID = idb.fetchSingle(fraga2);

            //Hämtar betyg baserat på KursID och EleviD
            HashMap<String, String> kursbetyg = new HashMap();
            kursbetyg = null;
            kursbetyg = idb.fetchRow("SELECT * FROM HAR_BETYG_I WHERE ELEV_ID = '" + elevID + "' AND KURS_ID = '" + kursID + "' ");

            if (kursbetyg != null) {

                //Uppdatera kursbetyget
                String fraga3 = "UPDATE HAR_BETYG_I SET KURSBETYG = '" + betygKort + "' WHERE ELEV_ID = '" + elevID + "' AND KURS_ID = '" + kursID + "' ";
                idb.update(fraga3);
                updateCBox.cboxAddKurs(cboxKurs);
                txtSvar.setText("Betyget " + betyget + " har registrerats på " + kursnamn + " för " + fornamn);
            } else {
                JOptionPane.showMessageDialog(null, "Eleven har inget betyg i den kursen. Skapa ett nytt.");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }//GEN-LAST:event_btnUppdateraBetygActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNyttBetyg;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnUppdateraBetyg;
    private javax.swing.JComboBox<String> cboxBetyg;
    private javax.swing.JComboBox<String> cboxKurs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEfternamn;
    private javax.swing.JTextField txtFornamn;
    private javax.swing.JTextArea txtSvar;
    // End of variables declaration//GEN-END:variables
}
