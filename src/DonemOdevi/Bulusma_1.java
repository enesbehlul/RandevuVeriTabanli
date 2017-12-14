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
@Table(name = "BULUSMA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bulusma_1.findAll", query = "SELECT b FROM Bulusma_1 b")
    , @NamedQuery(name = "Bulusma_1.findByBulusmaId", query = "SELECT b FROM Bulusma_1 b WHERE b.bulusmaId = :bulusmaId")
    , @NamedQuery(name = "Bulusma_1.findByKisiId", query = "SELECT b FROM Bulusma_1 b WHERE b.kisiId = :kisiId")
    , @NamedQuery(name = "Bulusma_1.findByKisiAdi", query = "SELECT b FROM Bulusma_1 b WHERE b.kisiAdi = :kisiAdi")
    , @NamedQuery(name = "Bulusma_1.findByDoktorId", query = "SELECT b FROM Bulusma_1 b WHERE b.doktorId = :doktorId")
    , @NamedQuery(name = "Bulusma_1.findByDoktorAdi", query = "SELECT b FROM Bulusma_1 b WHERE b.doktorAdi = :doktorAdi")
    , @NamedQuery(name = "Bulusma_1.findByTarih", query = "SELECT b FROM Bulusma_1 b WHERE b.tarih = :tarih")})
public class Bulusma_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BULUSMA_ID")
    private Integer bulusmaId;
    @Column(name = "KISI_ID")
    private Integer kisiId;
    @Column(name = "KISI_ADI")
    private String kisiAdi;
    @Column(name = "DOKTOR_ID")
    private Integer doktorId;
    @Column(name = "DOKTOR_ADI")
    private String doktorAdi;
    @Column(name = "TARIH")
    private String tarih;

    public Bulusma_1() {
    }

    public Bulusma_1(Integer bulusmaId) {
        this.bulusmaId = bulusmaId;
    }

    public Integer getBulusmaId() {
        return bulusmaId;
    }

    public void setBulusmaId(Integer bulusmaId) {
        this.bulusmaId = bulusmaId;
    }

    public Integer getKisiId() {
        return kisiId;
    }

    public void setKisiId(Integer kisiId) {
        this.kisiId = kisiId;
    }

    public String getKisiAdi() {
        return kisiAdi;
    }

    public void setKisiAdi(String kisiAdi) {
        this.kisiAdi = kisiAdi;
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

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bulusmaId != null ? bulusmaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bulusma_1)) {
            return false;
        }
        Bulusma_1 other = (Bulusma_1) object;
        if ((this.bulusmaId == null && other.bulusmaId != null) || (this.bulusmaId != null && !this.bulusmaId.equals(other.bulusmaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DonemOdevi.Bulusma_1[ bulusmaId=" + bulusmaId + " ]";
    }
    
}
