package hafta02;

public class methodlar_overloading {
    // methodlarda overloading - aşırı yükleme


    static float ortalama(int a, int b){
        return ((float)a+b)/2;
    }
    static float ortalama(int a,int b,int c){
        return ((float)a+b+c)/3;
    }

    static int ortalama(float a,float b){
        return (int) ((a+b)/2);
    }

    static void ortalama(int a,float b){
        float ort = ((float)a+b)/2;
        System.out.println("Ortalama : " + ort);
    }

    public static void main(String[] args) {
        System.out.println(ortalama(5,8));
        System.out.println(ortalama(13,21,50));
        System.out.println(ortalama(5.3f,28.3f));
        ortalama(113,247f);
    }

}
