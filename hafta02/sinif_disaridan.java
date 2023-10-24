package hafta02;



public class sinif_disaridan {
    public static void main(String[] args) {
        Hesapla h = new Hesapla(); // hesapla sınıfı ayrı bir java dosyasında, onun nesnesini oluşturduk.
        int s = h.topla(5,8);
        System.out.println(s);
        float o = h.ortalama(62,75);
        System.out.println(o);
        //çarpma methodu static olduğu için nesne tanımlamadan direk çağrılabilir
        int c = Hesapla.carpma(13,5);
        System.out.println(c);

    }
}
