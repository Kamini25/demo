import java.util.ArrayList;
import java.util.List;

public class Level {
public int levelNum;
public List<ParkingSpots> parkingSpotsList;

public Level(int num, int numSpots){
    levelNum = num;
    this.parkingSpotsList = new ArrayList<>(numSpots);
    double bikesRatio = 0.5;
    double carRatio = 0.3;
    //double truckRatio = 0.2;
    int numBikesSpots = (int)(bikesRatio * numSpots);
    int numCarSpots = (int)(carRatio * numSpots);
    //int numtruckSpots = (int)(truckRatio * numSpots);

    for(int i =1;i<=numBikesSpots;i++){
        parkingSpotsList.add(new ParkingSpots(i, VehicleType.BIKE));
    }
    for(int i =numBikesSpots +1 ;i<=numBikesSpots+numCarSpots;i++){
        parkingSpotsList.add(new ParkingSpots(i, VehicleType.CAR));
    }
    // for(int i = numBikesSpots+numCarSpots+1;i<=numSpots;i++){
    //     parkingSpotsList.add(new ParkingSpots(i, VehicleType.TRUCK));
    // }
    System.out.println("Added spots for the level "+ levelNum);
}

public Boolean parkVehicle(Vehicle vehicle){
    for(ParkingSpots parkingSpot: parkingSpotsList){
        if(parkingSpot.isAvailable() && parkingSpot.getVehicleType() == vehicle.getType()){
            parkingSpot.parkVehicle(vehicle);
            return true;
        }
    }
    return false;

}
public Boolean unparkVehicle(Vehicle vehicle){
    for(ParkingSpots parkingSpot: parkingSpotsList){
        if(!parkingSpot.isAvailable() && parkingSpot.getVehicleType() == vehicle.getType() && parkingSpot.parkedVehicle.licenceNumber.equals(vehicle.licenceNumber)){
            parkingSpot.unparkVehicle(vehicle);
            return true;
        }
        else
        System.out.print("Vehicle not found for licenceNumber " + vehicle.licenceNumber);
    }
    return false;
}
public void displayAvailability(){
    System.out.println("Showing availability for floor " + levelNum);
        for(ParkingSpots parkingSpot : parkingSpotsList){
            if(parkingSpot.isAvailable()){
                System.out.println("Spot number " + parkingSpot.getSpotNumber() + "available for : " + parkingSpot.getVehicleType());
            }
            else{
                System.out.println("Spot number " + parkingSpot.getSpotNumber() + "reserved for : " + parkingSpot.getVehicleType());
            }
        }
}



}
