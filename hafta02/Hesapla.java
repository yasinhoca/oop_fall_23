package hafta02;

public class Hesapla {
    int topla(int a, int b){
        return a+b;
    }

    float ortalama(int a,int b){
        return ((float)a+b)/2;
    }

    static int carpma(int a,int b){ //static öneki eklenmiş
        return a*b;   //static deyimi methodun nesne olmadan çağrılabilmesini sağlar
        // static deyimi RAM üzerinde aynı hafıza bloklarını kullanır
    }
}


