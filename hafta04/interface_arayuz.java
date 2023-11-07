package hafta04;







//interface
interface Arayuz{
    // sınıf benzeri tanımlardır
    //sınıflara implement edilerek miras verebilir
    //tüm methodlar miras verilen sınıfta override edilmelidir
    void tckimlikAl();
    void ogrenciismiAl();
    void telnoAl();
}

class Mirasci implements Arayuz{

    @Override
    public void tckimlikAl() {

    }

    @Override
    public void ogrenciismiAl() {

    }

    @Override
    public void telnoAl() {

    }
}

public class interface_arayuz {
    public static void main(String[] args) {
       /* Arayuz a = new Arayuz() {
            @Override
            public void tckimlikAl() {

            }

            @Override
            public void ogrenciismiAl() {

            }

            @Override
            public void telnoAl() {

            }
        }; */

        Mirasci m = new Mirasci();
        m.ogrenciismiAl();
    }
}
