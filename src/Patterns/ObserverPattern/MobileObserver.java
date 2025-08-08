public class MobileObserver implements Observer {
    private int state;
    private String mobileNum;
    private Observable mobileObservable;

    public MobileObserver(String num, Observable mobileObservable) {
        mobileNum = num;
        this.mobileObservable = mobileObservable;
         mobileObservable.addObserver(this);
    }

    @Override
    public void update() {
        state = mobileObservable.getState();
        System.out.println("State updated to: " + state + "  " + mobileNum);
    }
    
}
