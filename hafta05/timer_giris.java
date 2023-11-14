package hafta05;


import java.util.Timer;
import java.util.TimerTask;


public class timer_giris {
    static Timer t;
    static TimerTask gorev,gorev2;
    static int sayac = 30;


    public static void main(String[] args) {
        t = new Timer();

        gorev = new TimerTask() {
            @Override
            public void run() {
                sayac--;
                if(sayac<=0) t.cancel();

                System.out.println(sayac);
            }
        };

        gorev2 = new TimerTask() {
            @Override
            public void run() {
                sayac-=3;
                System.out.println("g2 çalıştı");
            }
        };

        t.schedule(gorev,0,100);
        t.schedule(gorev2,500,500);
    }


}
