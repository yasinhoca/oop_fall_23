package hafta04;





class Yapici{

    Yapici() {    //constructer - yapıcı method sınıf ile aynı isimde olmak zorundadır
                    //sınıfın nesnesi oluturulunca bir kez çalışır
        System.out.println("Beni yapıcı method yazdı!");
    }

    Yapici(String s){ //constructer methodu overload etmiş oluyoruz
        //overload aynı isimli birden fazla method tanımlanması
        System.out.println("Merhaba " + s);
    }

}

public class constructer_yapici_method {
    public static void main(String[] args) {
        Yapici y = new Yapici(); // tam bu noktada constructer method bir kere çalışır
        Yapici y2 = new Yapici("Eren");
    }
}
