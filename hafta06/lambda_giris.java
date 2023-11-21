package hafta06;


import java.util.ArrayList;
import java.util.Arrays;

public class lambda_giris {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(0,3,1,4,7,8,9));
        System.out.println(liste);

        //lambda ile listede foreach döngüsü kullanalım
        liste.forEach(p-> System.out.print((p+3)+"-")); //liste elemanları güncellenmez sadece yazdırmadan önce 3 ekledik

    }



}
