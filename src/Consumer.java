import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    BlockingQueue<Integer> q;
   public Consumer(BlockingQueue<Integer> q)
    {
        this.q = q;
    }
    
    public void run(){
        int i;
        for(i=1;i<=5;i++){
            try{
            Thread.sleep(10000); /*This sleep is added to simulate that consumer is slow and queue gets full quickly */
              int v=  q.take();
             // Thread.sleep(1000);
              System.out.println("consumed " + v);
              //Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
