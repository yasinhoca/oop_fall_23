package hafta03;

//Kendisine gönderilen sayı asal ise  "true" değilse "false" döndüren methodu tasarlayınız?


import java.util.Scanner;

public class calismasorusu_asalmi {

    static boolean asalMi(int sayi){
        int bolen_sayisi=0;
        for(int i=2;i<sayi;i++){
            if(sayi%i==0) bolen_sayisi++;
        }

        if(bolen_sayisi==0) return true; else return false;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = scan.nextInt();

        System.out.println(asalMi(sayi));
        if(asalMi(sayi)) System.out.println("Girdiğiniz sayı asaldır");
        else System.out.println("Girdiğiniz sayı asal değildir");
    }
}
