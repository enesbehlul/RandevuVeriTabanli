/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DonemOdevi;

/**
 *
 * @author Enes Behlul
 */
public class TumEkranlar extends javax.swing.JFrame {

    /**
     * Creates new form TumEkranlar
     */
    public TumEkranlar() {
        initComponents();
        this.setLocationRelativeTo( null );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDoktorGiris = new javax.swing.JButton();
        btnKullaniciGiris = new javax.swing.JButton();
        btnKullaniciKayit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDoktorGiris.setText("Doktor Giriş");
        btnDoktorGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoktorGirisActionPerformed(evt);
            }
        });
        getContentPane().add(btnDoktorGiris, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 78));

        btnKullaniciGiris.setText("Kullanıcı Giriş");
        btnKullaniciGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciGirisActionPerformed(evt);
            }
        });
        getContentPane().add(btnKullaniciGiris, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 79, 370, 90));

        btnKullaniciKayit.setText("Kullanıcı Kayıt");
        btnKullaniciKayit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnKullaniciKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullaniciKayitActionPerformed(evt);
            }
        });
        getContentPane().add(btnKullaniciKayit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 370, 86));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoktorGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoktorGirisActionPerformed
        // TODO add your handling code here:
        DoktorGirisi d = new DoktorGirisi();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDoktorGirisActionPerformed

    private void btnKullaniciGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciGirisActionPerformed
        // TODO add your handling code here:
        KullaniciGiris kg = new KullaniciGiris();
        kg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKullaniciGirisActionPerformed

    private void btnKullaniciKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullaniciKayitActionPerformed
        // TODO add your handling code here:
        KullaniciKayit kk = new KullaniciKayit();
        kk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKullaniciKayitActionPerformed

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
            java.util.logging.Logger.getLogger(TumEkranlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TumEkranlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TumEkranlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TumEkranlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TumEkranlar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoktorGiris;
    private javax.swing.JButton btnKullaniciGiris;
    private javax.swing.JButton btnKullaniciKayit;
    // End of variables declaration//GEN-END:variables
}
