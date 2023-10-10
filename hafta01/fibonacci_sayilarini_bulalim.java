package hafta01;

import java.util.Scanner;

public class fibonacci_sayilarini_bulalim {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fibonacci serisinin uzunluğunu giriniz : ");
        int seri = scan.nextInt();

        int a,b,c;
        a=0;
        b=1;
        System.out.print(a+"-"+b+"-");
        int i;
        for(i=0;i<seri;i++){
            c = a +b;
            System.out.print(c+"-");
            a = b;
            b = c;
        }
    }
}
