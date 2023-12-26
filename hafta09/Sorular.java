package hafta09;

import java.util.ArrayList;


public class Sorular {
    ArrayList<Soru> sorular = new ArrayList<>();

    public Sorular() {
        sorular.add(new Soru(
                1,
                "Hangisi 3+5'in toplamıdır?",
                "8",
                "7",
                "6",
                "5",
                "8"
        ));
        sorular.add(new Soru(
                2,
                "Hangisi 4+5'in toplamıdır?",
                "8",
                "9",
                "6",
                "5",
                "9"
        ));
        sorular.add(new Soru(
                3,
                "Hangisi 5+5'in toplamıdır?",
                "8",
                "7",
                "10",
                "5",
                "10"
        ));
        sorular.add(new Soru(
                4,
                "Hangisi 6+5'in toplamıdır?",
                "8",
                "7",
                "6",
                "11",
                "11"
        ));
        sorular.add(new Soru(
                5,
                "Hangisi 7+5'in toplamıdır?",
                "12",
                "7",
                "6",
                "5",
                "12"
        ));

    }
}
