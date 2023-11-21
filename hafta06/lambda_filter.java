package hafta06;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lambda_filter {
    public static void main(String[] args) {
        List<Integer> liste = Arrays.asList(23,72,17,89,45,52,23);
        System.out.println(liste);
        List<Integer> y = liste.stream().filter(p->p%2==0).collect(Collectors.toList());
        System.out.println(y);
        List<Integer> y2 = liste.stream().filter(p->p%2==1).collect(Collectors.toList());
        System.out.println(y2);
        List<Integer> y3= liste.stream().filter(p->p>50).collect(Collectors.toList());
        System.out.println(y3);
        List<Integer> y4= liste.stream().filter(p->p>20 && p<70).collect(Collectors.toList());
        System.out.println(y4);
        List<Integer> y5= liste.stream().filter(p->p%8==3).collect(Collectors.toList());
        System.out.println(y5);


    }
}
