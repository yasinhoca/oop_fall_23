package hafta09;


import java.util.ArrayList;



public class Sorular {
    ArrayList<Soru> sorular = new ArrayList<>();

    Sorular(){
        sorular.add(new Soru(
                1,
                "Türkiye'nin başkenti neresidir?",
                "Ankara",
                "Konya",
                "Erzurum",
                "Bursa",
                "Ankara"
        ));
        sorular.add(new Soru(
                2,
                "Türkiye'nin en büyük şehri neresidir?",
                "Ankara",
                "Konya",
                "Erzurum",
                "Bursa",
                "Konya"
        ));
        sorular.add(new Soru(
                3,
                "Türkiye'nin en soğuk şehri neresidir?",
                "Ankara",
                "Konya",
                "Erzurum",
                "Bursa",
                "Erzurum"
        ));
        sorular.add(new Soru(
                4,
                "Türkiye'nin en yeşil neresidir?",
                "Ankara",
                "Konya",
                "Erzurum",
                "Bursa",
                "Bursa"
        ));
        sorular.add(new Soru(
                5,
                "Türkiye'nin ikinci büyük, nüfus olarak, şehri neresidir?",
                "Ankara",
                "Konya",
                "Erzurum",
                "Bursa",
                "Ankara"
        ));
    }

}
