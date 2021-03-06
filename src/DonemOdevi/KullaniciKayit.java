/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DonemOdevi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.RollbackException;
import javax.swing.JOptionPane;

/**
 *
 * @author Enes Behlul
 */
public class KullaniciKayit extends javax.swing.JFrame {

    /**
     * Creates new form KullaniciGiris
     */
    public KullaniciKayit() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Kayıt ve güncelleme");
//        txtEskiKullaniciAdi.setVisible(false);
//        txtpEskiSifre.setVisible(false);
//        cmbGuvenlikSorulari.addItem("En sevdiğiniz öğretmeninizin adı");
//        cmbGuvenlikSorulari.addItem("En yakın arkadaşın adı");

    }

    public void uyarilariSifirla() {
        lblUyariAd.setText("");
        lblUyariKimlikNu.setText("");
        lblUyariKullaniciAdi.setText("");
        lblUyariSifre.setText("");
        lblUyariSifreTekrar.setText("");
        lblUyariSoyad.setText("");
    }

    public void yazilariSil() {
        txtAd.setText("");
        txtEskiKullaniciAdi.setText("");
        txtKimlikNu.setText("");
        txtKullaniciAdi.setText("");
        txtSoyad.setText("");
        txtpEskiSifre.setText("");
        txtpSifre.setText("");
        txtpSifreTekrar.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtKullaniciAdi = new javax.swing.JTextField();
        lblKayit = new javax.swing.JLabel();
        lblKullaniciAdi = new javax.swing.JLabel();
        lblSifre = new javax.swing.JLabel();
        txtpSifre = new javax.swing.JPasswordField();
        lblSifreTekrar = new javax.swing.JLabel();
        txtpSifreTekrar = new javax.swing.JPasswordField();
        btnKaydol = new javax.swing.JButton();
        lblAd = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        lblSoyad = new javax.swing.JLabel();
        txtSoyad = new javax.swing.JTextField();
        lblKimlikNu = new javax.swing.JLabel();
        txtKimlikNu = new javax.swing.JTextField();
        btnGirisEkraninaGit = new javax.swing.JButton();
        lblUyariKimlikNu = new javax.swing.JLabel();
        lblUyariAd = new javax.swing.JLabel();
        lblUyariSoyad = new javax.swing.JLabel();
        lblUyariSifre = new javax.swing.JLabel();
        lblUyariSifreTekrar = new javax.swing.JLabel();
        lblUyariKullaniciAdi = new javax.swing.JLabel();
        btnBilgileriGuncelle = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSorgula = new javax.swing.JButton();
        txtEskiKullaniciAdi = new javax.swing.JTextField();
        txtpEskiSifre = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblKayit.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lblKayit.setText("Kayıt ve bilgi güncelleme");

        lblKullaniciAdi.setText("Kullanıcı Adı: ");

        lblSifre.setText("Şifre:");

        lblSifreTekrar.setText("Şifre Tekrar:");

        btnKaydol.setText("Kaydol");
        btnKaydol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydolActionPerformed(evt);
            }
        });

        lblAd.setText("Ad: ");

        lblSoyad.setText("Soyad: ");

        lblKimlikNu.setText("Kimlik Nu.");

        btnGirisEkraninaGit.setText("Giris ekranına git");
        btnGirisEkraninaGit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisEkraninaGitActionPerformed(evt);
            }
        });

        lblUyariKimlikNu.setForeground(new java.awt.Color(255, 0, 0));

        lblUyariAd.setForeground(new java.awt.Color(255, 0, 0));

        lblUyariSoyad.setForeground(new java.awt.Color(255, 0, 0));

        lblUyariSifre.setForeground(new java.awt.Color(255, 0, 0));

        lblUyariSifreTekrar.setForeground(new java.awt.Color(255, 0, 0));

        lblUyariKullaniciAdi.setForeground(new java.awt.Color(255, 0, 0));

        btnBilgileriGuncelle.setForeground(new java.awt.Color(255, 0, 51));
        btnBilgileriGuncelle.setText("Bilgileri güncelle");
        btnBilgileriGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBilgileriGuncelleActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Kullanıcı adı ve şifre");

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("girip sorguladıktan sonra");

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("bilgilerinizi güncelleyebilirsiniz.");

        btnSorgula.setForeground(new java.awt.Color(255, 0, 0));
        btnSorgula.setText("Sorgula");
        btnSorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSorgulaActionPerformed(evt);
            }
        });

        jLabel1.setText("Değişimden");

        jLabel2.setText("önceki");

        jLabel7.setText("kullanıcı adı");

        jLabel6.setText("ve");

        jLabel8.setText("şifre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(lblKayit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSifreTekrar)
                            .addComponent(lblSifre)
                            .addComponent(lblKullaniciAdi)
                            .addComponent(lblSoyad)
                            .addComponent(lblAd)
                            .addComponent(lblKimlikNu))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKullaniciAdi)
                            .addComponent(txtpSifre)
                            .addComponent(txtpSifreTekrar)
                            .addComponent(txtAd)
                            .addComponent(txtSoyad)
                            .addComponent(txtKimlikNu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUyariKullaniciAdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUyariSoyad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUyariKimlikNu, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(lblUyariSifre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUyariAd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(lblUyariSifreTekrar, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnKaydol, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSorgula, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnBilgileriGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGirisEkraninaGit, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1))
                                .addGap(83, 83, 83)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEskiKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtpEskiSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUyariKimlikNu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblKimlikNu)
                        .addComponent(txtKimlikNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAd)
                        .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUyariAd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSoyad)
                        .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUyariSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUyariKullaniciAdi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblKullaniciAdi)
                        .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSifre)
                    .addComponent(txtpSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUyariSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtpSifreTekrar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSifreTekrar)
                    .addComponent(lblUyariSifreTekrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel8))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnKaydol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSorgula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBilgileriGuncelle)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGirisEkraninaGit)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEskiKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtpEskiSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaydolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydolActionPerformed
        // TODO add your handling code here:

        uyarilariSifirla();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RandevuVeriTabanliPU");
        EntityManager em = emf.createEntityManager();
        boolean sayisalSorun = false;
        boolean sorun1 = false;
        boolean sorun2 = false;
        boolean sorun3 = false;
        boolean sorun4 = false;
        boolean sorun5 = false;
        boolean sorun6 = false;
        boolean sorun7 = false;

        Kisi_1 k = new Kisi_1();
        int kimlikNUuygunMu = 0;
        try {
            kimlikNUuygunMu = Integer.parseInt(txtKimlikNu.getText());
            sayisalSorun = false;
        } catch (NumberFormatException e) {
            lblUyariKimlikNu.setText("Sadece sayı giriniz.");
            sayisalSorun = true;
        }
        if (txtAd.getText().length() == 0) {
            lblUyariAd.setText("Adınızı giriniz.");
            sorun1 = true;
        }
        if (txtSoyad.getText().length() == 0) {
            k.setSoyadi(txtSoyad.getText());
            lblUyariSoyad.setText("Soyadınızı giriniz.");
            sorun2 = true;
        }
        if (txtpSifre.getPassword().length == 0) {
            lblUyariSifre.setText("Şifre giriniz.");
            sorun3 = true;
        }
        if (txtpSifreTekrar.getPassword().length == 0) {
            lblUyariSifreTekrar.setText("Şifre giriniz.");
            sorun4 = true;
        }
        String sifre = new String(txtpSifre.getPassword());
        String sifreTekrar = new String(txtpSifreTekrar.getPassword());
        if (!(sifre.equals(sifreTekrar))) {
            sorun5 = true;
            lblUyariSifre.setText("Şifreler uyuşmuyor");
        }

        Query q1 = em.createQuery("SELECT p FROM Kisi_1 p WHERE p.kullaniciAdi=:KADI ");
        Query q2 = em.createQuery("SELECT p FROM Kisi_1 p WHERE p.kimlikNu=:KIMLIKNU ");
        q1.setParameter("KADI", txtKullaniciAdi.getText());
        q2.setParameter("KIMLIKNU", kimlikNUuygunMu);
        List<Kisi_1> kullaniciAdi = q1.getResultList();
        List<Kisi_1> kimlikNu = q2.getResultList();
        if (kullaniciAdi.size() == 1) {
            sorun6 = true;
            lblUyariKullaniciAdi.setText("Bu kullanıcı adı daha önceden alınmış.");
        }
        if (kimlikNu.size() == 1) {
            sorun7 = true;
            lblUyariKimlikNu.setText("Bu kimlik numarası daha önceden alınmış.");
        }
        if (sayisalSorun == false
                && sorun7 == false
                && sorun6 == false
                && sorun5 == false
                && sorun4 == false
                && sorun3 == false
                && sorun2 == false
                && sorun1 == false) {
            uyarilariSifirla();
            k.setKimlikNu(Integer.parseInt(txtKimlikNu.getText()));
            k.setKullaniciAdi(txtKullaniciAdi.getText());
            k.setAdi(txtAd.getText());
            k.setSoyadi(txtSoyad.getText());
            k.setSifre(new String(txtpSifre.getPassword()));
            em.getTransaction().begin();
            em.persist(k);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(rootPane, "Kayıt başarılı.");
            em.close();
            emf.close();
            yazilariSil();
        }
    }//GEN-LAST:event_btnKaydolActionPerformed

    private void btnGirisEkraninaGitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisEkraninaGitActionPerformed
        // TODO add your handling code here:
        KullaniciGiris kg1 = new KullaniciGiris();
        kg1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGirisEkraninaGitActionPerformed

    private void btnBilgileriGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBilgileriGuncelleActionPerformed
        // TODO add your handling code here:

        boolean sayisalSorun = false;
        boolean sorun0 = true;
        boolean sorun1 = false;
        boolean sorun2 = false;
        boolean sorun3 = false;
        boolean sorun4 = false;
        boolean sorun5 = false;
        boolean sorun6 = false;
        boolean sorun7 = false;
        boolean sorun8 = false;
        
        
        
        
        String eskiKullaniciAdi = txtEskiKullaniciAdi.getText();
        String eskiSifre = new String(txtpEskiSifre.getPassword());

        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("RandevuVeriTabanliPU");
        EntityManager em1 = emf1.createEntityManager();

        Query q = em1.createQuery("SELECT p FROM Kisi_1 p WHERE p.kullaniciAdi=:KADI AND p.sifre=:KSIFRE");
        q.setParameter("KADI", eskiKullaniciAdi);
        q.setParameter("KSIFRE", eskiSifre);
        List<Kisi_1> kisiler = q.getResultList();
        if (kisiler.size() == 1) {
            sorun0=false;
        } else {
           JOptionPane.showMessageDialog(rootPane, "Eski kullanıcı adınız veya şifreniz yanlış girildi.");
        }
        
        
        
        
        
        
        
        int kimlikNUuygunMu = 0;
        try {
            kimlikNUuygunMu = Integer.parseInt(txtKimlikNu.getText());
            sayisalSorun = false;
        } catch (NumberFormatException e) {
            lblUyariKimlikNu.setText("Sadece sayı giriniz.");
            sayisalSorun = true;
        }
        if (txtAd.getText().length() == 0) {
            lblUyariAd.setText("Adınızı giriniz.");
            sorun1 = true;
        }
        if (txtSoyad.getText().length() == 0) {
            lblUyariSoyad.setText("Soyadınızı giriniz.");
            sorun2 = true;
        }
        if (txtpSifre.getPassword().length == 0) {
            lblUyariSifre.setText("Şifre giriniz.");
            sorun3 = true;
        }
        if (txtpSifreTekrar.getPassword().length == 0) {
            lblUyariSifreTekrar.setText("Şifre giriniz.");
            sorun4 = true;
        }
        String sifre = new String(txtpSifre.getPassword());
        String sifreTekrar = new String(txtpSifreTekrar.getPassword());
        if (!(sifre.equals(sifreTekrar))) {
            sorun5 = true;
            lblUyariSifre.setText("Şifreler uyuşmuyor");
        }
        if (txtEskiKullaniciAdi.getText().length() == 0 || txtpEskiSifre.getPassword().length == 0) {
            JOptionPane.showMessageDialog(rootPane, "Eski kullanıcı adı ve şifrenizi giriniz.");
            sorun8 = true;
        }
        if (sayisalSorun == false
                && sorun8 == false
                && sorun7 == false
                && sorun6 == false
                && sorun5 == false
                && sorun4 == false
                && sorun3 == false
                && sorun2 == false
                && sorun1 == false
                && sorun0 == false) {
            try {
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Bulusma_Uygulama", "sa", "as");

                String sql = "UPDATE KISI SET KIMLIK_NU=?, KULLANICI_ADI=?, SIFRE=?, ADI=?, SOYADI=? WHERE KULLANICI_ADI=? AND SIFRE=?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(6, txtEskiKullaniciAdi.getText());
                ps.setString(7, new String(txtpEskiSifre.getPassword()));
                try {
                    ps.setInt(1, Integer.parseInt(txtKimlikNu.getText()));
                } catch (RollbackException e) {
                    System.out.println("duplicate key kimlik nu");
                    JOptionPane.showMessageDialog(rootPane, "Başkası tarafından kullanılan kimlik numarası.");
                }
                try {
                    ps.setString(2, txtKullaniciAdi.getText());
                } catch (RollbackException e) {
                    System.out.println("duplicate key kullanıcı adı");
                    JOptionPane.showMessageDialog(rootPane, "Başkası tarafından alınmış kullanıcı adı.");
                }

                ps.setString(3, new String(txtpSifre.getPassword()));
                ps.setString(4, txtAd.getText());
                ps.setString(5, txtSoyad.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Güncelleme başarılı.");

            } catch (SQLException ex) {
                Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnBilgileriGuncelleActionPerformed

    private void btnSorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSorgulaActionPerformed
        // TODO add your handling code here:
        txtEskiKullaniciAdi.setVisible(true);
        txtpEskiSifre.setVisible(true);
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Bulusma_Uygulama", "sa", "as");

            String sql = "SELECT * FROM KISI WHERE KULLANICI_ADI=? AND SIFRE=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, txtKullaniciAdi.getText());
            ps.setString(2, new String(txtpSifre.getPassword()));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                txtKimlikNu.setText(rs.getString("KIMLIK_NU"));
                txtAd.setText(rs.getString("ADI"));
                txtSoyad.setText(rs.getString("SOYADI"));
                txtpSifreTekrar.setText(rs.getString("SIFRE"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(KullaniciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSorgulaActionPerformed

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
            java.util.logging.Logger.getLogger(KullaniciKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciKayit().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBilgileriGuncelle;
    private javax.swing.JButton btnGirisEkraninaGit;
    private javax.swing.JButton btnKaydol;
    private javax.swing.JButton btnSorgula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblAd;
    private javax.swing.JLabel lblKayit;
    private javax.swing.JLabel lblKimlikNu;
    private javax.swing.JLabel lblKullaniciAdi;
    private javax.swing.JLabel lblSifre;
    private javax.swing.JLabel lblSifreTekrar;
    private javax.swing.JLabel lblSoyad;
    private javax.swing.JLabel lblUyariAd;
    private javax.swing.JLabel lblUyariKimlikNu;
    private javax.swing.JLabel lblUyariKullaniciAdi;
    private javax.swing.JLabel lblUyariSifre;
    private javax.swing.JLabel lblUyariSifreTekrar;
    private javax.swing.JLabel lblUyariSoyad;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtEskiKullaniciAdi;
    private javax.swing.JTextField txtKimlikNu;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JPasswordField txtpEskiSifre;
    private javax.swing.JPasswordField txtpSifre;
    private javax.swing.JPasswordField txtpSifreTekrar;
    // End of variables declaration//GEN-END:variables
}
