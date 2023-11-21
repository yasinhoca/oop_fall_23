package hafta06;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class calisma_sorusu_sifre_olusturma {
    static ArrayList sifreOlustur(){
        ArrayList<Character> c = new ArrayList<>();
        Random r = new Random();
        c.add((char) ((char)r.nextInt(26)+65));
        c.add((char) ((char)r.nextInt(26)+65));
        c.add((char) ((char)r.nextInt(26)+65));
        c.add((char) ((char)r.nextInt(26)+97));
        c.add((char) ((char)r.nextInt(26)+97));
        c.add((char) ((char)r.nextInt(26)+97));
        c.add((char) ((char)r.nextInt(10)+48));
        c.add((char) ((char)r.nextInt(10)+48));
        //System.out.println(c);
        Collections.shuffle(c);
        return c;
    }



    public static void main(String[] args) {
        ArrayList<String> sifreler = new ArrayList<>();
        String s ="";

        for(int j=0;j<10000;j++) {
            ArrayList<Character> c = sifreOlustur();
            //System.out.println(c);
            s = "";
            for (int i = 0; i < c.size(); i++) s += c.get(i);
            //System.out.println(s);
            sifreler.add(s);
        }

        System.out.println(sifreler);

    }
}
