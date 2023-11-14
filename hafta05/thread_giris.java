package hafta05;







public class thread_giris {
    static int i,j;

    public static void main(String[] args) {


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(i=0;i<10000;i++) System.out.print("AAAAA");
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(j=0;j<10000;j++) System.out.print("BBBBB");
            }
        });


        t1.start();
        t2.start();
    }
}
