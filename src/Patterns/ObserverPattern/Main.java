public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Observable concreteObservable = new IPhoneObservable();
        Observer concreteObserver = new EmailObserver("abc.com", concreteObservable);
        Observer concreteObserver2 = new MobileObserver("12345", concreteObservable);
        concreteObservable.setData(6);

        Observable washinObservable = new WashingMachineObservable();
        Observer washinObserver = new EmailObserver("def.com", washinObservable);
        washinObservable.setData(2);

    
    }
}
