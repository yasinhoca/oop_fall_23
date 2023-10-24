package hafta02;


import java.util.Scanner;

public class calisma_sorusu2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.println("Birinci sayı :");
        a = scan.nextInt();
        System.out.println("İkinci sayı :");
        b = scan.nextInt();
        System.out.println("Üçüncü sayı :");
       c = scan.nextInt();

       if(a>b && a>c) {
           System.out.println("En büyük a :" + a );
       } else if(b>a && b>c){
           System.out.println("En büyük b :" + b );
       } else System.out.println("En büyük c :" + c );

        if(a<b && a<c) {
            System.out.println("En küçük a :" + a );
        } else if(b<a && b<c){
            System.out.println("En küçük b :" + b );
        } else System.out.println("En küçük c :" + c );

    }

}
