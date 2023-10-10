package hafta01;

import java.util.Scanner;

public class fibonacci_metho_ile_cozum {

    static void fibonacci_bul(int uzunluk){ //program hiç br şey döndürmeyecekse void ön eki kullanılır
        int a,b,c;
        a=0;
        b=1;
        System.out.print(a+"-"+b+"-");
        int i;
        for(i=0;i<uzunluk;i++){
            c = a +b;
            System.out.print(c+"-");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fibonacci serisinin uzunluğunu giriniz : ");
        int uzunluk = scan.nextInt();
        fibonacci_bul(uzunluk);

    }

}
