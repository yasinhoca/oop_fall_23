package hafta03;

class Erisim {
    int numara;
    public String okul_adi;
    protected String ad;
    private int tckimlikno;

}


public class erisim_niteleyiciler {

    public static void main(String[] args) {
            Erisim e = new Erisim();
            e.ad = "Ali";
            e.okul_adi = "NEÜ";
            e.numara = 111;
           // e.tckimlikno = 322; private alana nesne üzerinden erişilemez
    }

}
