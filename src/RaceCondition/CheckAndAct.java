package RaceCondition;

public class CheckAndAct implements Runnable {
    int amount=200;
    public void run(){
    if(amount>=200){//check condition
        System.out.println("balance available");
        amount-=50;//act
        System.out.println("value becomes " + amount);
     }
}

public static void main(String[] args) {
    CheckAndAct ca = new CheckAndAct();
    Thread t1 = new Thread(ca);
    Thread t2 = new Thread(ca);
    t1.start();
    t2.start();
}
    
}
