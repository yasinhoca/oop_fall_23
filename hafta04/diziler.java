package hafta04;


import java.util.Random;

public class diziler {


    static int rastgeleSayi(){
        Random r = new Random();
        return r.nextInt(100);
    }


    public static void main(String[] args) {
        String[] isimler = new String[100];
        isimler[0]="Ali";
        isimler[1]="Ayşe";

        System.out.println("ilk öğrenci : " + isimler[0]);

        int[] sayilar = new int[100];

        for(int i = 0;i<100; i++) {
            sayilar[i]=rastgeleSayi();
            System.out.print(sayilar[i]+" - ");
        }

    }
}
