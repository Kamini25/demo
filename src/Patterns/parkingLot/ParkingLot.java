import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    public  String name;
    private static ParkingLot instance;
    private List<Level> levels;
    public static synchronized ParkingLot getInstance(){
        if(instance == null){
            instance = new ParkingLot();
        }
        return instance;
    }
    private ParkingLot(){
        levels = new ArrayList<>();
    }
    public void addLevel(Level  level){
        
        System.out.println("Adding level for parking Lot:::: " + instance.name );
        levels.add(level);
    }
    public Boolean parkVehicle(Vehicle vehicle){
        for(Level level: levels){
            if(level.parkVehicle(vehicle)){
                return true;
            }
        }
        return false;
    }
    public Boolean unparkVehicle(Vehicle vehicle){
        for(Level level: levels){
            if(level.unparkVehicle(vehicle)){
                //int charge = vehicle.getBaseCharge();
                System.out.println("charge for vehicle " + vehicle.licenceNumber + "== " + vehicle.getBaseCharge());
                return true;
            }
        }
        return false;
    }
    public void displayAvailability(){
        for(Level level: levels){
            level.displayAvailability();
        }
    }



}
