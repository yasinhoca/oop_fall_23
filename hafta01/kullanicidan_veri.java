package hafta01;

import java.util.Scanner;

public class kullanicidan_veri {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //veri almak için Scanner sınıfından scan nesnesi ürettik
        int a,b;


        System.out.println("Bir sayı giriniz : ");
        a = scan.nextInt();

        System.out.println("Bir sayı daha giriniz : ");
        b = scan.nextInt();

        //iki sayı aralığındaki tek sayıları bulduralım

        for(int i=a;i<b;i++){
            if(i%2==1) System.out.print(i+" - ");
        }

    }

}
