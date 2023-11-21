package hafta06;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class lambda_reduce {
    public static void main(String[] args) {
        List<Integer> liste = Arrays.asList(1,1,2,3,2,1,2);
        System.out.println(liste);
        Optional<Integer> o = liste.stream().reduce((p1,p2)->p1+p2);
        System.out.println(o.get());
        Optional<Integer> o2 = liste.stream().reduce((p1,p2)->p1-p2);
        System.out.println(o2.get());
        Optional<Integer> o3 = liste.stream().reduce((p1,p2)->p1*p2);
        System.out.println(o3.get());
        Optional<Integer> o4 = liste.stream().reduce((p1,p2)->p1>p2?p1:p2);
        System.out.println(o4.get());
        Optional<Integer> o5 = liste.stream().reduce((p1,p2)->p1<p2?p1:p2);
        System.out.println(o5.get());
        Optional<Integer> o6 = liste.stream().reduce((p1,p2)->p1>p2?p1-p2:p2-p1);
        System.out.println(o6.get());

    }
}
