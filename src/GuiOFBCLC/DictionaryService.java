/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiOFBCLC;

import ControlersofBCLC.DBenterWords;
import ControlersofBCLC.DocumentMaking;
import ControlersofBCLC.GetingGuisCentral;
import ControlersofBCLC.MovingTitle;
import ControlersofBCLC.Sound;
import static GuiOFBCLC.SinhalaDocument.SinhlaDocument;
import Models.DictionaryModel;

/**
 *
 * @author user pc
 */
public class DictionaryService extends javax.swing.JFrame {

    /**
     * Creates new form DictionaryService
     */
    String SinhalaType = null;
    String tamilType = null;
    String englishType = null;

    public DictionaryService() {
        initComponents();
        MovingTitle.movingTitle2(this, "SINHALA TAMIL & ENGLISH DICTIONARY");
        GetingGuisCentral.centreWindow(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Sinhala = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tamil = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        English = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 409));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Arrow-Back-2-icon(formenue).png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(540, 280, 220, 53);

        Sinhala.setColumns(20);
        Sinhala.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        Sinhala.setRows(5);
        Sinhala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SinhalaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SinhalaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Sinhala);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 330, 171);

        Tamil.setColumns(20);
        Tamil.setFont(new java.awt.Font("Akshar Unicode", 1, 18)); // NOI18N
        Tamil.setRows(5);
        Tamil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TamilKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TamilKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(Tamil);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(350, 90, 330, 171);

        English.setColumns(20);
        English.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        English.setRows(5);
        English.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EnglishKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EnglishKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(English);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(690, 90, 310, 170);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Sinhala.jpg"))); // NOI18N
        jLabel1.setText("Sinhala word");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 154, 31);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/ggg.JPG"))); // NOI18N
        jLabel2.setText("Tamil Word");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 30, 146, 38);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Letters-icon.png"))); // NOI18N
        jLabel3.setText("English Word");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(690, 30, 155, 32);

        jButton2.setBackground(new java.awt.Color(255, 66, 125));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/coffee-cup-icon.png"))); // NOI18N
        jButton2.setText("Refresh Word");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(790, 280, 210, 53);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/menu-bg.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1020, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        StartPoint dictionaryService = new StartPoint();
        dictionaryService.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Sinhala.setText("");
        Tamil.setText("");
        English.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SinhalaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SinhalaKeyReleased
        // TODO add your handling code here:
        DocumentMaking.sinhalaUnicode(Sinhala.getText(),9);   
    }//GEN-LAST:event_SinhalaKeyReleased

    private void SinhalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SinhalaKeyPressed

        if (evt.getKeyCode() == 10) 
        {
            try 
            {
                DictionaryModel dictionaryModel = DBenterWords.serchSinhalaWords(Sinhala.getText());
                SinhalaType = dictionaryModel.getSinhalaWord();
                tamilType = dictionaryModel.getTamilWord();
                englishType = dictionaryModel.getEnglishWord();
                Sinhala.setText(SinhalaType);
                Tamil.setText(tamilType);
                English.setText(englishType);
            }
            catch (Exception e) 
            {
                
            }
        }
    }//GEN-LAST:event_SinhalaKeyPressed

    private void TamilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TamilKeyPressed
        if (evt.getKeyCode() == 10) 
        {
            try 
            {
                DictionaryModel dictionaryModel = DBenterWords.serchTamilWords(Tamil.getText());
                SinhalaType = dictionaryModel.getSinhalaWord();
                tamilType = dictionaryModel.getTamilWord();
                englishType = dictionaryModel.getEnglishWord();
                Sinhala.setText(SinhalaType);
                Tamil.setText(tamilType);
                English.setText(englishType);
            } 
            catch (Exception e) 
            {
                
            }
        }
    }//GEN-LAST:event_TamilKeyPressed

    private void EnglishKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnglishKeyPressed
        if (evt.getKeyCode() == 10) 
        {
            try 
            {
                DictionaryModel dictionaryModel = DBenterWords.serchEnglishWords(English.getText());
                SinhalaType = dictionaryModel.getSinhalaWord();
                tamilType = dictionaryModel.getTamilWord();
                englishType = dictionaryModel.getEnglishWord();
                Sinhala.setText(SinhalaType);
                Tamil.setText(tamilType);
                English.setText(englishType);
            }
            catch (Exception e)
            {
                
            }
        }
    }//GEN-LAST:event_EnglishKeyPressed

    private void EnglishKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnglishKeyReleased
        // TODO add your handling code here:
        Sound.EnglishDocumentPreparingSounds(evt.getKeyCode());
    }//GEN-LAST:event_EnglishKeyReleased

    private void TamilKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TamilKeyReleased
        // TODO add your handling code here:
        DocumentMaking.TamilUnicode(Tamil.getText(),6);
    }//GEN-LAST:event_TamilKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DictionaryService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DictionaryService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DictionaryService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DictionaryService().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea English;
    public static javax.swing.JTextArea Sinhala;
    public static javax.swing.JTextArea Tamil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
