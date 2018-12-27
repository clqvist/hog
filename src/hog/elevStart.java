/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hog;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Christoffer
 */
public class elevStart extends javax.swing.JFrame {

    private InfDB idb;
    //private validering val;

    /**
     * Creates new form elevStart
     */
    public elevStart() {
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

        btnElevhem = new javax.swing.JButton();
        btnLarareDatum = new javax.swing.JButton();
        cboxElevhem = new javax.swing.JComboBox<>();
        btnTillbaka = new javax.swing.JButton();
        btnElevBetyg = new javax.swing.JButton();
        btnPokal = new javax.swing.JButton();
        btnPrefekt = new javax.swing.JButton();
        dateStart = new org.jdesktop.swingx.JXDatePicker();
        dateEnd = new org.jdesktop.swingx.JXDatePicker();
        txtNamn = new javax.swing.JTextField();
        svar = new java.awt.TextArea();
        btnElevKurs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnElevhem.setText("Visa elever i");
        btnElevhem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElevhemActionPerformed(evt);
            }
        });

        btnLarareDatum.setText("Visa lärares kurser");
        btnLarareDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLarareDatumActionPerformed(evt);
            }
        });

        cboxElevhem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Slytherin", "Hufflepuff", "Gryffindor", "Ravenclaw" }));
        cboxElevhem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxElevhemActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Gå Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnElevBetyg.setText("Sök elevbetyg");
        btnElevBetyg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElevBetygActionPerformed(evt);
            }
        });

        btnPokal.setText("Elevhemspokalen");
        btnPokal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPokalActionPerformed(evt);
            }
        });

        btnPrefekt.setText("Visa prefekt i");
        btnPrefekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrefektActionPerformed(evt);
            }
        });

        dateStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateStartActionPerformed(evt);
            }
        });

        dateEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateEndActionPerformed(evt);
            }
        });

        txtNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamnActionPerformed(evt);
            }
        });

        svar.setEditable(false);

        btnElevKurs.setText("Sök elevkurser");
        btnElevKurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElevKursActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTillbaka)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnElevKurs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnElevhem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnElevBetyg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLarareDatum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPrefekt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboxElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnPokal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(svar, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnElevhem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrefekt))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(cboxElevhem)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnElevBetyg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnElevKurs))
                            .addComponent(txtNamn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLarareDatum)
                            .addComponent(dateStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPokal)
                        .addGap(87, 87, 87)
                        .addComponent(btnTillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(svar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnElevhemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElevhemActionPerformed
        String itemText = (String) cboxElevhem.getSelectedItem(); //Tar det valda värdet ur comboxboxen och sätter det i en sträng  
        try {

            String fraga = "SELECT ELEV.FORNAMN FROM SOVSAL JOIN ELEV ON ELEV.SOVSAL = SOVSAL.SOVSAL_ID JOIN ELEVHEM ON ELEVHEM.ELEVHEM_ID = SOVSAL.ELEVHEM WHERE ELEVHEMSNAMN= '" + itemText + "'";
            ArrayList<String> fornamn = idb.fetchColumn(fraga);

            fraga = "SELECT ELEV.EFTERNAMN FROM SOVSAL JOIN ELEV ON ELEV.SOVSAL = SOVSAL.SOVSAL_ID JOIN ELEVHEM ON ELEVHEM.ELEVHEM_ID = SOVSAL.ELEVHEM WHERE ELEVHEMSNAMN= '" + itemText + "'";
            ArrayList<String> efternamn = idb.fetchColumn(fraga);

            String svaret = "";

            for (int i = 0; i < fornamn.size(); i++) {
                svaret += fornamn.get(i) + " " + efternamn.get(i) + "\n";

            }
            svar.setText(svaret); //Skriver ut svaret i svarsrutan
            System.out.println(svaret); //Internt test
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }

    }//GEN-LAST:event_btnElevhemActionPerformed

    private void cboxElevhemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxElevhemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxElevhemActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new valElevLarare().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnPrefektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrefektActionPerformed
        String itemText = (String) cboxElevhem.getSelectedItem(); //Tar det valda värdet ur comboxboxen och sätter det i en sträng
        try {

            String fraga = "SELECT ELEV.FORNAMN FROM ELEVHEM JOIN ELEV ON ELEV.ELEV_ID = ELEVHEM.PREFEKT WHERE ELEVHEM.ELEVHEMSNAMN= '" + itemText + "'";
            ArrayList<String> fornamn = idb.fetchColumn(fraga);

            fraga = "SELECT ELEV.EFTERNAMN FROM ELEVHEM JOIN ELEV ON ELEV.ELEV_ID = ELEVHEM.PREFEKT WHERE ELEVHEM.ELEVHEMSNAMN= '" + itemText + "'";
            ArrayList<String> efternamn = idb.fetchColumn(fraga);

            String svaret = "";

            for (int i = 0; i < fornamn.size(); i++) {
                svaret += fornamn.get(i) + " " + efternamn.get(i) + "\n";

            }
            svar.setText(svaret);
            System.out.println(svaret);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }

    }//GEN-LAST:event_btnPrefektActionPerformed

    private void btnElevBetygActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElevBetygActionPerformed
        try {
            String namn = txtNamn.getText(); //Tar indatan och sätter det till en string
            String fornamn = namn.split(" ")[0]; //Delar upp för och efternamn
            String efternamn = namn.substring(namn.indexOf(" ") + 1).split(" ")[0]; //Tar bort alla mellanslag om man råkar skriva ett efter
            System.out.println(namn);//Internt test
            System.out.println(fornamn);//Internt test
            System.out.println(efternamn);//Internt test
            //Gör en sql fråga där programmet söker efter det inskrivna namnet i databasen för att se vilka kurser som eleven läser
            String fraga = "SELECT KURS.KURSNAMN FROM ELEV JOIN HAR_BETYG_I ON HAR_BETYG_I.ELEV_ID = ELEV.ELEV_ID JOIN KURS ON KURS.KURS_ID = HAR_BETYG_I.KURS_ID WHERE ELEV.FORNAMN = '" + fornamn + "' AND ELEV.EFTERNAMN = '" + efternamn + "' ";
            ArrayList<String> kurs = idb.fetchColumn(fraga);
            //Gör en sql fråga där programmet söker efter det inskrivna namnet i databasen för att se vilka betyg som en elev har
            fraga = "SELECT HAR_BETYG_I.KURSBETYG FROM ELEV JOIN HAR_BETYG_I ON HAR_BETYG_I.ELEV_ID = ELEV.ELEV_ID JOIN KURS ON KURS.KURS_ID = HAR_BETYG_I.KURS_ID WHERE ELEV.FORNAMN = '" + fornamn + "' AND ELEV.EFTERNAMN = '" + efternamn + "' ";
            ArrayList<String> betyg = idb.fetchColumn(fraga);
            //Implementera översättning av betyg från en bokstav till ett ord med hjälp av BETYG tabellen
            String svaret = "";

            for (int i = 0; i < betyg.size(); i++) {
                svaret += betyg.get(i) + " i kursen " + kurs.get(i) + "\n";
            }

            svar.setText(svaret);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }//GEN-LAST:event_btnElevBetygActionPerformed

    private void dateStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateStartActionPerformed

    private void dateEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateEndActionPerformed

    private void btnLarareDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLarareDatumActionPerformed
        //DateFormat används för att formattera datumet som skrivs in till ett format som kan användas i en sql fråga
        DateFormat formatDatum = new SimpleDateFormat("yyyy-MM-dd"); //Säger att jag senare vill formatera datumet till yyyy-MM-dd
        String formatStartDatum = formatDatum.format(dateStart.getDate()); //Gör om datumet till en String med rätt format
        String formatSlutDatum = formatDatum.format(dateEnd.getDate()); //Gör om datumet till en String med rätt format
        System.out.println(formatStartDatum + " " + formatSlutDatum); //Internt test
        try {
            //Skapar en sql fråga som hämtar alla kurser som pågår mellan två datum som användaren skrivit in
            String fraga = "SELECT KURS.KURSNAMN FROM KURS WHERE KURSSTART = '" + formatStartDatum + "' AND KURSSLUT = '" + formatSlutDatum + "';";
            System.out.println(fraga); //Internt test
            ArrayList<String> kursStart = idb.fetchColumn(fraga);
            System.out.println(fraga);
           
            

            //Kom ihåg att ändra sql fråga så att kravspecen stämmer
            
            
            
            
            fraga = "SELECT LARARE.FORNAMN FROM KURS JOIN LARARE ON LARARE.LARAR_ID = KURS.KURSLARARE WHERE KURSSTART = '" + formatStartDatum + "' AND KURSSLUT = '" + formatSlutDatum + "';";
            ArrayList<String> kursLarareFornamn = idb.fetchColumn(fraga);
            fraga = "SELECT LARARE.EFTERNAMN FROM KURS JOIN LARARE ON LARARE.LARAR_ID = KURS.KURSLARARE WHERE KURSSTART = '" + formatStartDatum + "' AND KURSSLUT = '" + formatSlutDatum + "';";
            ArrayList<String> kursLarareEfternamn = idb.fetchColumn(fraga);            
            String svaret = ""; //Skapar en tom String för senare utskrift
            //Loopar igenom antalet kurser och lägger till kursnamn och vem som har kursen i svaret
            for (int i = 0; i < kursStart.size(); i++) {
                svaret += kursStart.get(i) + " hålls av ";
                svaret += kursLarareFornamn.get(i) + " " + kursLarareEfternamn.get(i) + "\n";
            }
            //for(int i = 0; i < kursLarareFornamn.size(); i++) {
            //    svaret += kursLarareFornamn.get(i) + " " + kursLarareEfternamn.get(i) + "\n";
            //}

            svar.setText(svaret); //Skriver ut svaret i textrutan
        }
        //Fångar upp felmeddelanden från databasen
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }//GEN-LAST:event_btnLarareDatumActionPerformed
    
    private void btnPokalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPokalActionPerformed
        try {
            String antalHem = "SELECT COUNT(HUSPOANG) FROM ELEVHEM;"; //Kollar antal elevhem
            
            String antalHemString = idb.fetchSingle(antalHem); //Tar antal hem och sätter det i en String
            int antalHemInt = Integer.parseInt(antalHemString); //Omvandlar antal hem till en int
            System.out.println(antalHemInt); //Internt test
            
            String svaret = ""; //Tom sträng som används senare
            ArrayList<String> husPoang = new ArrayList<>(); //Gör en ArrayList som ska lagra varje hus poäng
            ArrayList<String> husNamn = new ArrayList<>(); //Gör en ArrayList som ska lagra alla husnamn
            //Loopar igenom antal hem och sätter in namn och antal poäng i de två ArrayList som gjordes innan
            for(int i = 1; i <= antalHemInt; i++) {
                String fraga = "SELECT HUSPOANG FROM ELEVHEM WHERE ELEVHEM_ID = '" + i + "';";
                husPoang.add(idb.fetchSingle(fraga));
                
                fraga = "SELECT ELEVHEMSNAMN FROM ELEVHEM WHERE ELEVHEM_ID = '" + i + "';";
                husNamn.add(idb.fetchSingle(fraga));
                
            }
            //Uppdaterar svaret String som sedan blir en utskrift
            for(int i = 0; i < husNamn.size(); i++) {
                svaret += husNamn.get(i) + " har " + husPoang.get(i) + " antal poäng. \n";
            }
            //Gör en utskrift i programmet
            svar.setText(svaret);
        }
        //Fångar eventuella felmeddelanden
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }//GEN-LAST:event_btnPokalActionPerformed

    private void btnElevKursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElevKursActionPerformed
        try {
            String namn = txtNamn.getText(); // Lagrar det som skrivs i txtRutan i variabeln "namn".
            String fornamn = namn.split(" ")[0]; //Delar upp för och efternamn
            String efternamn = namn.substring(namn.indexOf(" ") + 1).split(" ")[0]; //Tar bort alla mellanslag om man råkar skriva ett efter
            System.out.println(namn);//Internt test
            System.out.println(fornamn);//Internt test
            System.out.println(efternamn);//Internt test
            
            String fraga = "Select KURS.KURSNAMN From ELEV Join REGISTRERAD_PA ON REGISTRERAD_PA.ELEV_ID = ELEV.ELEV_ID Join KURS ON KURS.KURS_ID = REGISTRERAD_PA.KURS_ID WHERE ELEV.FORNAMN = '" + fornamn + "' AND ELEV.EFTERNAMN = '" + efternamn + "' "; //SQL fråga som hämtar kursnamn för en elev med ett givet namn.
            ArrayList<String> kurser = idb.fetchColumn(fraga);
        
            String svaret = ""; //Skapar en String variabel
        
            for(int i = 0; i < kurser.size(); i++) { //Lagrar kurserna på alla indexpositioner i variabeln "svaret".
            svaret += kurser.get(i) + "\n";
            }
        
            svar.setText(svaret); //Skriver ut kurserna för eleven i rutan.
        } 
        catch(InfException ettUndantag) { //Fångar eventuella fel
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }

            
        
    }//GEN-LAST:event_btnElevKursActionPerformed

    private void txtNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElevBetyg;
    private javax.swing.JButton btnElevKurs;
    private javax.swing.JButton btnElevhem;
    private javax.swing.JButton btnLarareDatum;
    private javax.swing.JButton btnPokal;
    private javax.swing.JButton btnPrefekt;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cboxElevhem;
    private org.jdesktop.swingx.JXDatePicker dateEnd;
    private org.jdesktop.swingx.JXDatePicker dateStart;
    private java.awt.TextArea svar;
    private javax.swing.JTextField txtNamn;
    // End of variables declaration//GEN-END:variables
}
