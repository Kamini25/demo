public class ParkingDemo {
    public static void main(String args[]){
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.name = "First Parking Lot";
        parkingLot.addLevel(new Level(1, 10));

        // create vehicle
        Vehicle car = new Car("12ed");
        //Vehicle bike = new Bike("b123");

        // System.out.println("BEFORE PARKING========");
        // parkingLot.displayAvailability();


        parkingLot.parkVehicle(car);
        //parkingLot.parkVehicle(bike);

        //System.out.println("AFTER PARKING========");
        //parkingLot.displayAvailability();

        parkingLot.unparkVehicle(car);


    }
}
