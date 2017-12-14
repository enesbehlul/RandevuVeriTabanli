/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DonemOdevi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.RollbackException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Enes Behlul
 */
public class Bulusma_Uygulama extends javax.swing.JFrame {

    String adi, soyadi, kullaniciAdi, sifre;
    int kimlikNu;
    DefaultTableModel dtm = new DefaultTableModel();
    public static int ayGunSayisi;
    DefaultComboBoxModel cmbModelGunler = new DefaultComboBoxModel();
    DefaultComboBoxModel cmbModelAylar = new DefaultComboBoxModel();
    DefaultComboBoxModel cmbModelYillar = new DefaultComboBoxModel();
    DefaultComboBoxModel cmbModelDoktorlar = new DefaultComboBoxModel();
    DefaultComboBoxModel cmbModelSaatler = new DefaultComboBoxModel();
    DefaultComboBoxModel cmbModelDakikalar = new DefaultComboBoxModel();

    /**
     * Creates new form Bulusma_Uygulama
     */
    public Bulusma_Uygulama() {
        initComponents();
    }

    Bulusma_Uygulama(Kisi_1 girisYapan) {
        initComponents();
        DoktorlariAyarla();
        aylariAyarla();
        yillariAyarla();
        SaatleriAyarla();
        dtm.addColumn("Doktor");
        dtm.addColumn("Tarih");
        tblBulusmalar.setModel(dtm);
        this.setTitle(girisYapan.getAdi() + " " + girisYapan.getSoyadi());
        adi = girisYapan.getAdi();
        soyadi = girisYapan.getSoyadi();
        kullaniciAdi = girisYapan.getKullaniciAdi();
        kimlikNu = girisYapan.getKimlikNu();
        sifre = girisYapan.getSifre();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RandevuVeriTabanliPU");
        EntityManager em = emf.createEntityManager();
        Query sorgu = em.createQuery("SELECT b FROM Bulusma_1 b WHERE b.kisiId=:KID");
        sorgu.setParameter("KID", girisYapan.getKimlikNu());
        List<Bulusma_1> bulusmalar = sorgu.getResultList();
        for (Bulusma_1 bulusma : bulusmalar) {
            dtm.addRow(new Object[]{bulusma.getDoktorAdi(), bulusma.getTarih()});
        }
        tblBulusmalar.setModel(dtm);
    }

    private void GunleriAyarla() {

        if (cmbModelGunler.getSize() > 0) {
            cmbModelGunler.removeAllElements();
        }
        int sayi = 1;
        int sayac = 0;
        ayGunSayisi = 31;
        Ay A1 = new Ay((String) cmbModelAylar.getSelectedItem());
        for (int i = 0; i < ayGunSayisi; i++) {

            Tarih.gunler.add(sayi);
            cmbModelGunler.addElement(Tarih.gunler.get(i));
            sayi++;
            sayac++;
        }
        cmbGun.setModel(cmbModelGunler);
        cmbGun.setSelectedIndex(0);
    }
    int yil = 2017;

    private void yillariAyarla() {
        for (int i = 0; i < 10; i++) {
            cmbModelYillar.addElement(yil);
            yil++;
        }
        cmbYil.setModel(cmbModelYillar);
        cmbYil.setSelectedIndex(0);
    }

    private void aylariAyarla() {

        cmbModelAylar.addElement("Ocak");
        cmbModelAylar.addElement("Şubat");
        cmbModelAylar.addElement("Mart");
        cmbModelAylar.addElement("Nisan");
        cmbModelAylar.addElement("Mayıs");
        cmbModelAylar.addElement("Haziran");
        cmbModelAylar.addElement("Temmuz");
        cmbModelAylar.addElement("Ağustos");
        cmbModelAylar.addElement("Eylül");
        cmbModelAylar.addElement("Ekim");
        cmbModelAylar.addElement("Kasım");
        cmbModelAylar.addElement("Aralık");
        cmbAy.setModel(cmbModelAylar);
        cmbAy.setSelectedIndex(0);

    }

    public void SaatleriAyarla() {
        for (int i = 9; i < 19; i++) {
            cmbModelSaatler.addElement(i);
        }
        cmbSaat.setModel(cmbModelSaatler);
        cmbSaat.setSelectedIndex(0);
        cmbModelDakikalar.addElement(15);
        cmbModelDakikalar.addElement(45);
        cmbDakika.setModel(cmbModelDakikalar);
        cmbDakika.setSelectedIndex(0);
    }

    public void DoktorlariAyarla() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RandevuVeriTabanliPU");
        EntityManager em = emf.createEntityManager();
        Query doktorSorgusu = em.createQuery("SELECT d FROM Doktor_1 d");
        List<Doktor_1> doktorlar = doktorSorgusu.getResultList();

        for (Doktor_1 doktor : doktorlar) {
            cmbModelDoktorlar.addElement(doktor.getDoktorAdi() + " " + doktor.getDoktorSoyadi() + " - " + doktor.getUzmanlikAlani());
        }
        cmbDoktorlar.setModel(cmbModelDoktorlar);
    }

    /**
     * This method is called from within constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbGun = new javax.swing.JComboBox<>();
        cmbAy = new javax.swing.JComboBox<>();
        cmbYil = new javax.swing.JComboBox<>();
        lblTarih = new javax.swing.JLabel();
        btnBulusmaOlustur = new javax.swing.JButton();
        cmbDoktorlar = new javax.swing.JComboBox<>();
        lblDoktorSecimi = new javax.swing.JLabel();
        btnCikis = new javax.swing.JButton();
        lblSaat = new javax.swing.JLabel();
        cmbSaat = new javax.swing.JComboBox<>();
        cmbDakika = new javax.swing.JComboBox<>();
        lblRandevularim = new javax.swing.JLabel();
        btnSil = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBulusmalar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbGun.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbGunİtemStateChanged(evt);
            }
        });
        cmbGun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGunActionPerformed(evt);
            }
        });

        cmbAy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocak" }));
        cmbAy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAyİtemStateChanged(evt);
            }
        });
        cmbAy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAyActionPerformed(evt);
            }
        });

        lblTarih.setText("Tarih:");

        btnBulusmaOlustur.setText("Randevu oluştur");
        btnBulusmaOlustur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBulusmaOlusturActionPerformed(evt);
            }
        });

        cmbDoktorlar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDoktorlarİtemStateChanged(evt);
            }
        });

        lblDoktorSecimi.setText("Bölüm ve doktor seçimi: ");

        btnCikis.setText("Çıkış yap");
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });

        lblSaat.setText("Saat:");

        lblRandevularim.setText("Randevularım:");

        btnSil.setText("Seçili randevuyu sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        tblBulusmalar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblBulusmalar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDoktorSecimi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbDoktorlar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblSaat)
                                            .addComponent(lblTarih))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cmbAy, 0, 112, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbGun, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cmbSaat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(cmbDakika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbYil, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblRandevularim)
                                        .addGap(203, 203, 203)
                                        .addComponent(btnBulusmaOlustur))
                                    .addComponent(btnSil)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCikis)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDoktorlar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoktorSecimi))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTarih))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaat)
                    .addComponent(cmbSaat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDakika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBulusmaOlustur, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRandevularim, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnSil)
                .addGap(18, 18, 18)
                .addComponent(btnCikis)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbGunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGunActionPerformed

    private void cmbAyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAyActionPerformed
        // TODO add your handling code here:
        GunleriAyarla();
    }//GEN-LAST:event_cmbAyActionPerformed

    private void cmbGunİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGunİtemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGunİtemStateChanged

    private void cmbAyİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAyİtemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAyİtemStateChanged

    private void btnBulusmaOlusturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBulusmaOlusturActionPerformed
        // TODO add your handling code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RandevuVeriTabanliPU");
        EntityManager em = emf.createEntityManager();
        int sayi = 0;
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Bulusma_Uygulama", "sa", "as");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM BULUSMA");

            while (rs.next()) {
                if (rs.getInt("BULUSMA_ID") > sayi) {
                    sayi = rs.getInt("BULUSMA_ID");
                }
            }
            ++sayi;
        } catch (SQLException ex) {
            Logger.getLogger(Bulusma_Uygulama.class.getName()).log(Level.SEVERE, null, ex);
        }

        Bulusma_1 b1 = new Bulusma_1();
        String doctor = (String) cmbDoktorlar.getSelectedItem();
        String doctorAdi = doctor.substring(0, doctor.indexOf(" "));
        String doctorSoyadi = doctor.substring(doctor.indexOf(" ") + 1, doctor.indexOf("-") - 1);
        int gun = (int) cmbGun.getSelectedItem();
        String ay = (String) cmbAy.getSelectedItem();
        int yil = (int) cmbYil.getSelectedItem();
        int saat = (int) cmbSaat.getSelectedItem();
        int dakika = (int) cmbDakika.getSelectedItem();

        //********************************************
        Query q = em.createQuery("SELECT p FROM Bulusma_1 p WHERE p.kisiId=:KID AND p.tarih=:TRH");
        Query q2 = em.createQuery("SELECT p FROM Bulusma_1 p WHERE p.tarih=:TAR AND p.doktorId=:DID");
        q.setParameter("KID", kimlikNu);
        q.setParameter("TRH", gun + " " + ay + " " + yil + " " + saat + ":" + dakika);
        q2.setParameter("TAR", gun + " " + ay + " " + yil + " " + saat + ":" + dakika);
        q2.setParameter("DID", (cmbDoktorlar.getSelectedIndex() + 1));
        List<Bulusma_1> kisiIdVeTarih = q.getResultList();
        List<Bulusma_1> tarihVeDoktorId = q2.getResultList();
        boolean kayitOlusturulsunMu = true;
        if (kisiIdVeTarih.size() == 1 || tarihVeDoktorId.size() == 1) {
            JOptionPane.showMessageDialog(rootPane, "Bu tarihe kayıt alamazsınız.");
            kayitOlusturulsunMu = false;
        }
        //********************************************
        //tekrar aynı tarihe bulusma alınmasını engelleme
        if (kayitOlusturulsunMu) {

            try {
                b1.setTarih(gun + " " + ay + " " + yil + " " + saat + ":" + dakika);
                b1.setKisiAdi(adi + " " + soyadi);
                b1.setBulusmaId(sayi);
                b1.setDoktorAdi(doctorAdi + " " + doctorSoyadi);
                b1.setDoktorId(cmbDoktorlar.getSelectedIndex() + 1);
                b1.setKisiId(kimlikNu);
                em.getTransaction().begin();
                em.persist(b1);
                em.getTransaction().commit();
                em.close();
                emf.close();
                JOptionPane.showMessageDialog(rootPane, "Kaydınız oluşturuldu.");
                dtm.addRow(new Object[]{b1.getDoktorAdi(), b1.getTarih()});
                tblBulusmalar.setModel(dtm);
            } catch (RollbackException e) {
                JOptionPane.showMessageDialog(rootPane, "Bu tarih dolu.");
                System.out.println("duplicate key");
            }
        }
    }//GEN-LAST:event_btnBulusmaOlusturActionPerformed

    private void cmbDoktorlarİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDoktorlarİtemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDoktorlarİtemStateChanged

    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
        // TODO add your handling code here:
        KullaniciGiris Kgiris = new KullaniciGiris();
        Kgiris.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCikisActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        // TODO add your handling code here:     
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RandevuVeriTabanliPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("DELETE FROM Bulusma_1 b WHERE b.tarih=:TDID");

        if (tblBulusmalar.isRowSelected(tblBulusmalar.getSelectedRow())) {
            q.setParameter("TDID", dtm.getValueAt(tblBulusmalar.getSelectedRow(), 1));

            em.getTransaction().begin();
            q.executeUpdate();
            em.getTransaction().commit();

            em.close();
            emf.close();
            dtm.removeRow(tblBulusmalar.getSelectedRow());
        }

    }//GEN-LAST:event_btnSilActionPerformed

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
            java.util.logging.Logger.getLogger(Bulusma_Uygulama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bulusma_Uygulama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bulusma_Uygulama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bulusma_Uygulama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bulusma_Uygulama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBulusmaOlustur;
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnSil;
    private javax.swing.JComboBox<String> cmbAy;
    private javax.swing.JComboBox<String> cmbDakika;
    private javax.swing.JComboBox<String> cmbDoktorlar;
    private javax.swing.JComboBox<String> cmbGun;
    private javax.swing.JComboBox<String> cmbSaat;
    private javax.swing.JComboBox<String> cmbYil;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDoktorSecimi;
    private javax.swing.JLabel lblRandevularim;
    private javax.swing.JLabel lblSaat;
    private javax.swing.JLabel lblTarih;
    private javax.swing.JTable tblBulusmalar;
    // End of variables declaration//GEN-END:variables
}
