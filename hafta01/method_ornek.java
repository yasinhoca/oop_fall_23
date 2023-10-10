package hafta01;

import java.util.Scanner;

public class method_ornek {

    static int topla(int a,int b){
        return a + b;
    }

    static float ortalama(int x, int y){
        return ((float) x+y)/2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //veri almak için Scanner sınıfından scan nesnesi ürettik
        int a,b;
        System.out.println("Bir sayı giriniz : ");
        a = scan.nextInt();
        System.out.println("Bir sayı daha giriniz : ");
        b = scan.nextInt();

        System.out.println(topla(a,b));
        System.out.println(ortalama(a,b));
    }

}
