package hafta07;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class hashMap_giris {




    public static void main(String[] args) {
        HashMap<Integer,String> ogrenci = new HashMap<>();
        ogrenci.put(110,"Ali Altan");
        ogrenci.put(115,"Ayşe Güler");
        ogrenci.put(119,"Betül Bilir");
        System.out.println(ogrenci);

        System.out.println(ogrenci.get(110)); //110 key değerindeki veri alınır
        ogrenci.remove(115); //115 key değerindeki veri silinir
        System.out.println(ogrenci);
        System.out.println(ogrenci.containsKey(110));
        System.out.println(ogrenci.containsKey(115));

        HashMap<String,String> m1 = new HashMap<>(Map.of(
                "ybs","ali altan",
                "banka","veli vicdan"
        ));
        System.out.println(m1);
        HashMap<String,String> m2 = new HashMap<>(Map.of(
                "lojistik","cihan civan",
                "muhasebe","deniz denge",
                "ybs","elif eylül"
        ));
        System.out.println(m2);

        m1.putAll(m2); //var olan verinin üstüne son veriyi yazar
        System.out.println(m1);
        m1.clear();
        System.out.println(m1);

        TreeMap<Float,Boolean> agac=new TreeMap<>();//yapısal farkı olan map
        agac.put(0.45f,true);
        System.out.println(agac);

    }
}
