 package AtomincIntegerDemo;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerVariation {
    private static AtomicInteger counter  = new AtomicInteger(0);
public static void main(String[] args) {

    Thread t1  = new Thread(()->{
        for(int i=1;i<=1000;i++){
        counter.incrementAndGet();
        }
    });
    Thread t2 = new Thread(()->{
        for(int j=1;j<=1000;j++){
        counter.decrementAndGet();
        }
    });
    t1.start();
    t2.start();

        try{
            t1.join();
            t2.join();
        }catch(InterruptedException ex)
        {
            System.out.println("exception " + ex.getMessage());

        }
        System.out.println("final counter " + counter.get());
}
     
}