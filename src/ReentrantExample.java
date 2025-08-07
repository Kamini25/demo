import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
      Lock lock = new ReentrantLock();

  public void method2(){
    System.out.println(Thread.currentThread().getName() + " trying to enter the lock in method 2");

    lock.lock();
    System.out.println("Thread present  in method2 " + Thread.currentThread().getName());
    lock.unlock();
  }
  public void enter(){
      System.out.println(Thread.currentThread().getName() + " trying to enter the lock");

    lock.lock();
      System.out.println(Thread.currentThread().getName() + " entered the lock");
      try {
        method2();
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        e.printStackTrace();
        Thread.currentThread().interrupt();
      }
      System.out.println(Thread.currentThread().getName() + " released the lock");
      lock.unlock();
  
  }//end of enter
  public static void main(String[] args) {
    ReentrantExample re = new ReentrantExample();
try {
  Thread t1 = new Thread(re::enter);
  Thread t2 = new Thread(re::enter);
  Thread t3 = new Thread(re::method2);
    t1.start();
    t2.start();
    t3.start();

    t1.join();
    t2.join();
    t3.join();
} catch (InterruptedException e) {
  System.out.println("Exception encountered " + e.getCause());
}
    
  System.out.println(" printing in " + Thread.currentThread().getName());
 } 
    
}
