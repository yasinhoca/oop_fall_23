package hafta03;

public class inheritence_giris {
    public static void main(String[] args) {
        Fakulte ubf = new Fakulte();
        //ubf.universite_ad  üniversite sınıfından miras alır
        //ubf.universite_sehir üniversite sınıfından miras alır
        //ubf.yok_id alamaz çünkü private tanımlanmış
        System.out.println(ubf.getYok_id()); //getter ile yok_id değişkenini okuyabiliriz
        ubf.setYok_id(43); //burada ise setter ile yeni id veriyorus. gerçek hayatta kesinlikle yapılmamalı
        System.out.println(ubf.getYok_id()); //yeni yok_id değerini getter ile alıyoruz tekrar

        Bolum ybs = new Bolum();
        //ybs.universite_ad   üniversite sınıfından (dedesinden) miras alıyor
        //ybs.universite_sehir    "

        //ybs.fakulte_ad fakülte sınıfından (babasından) miras alır
        //ybs.fakulte_adres      "

        //bir sınıf miras veriyorsa superclass'tır
        //bir sınıf miras alıyorsa subclass'tır

        //ybs.getYok_id()  bolum üzerinden de artık ulaşılabilir
        //ybs.setYok_id();

    }
}
