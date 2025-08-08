public class Main{
    public static void main(String[] args) {
        System.out.println("in main");
        Vehicle car = new Car(new AutoDriveStrategy());
        car.drive();
        car.setDs(new NormalDriveStrategy());
        car.drive();
    }
}