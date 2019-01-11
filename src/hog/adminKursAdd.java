/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hog;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Christoffer
 */
public class adminKursAdd extends javax.swing.JFrame {

    /**
     * Creates new form adminKursAdd
     */
    private InfDB idb;
    private validering val;
    UpdateCombobox swag;

    public adminKursAdd() {
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
        txtKursnamn = new javax.swing.JTextField();
        dateStart = new org.jdesktop.swingx.JXDatePicker();
        dateEnd = new org.jdesktop.swingx.JXDatePicker();
        btnAddKurs = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtOutput = new javax.swing.JTextField();
        cboxLarare = new javax.swing.JComboBox<>();
        swag.cboxAddLarare(cboxLarare);
        jLabel5 = new javax.swing.JLabel();
        cboxAmne = new javax.swing.JComboBox<>();
        swag.cboxAddAmne(cboxAmne);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTillbaka.setText("Gå Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnAddKurs.setText("Lägg Till Kurs");
        btnAddKurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddKursActionPerformed(evt);
            }
        });

        jLabel1.setText("Kursnamn");

        jLabel4.setText("Ämne");

        txtOutput.setEditable(false);

        jLabel5.setText("Lärare");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddKurs)
                                .addGap(18, 18, 18)
                                .addComponent(txtOutput))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKursnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(cboxLarare, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboxAmne, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(60, 60, 60))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKursnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxLarare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxAmne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddKurs)
                    .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new adminKurs().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnAddKursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddKursActionPerformed
        //DateFormat används för att formattera datumet som skrivs in till ett format som kan användas i en sql fråga
        if (val.txtFieldEmpty(txtKursnamn)) {
            DateFormat formatDatum = new SimpleDateFormat("yyyy-MM-dd"); //Säger att jag senare vill formatera datumet till yyyy-MM-dd
            try {
                String startDatum = formatDatum.format(dateStart.getDate()); //Gör om datumet till en String med rätt format
                String slutDatum = formatDatum.format(dateEnd.getDate()); //Gör om datumet till en String med rätt format
                try {
                    String kursnamn = txtKursnamn.getText();
                    String amne = (String) cboxAmne.getSelectedItem(); //Tar det valda värdet ur comboxboxen och sätter det i en sträng
                    String larare = (String) cboxLarare.getSelectedItem();
                    String larareFornamn = larare.split(" ")[0]; //Delar upp lärarnamnet i två strings
                    String larareEfternamn = larare.split(" ")[1];
                    String increment = idb.getAutoIncrement("KURS", "KURS_ID"); //Hämtar vad som ska bli nästa kursid i databasen med hjälp av getAutoIncrement

                    String fraga = "SELECT AMNE_ID FROM AMNE WHERE AMNESNAMN = '" + amne + "';";
                    String svar = idb.fetchSingle(fraga);

                    fraga = "SELECT LARAR_ID FROM LARARE WHERE FORNAMN = '" + larareFornamn + "' AND EFTERNAMN = '" + larareEfternamn + "';";
                    String lararID = idb.fetchSingle(fraga);

                    fraga = "INSERT INTO KURS VALUES ('" + increment + "', '" + kursnamn + "', '" + startDatum + "', '" + slutDatum + "', '" + lararID + "', '" + svar + "');";
                    System.out.println(fraga);
                    idb.insert(fraga);
                    txtOutput.setText("Kursen " + kursnamn + " har nu lagts till");

                } catch (InfException undantag) { //Fångar upp databasfel
                    JOptionPane.showMessageDialog(null, "Något gick fel");
                    System.out.println("Internt felmeddelande" + undantag.getMessage());
                }
            } catch (NullPointerException e) { //Fångar upp fel om man ej anger två korrekta datum
                JOptionPane.showMessageDialog(null, "Ange två korrekta datum");
                System.out.println("Ange två korrekta datum" + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnAddKursActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddKurs;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cboxAmne;
    private javax.swing.JComboBox<String> cboxLarare;
    private org.jdesktop.swingx.JXDatePicker dateEnd;
    private org.jdesktop.swingx.JXDatePicker dateStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtKursnamn;
    private javax.swing.JTextField txtOutput;
    // End of variables declaration//GEN-END:variables
}
