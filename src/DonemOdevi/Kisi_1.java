/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DonemOdevi;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Enes Behlul
 */
@Entity
@Table(name = "KISI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kisi_1.findAll", query = "SELECT k FROM Kisi_1 k")
    , @NamedQuery(name = "Kisi_1.findByKimlikNu", query = "SELECT k FROM Kisi_1 k WHERE k.kimlikNu = :kimlikNu")
    , @NamedQuery(name = "Kisi_1.findByKullaniciAdi", query = "SELECT k FROM Kisi_1 k WHERE k.kullaniciAdi = :kullaniciAdi")
    , @NamedQuery(name = "Kisi_1.findBySifre", query = "SELECT k FROM Kisi_1 k WHERE k.sifre = :sifre")
    , @NamedQuery(name = "Kisi_1.findByAdi", query = "SELECT k FROM Kisi_1 k WHERE k.adi = :adi")
    , @NamedQuery(name = "Kisi_1.findBySoyadi", query = "SELECT k FROM Kisi_1 k WHERE k.soyadi = :soyadi")})
public class Kisi_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KIMLIK_NU")
    private Integer kimlikNu;
    @Basic(optional = false)
    @Column(name = "KULLANICI_ADI")
    private String kullaniciAdi;
    @Basic(optional = false)
    @Column(name = "SIFRE")
    private String sifre;
    @Basic(optional = false)
    @Column(name = "ADI")
    private String adi;
    @Basic(optional = false)
    @Column(name = "SOYADI")
    private String soyadi;

    public Kisi_1() {
    }

    public Kisi_1(Integer kimlikNu) {
        this.kimlikNu = kimlikNu;
    }

    public Kisi_1(Integer kimlikNu, String kullaniciAdi, String sifre, String adi, String soyadi) {
        this.kimlikNu = kimlikNu;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.adi = adi;
        this.soyadi = soyadi;
    }

    public Integer getKimlikNu() {
        return kimlikNu;
    }

    public void setKimlikNu(Integer kimlikNu) {
        this.kimlikNu = kimlikNu;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kimlikNu != null ? kimlikNu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kisi_1)) {
            return false;
        }
        Kisi_1 other = (Kisi_1) object;
        if ((this.kimlikNu == null && other.kimlikNu != null) || (this.kimlikNu != null && !this.kimlikNu.equals(other.kimlikNu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DonemOdevi.Kisi_1[ kimlikNu=" + kimlikNu + " ]";
    }
    
}
