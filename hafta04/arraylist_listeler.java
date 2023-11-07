package hafta04;



import java.util.ArrayList;
import java.util.Collections;

public class arraylist_listeler {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(3);
        liste.add(5);
        liste.add(12);
        System.out.println(liste);
        liste.add(3,17);
        System.out.println(liste);
        liste.add(0,21);
        System.out.println(liste);
        liste.add(2,13);
        System.out.println(liste);
        System.out.println(liste.get(3));

        liste.remove(3);
        System.out.println(liste);

        //liste.clear();
       //System.out.println(liste);
        liste.set(0,90);
        System.out.println(liste);

        Collections.sort(liste);
        System.out.println(liste);
        Collections.reverse(liste);
        System.out.println(liste);

        Collections.shuffle(liste);
        System.out.println(liste);


        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Ayşe");
        isimler.add("Zeynep");
        isimler.add("Cihan");
        isimler.add("Betül");
        System.out.println(isimler);
        Collections.sort(isimler);
        System.out.println(isimler);
        System.out.println(isimler.get(0));
        System.out.println(isimler.get(3));
        System.out.println(isimler.size());
        System.out.println(isimler.get(isimler.size()-5));
        System.out.println(isimler.get(4).charAt(0));
        System.out.println(isimler.get(isimler.get(1).length()));

    }
}
