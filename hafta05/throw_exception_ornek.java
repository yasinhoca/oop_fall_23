package hafta05;


import java.util.Scanner;

public class throw_exception_ornek {

    static float ortalama(int v, int f){
        float ort = 0;
        if(v>100 || v<0 || f>100 || f<0 ){
            throw  new ArithmeticException("Notlar 0 ile 100 arasında girilmeli!");
        } else {
            ort = (float) (0.4*v + 0.6*f);
        }
        return ort;
    }

    public static void main(String[] args) {
        int v,f;
        Scanner scan = new Scanner(System.in);
        System.out.println("Vize giriniz :");
        v = scan.nextInt();
        System.out.println("Final giriniz :");
        f = scan.nextInt();

        System.out.println(ortalama(v,f));

    }



}
