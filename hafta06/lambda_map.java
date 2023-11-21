package hafta06;




import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class lambda_map {
    public static void main(String[] args) {
        List<Integer> liste = Arrays.asList(1,8,9,0,7,3,1);
        System.out.println(liste);
        List<Integer> y = liste.stream().map(p->p+3).collect(Collectors.toList());
        System.out.println(y);
        List<Double> y2 = liste.stream().map(p->Math.sqrt(p)).collect(Collectors.toList());
        System.out.println(y2);
        List<Double> y3 = liste.stream().map(p->Math.pow(p,(float)1/3)).collect(Collectors.toList());
        System.out.println(y3);

        //şartlı map
        List<Integer> y4 = liste.stream().map(p->p%2==0?p/2:(p+1)/2).collect(Collectors.toList());
        System.out.println(y4);
        List<Integer> y5 = liste.stream().map(p->p%2==0?p:p+1).collect(Collectors.toList());
        System.out.println(y5);
    }
}
