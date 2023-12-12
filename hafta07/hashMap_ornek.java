package hafta07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashMap_ornek {
    public static void main(String[] args) {
        HashMap<Integer,String> birler = new HashMap<>(Map.of(
                0,"",
                1,"bir",
                2,"iki",
                3,"üç",
                4,"dört",
                5,"beş",
                6,"altı",
                7,"yedi",
                8,"sekiz",
                9,"dokuz"
        ));

        HashMap<Integer,String> onlar = new HashMap<>(Map.of(
                0,"",
                1,"on",
                2,"yirmi",
                3,"otuz",
                4,"kırk",
                5,"elli",
                6,"altmış",
                7,"yetmiş",
                8,"seksen",
                9,"doksan"
        ));

        Scanner scan = new Scanner(System.in);
        System.out.println("İki basamaklı bir sayı giriniz:");
        int sayi = scan.nextInt();

        String s = Integer.toString(sayi);
        int birler_basamak = Integer.parseInt(Character.toString(s.charAt(1)));
        int onlar_basamak = Integer.parseInt(Character.toString(s.charAt(0)));

        System.out.println(onlar.get(onlar_basamak)+ " " + birler.get(birler_basamak));




    }
}
