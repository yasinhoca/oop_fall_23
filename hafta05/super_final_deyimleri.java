package hafta05;


class Anasinif{ //superclass
    int a;
    void  yaz (){
        a = 5;
        System.out.println("Ben ana sınıftan yazdırıldım");
    }
}

class Altsinif extends Anasinif{ //subclass
    void yaz(){
        super.yaz();
        System.out.println(this.a);
        System.out.println("Ben de alt sınıftan yazdırıldım");
    }
}



public class super_final_deyimleri {
    public static void main(String[] args) {
        Altsinif as = new Altsinif();
        as.yaz();

    }
}
