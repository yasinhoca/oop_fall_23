package hafta02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calisma_sorusu1 {
    // kendisine gönderilen stringin başına merhaba yazdıran method

    static  String merhaba(String isim){
        return "Merhaba " + isim;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi giriniz: ");
        String isim = scan.nextLine();

        System.out.println(merhaba(isim));

    }
}
