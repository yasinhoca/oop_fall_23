package hafta03;






public class Universite {
    public String universite_ad = "neü";
    public String universite_sehir = "konya";

    private int yok_id = 42; //Bu değişken private subclasslardan ulaşmak imkansız
    //private değişkenlere ulaşmak için encapsulation (kapsülleme) yapılmalıdır
    //kapsülleme getter ve setter denilen özel methodlar ile yapılır.
    //code sekmesinden generate seçeneği üzerinden getter/setter seçilebilir
    public int getYok_id() { //getter veriyi okumamızı sağlıyacak
        return yok_id;
    }

    public void setYok_id(int yok_id) { //veriyi başka sınıftan düzenlememize imkan verir
        this.yok_id = yok_id;
    }
}
