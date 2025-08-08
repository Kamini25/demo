public class EmailObserver implements Observer {
    private String email;
    private Observable observable;
    public EmailObserver(String email, Observable observable) {
        this.email = email;
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update() {
        System.out.println("EmailObserver: " + observable.getState() + " " + email);
    }
    
}
