package hafta05;


import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch_hata_yakalama {
    public static void main(String[] args) {

        /*try {
            int a = 19/0;

        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Bölen değeri 0 olamaz!");
        } */


        try {
            int a,b,sonuc;
            Scanner scan = new Scanner(System.in);
            System.out.println("Bir tam sayı giriniz :");
            a = scan.nextInt();
            System.out.println("Bir tam sayı daha giriniz :");
            b = scan.nextInt();
            sonuc = a+b;
            System.out.println("Sonuc = " + sonuc);

        }catch(InputMismatchException e){
            System.out.println("Lütfen tam sayı giriniz!");
            System.out.println("Hata : " + e.getMessage());

        }finally {
            System.out.println("Burası ne olursa olsun çalışır!");
        }




    }
}
