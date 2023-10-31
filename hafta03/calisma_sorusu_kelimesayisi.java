package hafta03;

public class calisma_sorusu_kelimesayisi {




    static int kelimeSayisi(String s){
        int bs=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') bs++;
        }

        int ks = bs+1;
        return ks;

    }



    public static void main(String[] args) {
        System.out.println(kelimeSayisi("insan davranışları içinde en belirgin olanı gerçeği reddetmektir"));
        System.out.println(kelimeSayisi("nesne yönelimli programcılığı çok seviyorum"));

    }

}
