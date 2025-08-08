public class ConcreteObserver implements Observer {
    private int state;
    private Observable concreteObservable;

    public ConcreteObserver(Observable concreteObservable) {
        this.concreteObservable = concreteObservable;
        concreteObservable.addObserver(this);
    }

    @Override
    public void update() {
        state = concreteObservable.getState();
        System.out.println("State updated to: " + state);
    }
    
}
