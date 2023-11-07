package hafta04;





class Cokgen{
    public int kenar_sayisi=4;
    public int alan;

    int alan(int a,int b){
        return a*b;
    }

}

class Kare extends Cokgen{


    int alan(int a,int b){ //cokgen sınıfından miras alınan alan() methodu iptal edilir veya override edilir
        return a*a; //kar esınıfında en son tanımlanan method çalışacaktır
    }
}

public class override_method {
    public static void main(String[] args) {
        Kare k = new Kare();
        k.alan(5,5);
    }
}
