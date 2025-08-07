import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueue {
    private static BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(3);
    public static void main(String[] args) {
        Thread producerThread = new Thread(()->{
            for(int i=1;i<=5;i++){
                try {
                bq.put(i);
                }catch(InterruptedException e){
                    System.out.println("Exception " + e.getMessage());
                }
            }
        });
        Thread consumerThread = new Thread(()->{
            for(int i=1;i<=5;i++){
                try {
                Thread.sleep(10000);
                int x = bq.take();
                System.out.println("consumed " + x);
                }catch(InterruptedException e){
                    System.out.println("Exception " + e.getMessage());
                }
            }
        });
        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            System.out.println("Exception " + e.getMessage());
        }


        
    }
}
