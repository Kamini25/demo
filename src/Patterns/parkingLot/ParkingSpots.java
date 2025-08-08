
public class ParkingSpots {
private int spotNum;
private VehicleType type;
Vehicle parkedVehicle;
public ParkingSpots(int num, VehicleType type){
    this.spotNum = num;
    this.type = type;
}
public synchronized Boolean parkVehicle(Vehicle vehicle){
    if(isAvailable()){
    parkedVehicle = vehicle;
    return true;
    }
    else{
        System.out.print("ERROR: SPOT NOT AVAILABLE");
        return false;
    }
}
public synchronized void unparkVehicle(Vehicle vehicle){
    parkedVehicle = null;
}
public synchronized Boolean isAvailable(){
    return parkedVehicle == null;
}
public int getSpotNumber(){
    return spotNum;
}
public VehicleType getVehicleType(){
    return type;
}
}
