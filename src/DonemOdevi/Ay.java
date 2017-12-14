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
public class Ay {

    public static int gunSayisi;
    String AyAdi;

    public Ay(String AyAdi) {
        this.AyAdi = AyAdi;
        Tarih.aylar.add(this);
        switch (AyAdi) {
            case "Ocak":
                Bulusma_Uygulama.ayGunSayisi = 31;
                break;
            case "Şubat":
                Bulusma_Uygulama.ayGunSayisi = 28;
                break;
            case "Mart":
                Bulusma_Uygulama.ayGunSayisi = 31;
                break;
            case "Nisan":
                Bulusma_Uygulama.ayGunSayisi = 30;
                break;
            case "Mayıs":
                Bulusma_Uygulama.ayGunSayisi = 31;
                break;
            case "Haziran":
                Bulusma_Uygulama.ayGunSayisi = 30;
                break;
            case "Temmuz":
                Bulusma_Uygulama.ayGunSayisi = 31;
                break;
            case "Ağustos":
                Bulusma_Uygulama.ayGunSayisi = 31;
                break;
            case "Eylül":
                Bulusma_Uygulama.ayGunSayisi = 30;
                break;
            case "Ekim":
                Bulusma_Uygulama.ayGunSayisi = 31;
                break;
            case "Kasım":
                Bulusma_Uygulama.ayGunSayisi = 30;
                break;
            case "Aralık":
                Bulusma_Uygulama.ayGunSayisi = 31;
                break;
        }
    }
}
