package hafta05;


import java.util.Timer;
import java.util.TimerTask;


public class timer_ornek {
    static Timer t1,t2;
    static TimerTask g1,g2;
    static int sayac = 5;

    public static void main(String[] args) {
        t1 = new Timer();
        t2 = new Timer();

        g1 = new TimerTask() {
            @Override
            public void run() {
                sayac-=5;
                if(sayac>10) {
                    t1.cancel();
                    t2.cancel();
                }
                System.out.print("g1");
            }
        };

        g2 = new TimerTask() {
            @Override
            public void run() {
                sayac+=3;
                if(sayac>10) {
                    t2.cancel();
                    t1.cancel();
                }
                System.out.print("g2");
            }
        };

        t1.schedule(g1,0,1000);
        t2.schedule(g2,0,400);


    }


}
