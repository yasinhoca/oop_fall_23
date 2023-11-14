package hafta05;


import java.util.Random;
import java.util.Scanner;

public class ascii_giris {


    static String rastgele(int uzunluk){
        Random r = new Random();
        int i;
        String s="";

        for(i=0;i<uzunluk;i++){
            s += (char)(r.nextInt(26)+65);
        }

        return s;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi giriniz:");
        String isim = scan.next();
        int uzunluk = isim.length();
        String uretilen="";
        int sayac = 0;

        while(true){
            uretilen = rastgele(uzunluk);
            sayac++;
            System.out.println(uretilen +" - " + sayac +". deneme");
            if(isim.equals(uretilen)) break;
        }

        System.out.println(sayac + ". denemede buldu!");

    }
}
