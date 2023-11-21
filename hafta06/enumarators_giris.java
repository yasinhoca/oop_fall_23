package hafta06;





enum Gunler{
    PAZARTESİ, //indis 0
    SALI, //1
    ÇARŞAMBA, //2
    PERŞEMBE,
    CUMA,
    CUMARTESİ,
    PAZAR //6
}

enum Takip{
    SİPARİŞ_HAZIRLANIYOR,
    KARGOYA_VERİLDİ,
    KARGODA,
    MÜŞTERİYE_ULAŞTI,
    İADE_SÜRECİNDE
}



public class enumarators_giris {
    public static void main(String[] args) {
        Gunler g = Gunler.PAZARTESİ;
        System.out.println(g);
        System.out.println(g.compareTo(Gunler.PERŞEMBE));
        System.out.println(Gunler.PAZAR.compareTo(Gunler.ÇARŞAMBA));
        System.out.println(g.ordinal());
        System.out.println(Gunler.PAZAR.ordinal());
    }
}
