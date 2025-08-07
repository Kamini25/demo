public class App {
    /*Daemon Thread Illustration */

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // create 2 threads
        Thread t1 = new Thread(() -> {
            try {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("userThread " + i);
                    Thread.sleep(1);
                }
            } catch (InterruptedException ex) {
                System.out.println("exception");
            }

        });
        Thread t2 = new Thread(() -> {
          //  try {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("DaemonThread " + i);
                  //  Thread.sleep(4000);
                }
        //    } catch (InterruptedException ex) {
        //        System.out.println("Exception");
        //    }
        });
        t1.start();
        t2.setDaemon(true);
        t2.start();

    }
}
