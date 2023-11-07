package hafta04;







abstract class Soyut{
    //nesnesi oluşturulamaz
    //miras verebilir
    //abstract sınıfta en az bir tane abstract method olmalıdır
    abstract void tckimlikAl();
    abstract void ogrenciisimAl();

    void yaz(){
        System.out.println("Somut method içinden yazıldı");
    }
}


class Somut extends Soyut{

    @Override
    void tckimlikAl() {
        //öğrencinin tc numarası alınmalı
    }

    @Override
    void ogrenciisimAl() {
        //öğrencinin ismi alınmalı
    }
}



public class abstract_soyut_siniflar {
    public static void main(String[] args) {
      //  Soyut s = new Soyut(); nesnesi özel override ile oluşturulabilir

     /*   Soyut s = new Soyut() {
            @Override
            void tckimlikAl() {

            }

            @Override
            void ogrenciisimAl() {

            }
        }; */

    }
}
