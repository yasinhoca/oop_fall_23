import java.util.Random;

public class deneme_odevi_java_ile_cozum {
    public static void main(String[] args) {
        Random r = new Random();
        int cift_sayac, tek_sayac, cift_toplam, tek_toplam, randomSayi,i;
        int[] dizi = new int[1000];

        cift_sayac = tek_sayac=cift_toplam= tek_toplam=0;

        for(i=0;i<1000;i++) {
            randomSayi = r.nextInt(100);
            dizi[i] = randomSayi;
            if (randomSayi % 2 == 0) {
                cift_sayac++;
                cift_toplam += randomSayi;
            } else {
                tek_sayac++;
                tek_toplam += randomSayi;
            }
        }

            for(i=0;i<1000;i++){
                System.out.print(dizi[i]+"-");
            }

            System.out.println("--------------------------------------");
            System.out.println("Tek sayı adedi ="+tek_sayac);
            System.out.println("Tek sayı toplam = "+tek_toplam);
            System.out.println("Tek sayı ortalama = "+(float)tek_toplam/tek_sayac );
            System.out.println("--------------------------------------");
            System.out.println("Çift sayı adedi ="+cift_sayac);
            System.out.println("Çift sayı toplam = "+cift_toplam);
            System.out.println("Çift sayı ortalama = "+(float)cift_toplam/cift_sayac );
        }



    }

