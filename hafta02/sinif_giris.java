package hafta02;




class Ogrenci{
    int ogr_no;
    String ogr_ad;
    String ogr_soyad;
    String ogr_adres;
    boolean cinsiyet;

    void yazdir(String ad, String soyad,int numara,String adres, boolean cinsiyet){
        System.out.println(ad+"-"+soyad+"-"+numara+"-"+adres+"-"+cinsiyet);
    }
}


public class sinif_giris {
    public static void main(String[] args) {
        Ogrenci o1 = new Ogrenci(); //nesne tanımlandı
        o1.ogr_no = 111;
        o1.ogr_ad = "Ali";
        o1.ogr_soyad = "Altan";
        o1.ogr_adres = "Meram";
        o1.cinsiyet = true;
        o1.yazdir(o1.ogr_ad,o1.ogr_soyad,o1.ogr_no,o1.ogr_adres,o1.cinsiyet);

        Ogrenci o2 = new Ogrenci(); //ikinci öğrenci nesnesi
        o2.ogr_no = 222;
        o2.ogr_ad = "Ayşe";
        o2.ogr_soyad = "Baki";
        o2.ogr_adres = "Selçuklu";
        o2.cinsiyet = false;
        o2.yazdir(o2.ogr_ad,o2.ogr_soyad,o2.ogr_no,o2.ogr_adres,o2.cinsiyet);
    }
}
