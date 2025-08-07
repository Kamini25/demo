package RaceCondition;
//This will return different value everytime.
public class ReadModifyWrite implements Runnable {
    int count=0;
    public void run(){
     for(int i=1;i<=10000;i++){
            count++;
        }
    }
        public int getCount(){
            return count;
        }
    public static void main(String[] args) throws InterruptedException {
        ReadModifyWrite t1 = new ReadModifyWrite();
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t1);
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println("final value " + t1.getCount());
    }      
    
}
