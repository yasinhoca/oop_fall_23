package hafta04;





class Hayvan{
    void ses(){
        System.out.println("Bu method hayvanların çıkardığı sesleri çalsın/yazsın");
        }
        }

class Kedi extends Hayvan{
    void ses(){// override
        System.out.println("miyav miyav");
    }
}

class Kopek extends Hayvan{
    void ses(){// override
        System.out.println("hav hav");
    }
}

class Kurbaga extends Hayvan{
    void ses(){// override
        System.out.println("vrak vrak");
    }
}

class HayvanSesi extends Hayvan{
    static void ses(Hayvan h){ //aynı işi yapan override edilmiş methodlar superclass üzerinden çağrılabilir polymorphism
        h.ses(); //method girişi hayvan sınıfının nesnesidir
    }
}

public class polymorphism_java {
    public static void main(String[] args) {
        Kedi ke = new Kedi();
        ke.ses();
        Kopek ko = new Kopek();
        ko.ses();
        Kurbaga ku = new Kurbaga();
        ku.ses();

        System.out.println("Polymorphism çalışacak bu noktada");
        HayvanSesi.ses(ke);

    }
}
