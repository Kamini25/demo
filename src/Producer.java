import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    BlockingQueue<Integer> q;

    public Producer(BlockingQueue<Integer> q) {
        this.q = q;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                q.put(i); // blocks if queue is full
                System.out.println("produced " + i);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}