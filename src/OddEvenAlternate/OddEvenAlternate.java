package OddEvenAlternate;
/*This is not using synchronized behaviour . We can try and add synchronization */
public class OddEvenAlternate {
    int i=1;
    public void printOddNumbers(){
       while(i<=10){
        if(i%2==1){
            System.out.println("odd " + i);
           i++;
        }
    }

    }
    public void printEvenNumbers(){
        while(i<=10){
        if(i%2==0){
            System.out.println("even " + i);
          i++;
        }}
    }
    
    public static void main(String[] args) throws InterruptedException {
        OddEvenAlternate od = new OddEvenAlternate();
        Thread t1 = new Thread(()->{
            od.printOddNumbers();
     });
        Thread t2 = new Thread(()->{
            od.printEvenNumbers();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
     }
}
