package hafta06;


import java.util.Random;
import java.util.Scanner;

public class calisma_sorusu_sayi_tahmin {
    public static void main(String[] args) {
        Random r = new Random();
        int rast = r.nextInt(100);
        Scanner scan = new Scanner(System.in);
        int tahmin=0;
        int sayac = 0;

        while (true){
            System.out.println("Tahmin et:");
            tahmin = scan.nextInt();
            sayac++;
            System.out.println(sayac+". tahmin");
            if(rast==tahmin) break;
            else if(rast>tahmin) System.out.println("YUKARI");
            else System.out.println("AŞAĞI");
        }
        System.out.println("Tebrikler bildiniz");
    }
}
