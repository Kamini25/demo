
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class Test{
public static void main(String[] args) throws InterruptedException {
    BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(3);
    Producer p = new Producer(bq);
    Consumer c = new Consumer(bq);
    Thread pt = new Thread(p);
    Thread ct = new Thread(c);
    pt.start();
    ct.start();

    pt.join();
    ct.join();
}
}



