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
@Table(name = "DOKTOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Doktor_1.findAll", query = "SELECT d FROM Doktor_1 d")
    , @NamedQuery(name = "Doktor_1.findByDoktorId", query = "SELECT d FROM Doktor_1 d WHERE d.doktorId = :doktorId")
    , @NamedQuery(name = "Doktor_1.findByDoktorAdi", query = "SELECT d FROM Doktor_1 d WHERE d.doktorAdi = :doktorAdi")
    , @NamedQuery(name = "Doktor_1.findByDoktorSoyadi", query = "SELECT d FROM Doktor_1 d WHERE d.doktorSoyadi = :doktorSoyadi")
    , @NamedQuery(name = "Doktor_1.findByDoktorKullaniciAdi", query = "SELECT d FROM Doktor_1 d WHERE d.doktorKullaniciAdi = :doktorKullaniciAdi")
    , @NamedQuery(name = "Doktor_1.findByDoktorSifre", query = "SELECT d FROM Doktor_1 d WHERE d.doktorSifre = :doktorSifre")})
public class Doktor_1 implements Serializable {

    @Column(name = "UZMANLIK_ALANI")
    private String uzmanlikAlani;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DOKTOR_ID")
    private Integer doktorId;
    @Column(name = "DOKTOR_ADI")
    private String doktorAdi;
    @Column(name = "DOKTOR_SOYADI")
    private String doktorSoyadi;
    @Basic(optional = false)
    @Column(name = "DOKTOR_KULLANICI_ADI")
    private String doktorKullaniciAdi;
    @Column(name = "DOKTOR_SIFRE")
    private String doktorSifre;

    public Doktor_1() {
    }

    public Doktor_1(Integer doktorId) {
        this.doktorId = doktorId;
    }

    public Doktor_1(Integer doktorId, String doktorKullaniciAdi) {
        this.doktorId = doktorId;
        this.doktorKullaniciAdi = doktorKullaniciAdi;
    }

    public Integer getDoktorId() {
        return doktorId;
    }

    public void setDoktorId(Integer doktorId) {
        this.doktorId = doktorId;
    }

    public String getDoktorAdi() {
        return doktorAdi;
    }

    public void setDoktorAdi(String doktorAdi) {
        this.doktorAdi = doktorAdi;
    }

    public String getDoktorSoyadi() {
        return doktorSoyadi;
    }

    public void setDoktorSoyadi(String doktorSoyadi) {
        this.doktorSoyadi = doktorSoyadi;
    }

    public String getDoktorKullaniciAdi() {
        return doktorKullaniciAdi;
    }

    public void setDoktorKullaniciAdi(String doktorKullaniciAdi) {
        this.doktorKullaniciAdi = doktorKullaniciAdi;
    }

    public String getDoktorSifre() {
        return doktorSifre;
    }

    public void setDoktorSifre(String doktorSifre) {
        this.doktorSifre = doktorSifre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (doktorId != null ? doktorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doktor_1)) {
            return false;
        }
        Doktor_1 other = (Doktor_1) object;
        if ((this.doktorId == null && other.doktorId != null) || (this.doktorId != null && !this.doktorId.equals(other.doktorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DonemOdevi.Doktor_1[ doktorId=" + doktorId + " ]";
    }

    public String getUzmanlikAlani() {
        return uzmanlikAlani;
    }

    public void setUzmanlikAlani(String uzmanlikAlani) {
        this.uzmanlikAlani = uzmanlikAlani;
    }
    
}
