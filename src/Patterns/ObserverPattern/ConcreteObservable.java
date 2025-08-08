import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable  implements Observable {
        private List<Observer> observers;
        private int state;

        public ConcreteObservable() {
            observers = new ArrayList<>();
        }

        public void setData(int state) {
            this.state = state;
            notifyObservers();
        }

        public int getState() {
            return state;
        }

        @Override
        public void addObserver(Observer observer) {
            observers.add(observer);
        }

        @Override
        public void removeObserver(Observer observer) {
            observers.remove(observer);
        }

        @Override
        public void notifyObservers() {
            System.out.println("Notifying observers" + observers.size()+ " " + observers.get(1));
            for (Observer observer : observers) {
                observer.update();
            }
        }
    }

