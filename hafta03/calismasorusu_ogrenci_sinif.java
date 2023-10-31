package hafta03;





class Ogrenci {
    public int numara;
    public String ad;
    public String soyad;
    public String ders_adi;
    public int v;
    public int f;

    String ortalama(int v,int f){
        float ort = (float) ((float) v*0.4 + f*0.6);
        System.out.println("Ortalama = "+ort);

        if(ort>=60) return "GEÇTİ";
        else if(ort>=55 && ort<60) return "ŞARTLI GEÇER";
        else return "KALDI";

    }
}
public class calismasorusu_ogrenci_sinif {
    public static void main(String[] args) {
        Ogrenci o =new Ogrenci();
        o.v=50;
        o.f=65;
        String sonuc = o.ortalama(o.v,o.f);
        System.out.println(sonuc);
    }
}
