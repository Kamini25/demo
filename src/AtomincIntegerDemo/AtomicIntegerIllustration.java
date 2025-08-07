package AtomincIntegerDemo;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerIllustration {
    private static AtomicInteger counter = new AtomicInteger(0);

public void incrementTask(){
    for(int i=0;i<=1000;i++){
        counter.incrementAndGet();
    }
}
public void decrementTask(){
    for(int i=0;i<=1000;i++){
    counter.decrementAndGet();
    }
}

    public static void main(String[] args) {
        AtomicIntegerIllustration ai = new AtomicIntegerIllustration();
        Thread incrementThread = new Thread (()-> {
            ai.incrementTask();
        });
        Thread decrementThread = new Thread(()-> {
            ai.decrementTask();
        });
        incrementThread.start();
        decrementThread.start();

        try{
            incrementThread.join();
            decrementThread.join();
        }catch(InterruptedException ex)
        {
            System.out.println("exception " + ex.getMessage());

        }
        System.out.println("final counter " + counter.get());
    }
}
