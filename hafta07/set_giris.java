package hafta07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class set_giris {
    public static void main(String[] args) {
        Set<Integer> k1 = new HashSet<>(Arrays.asList(3,4,0,1,8));
        System.out.println(k1);
        Set<Integer> k2 = new HashSet<>(Arrays.asList(2,7,0,1,9));
        System.out.println(k2);

        // k1.addAll(k2); //birleşim işlemi gerçekleştirir
        // System.out.println(k1);

        // k1.retainAll(k2); //kesişim işlemi
        // System.out.println(k1);

        k1.removeAll(k2); //fark işlemi
        System.out.println(k1);

    }
}
