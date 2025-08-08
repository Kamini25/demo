public abstract class Vehicle{
String licenceNumber;
VehicleType type;
int baseCharge;
public Vehicle(String licenseNumber,  VehicleType type, int baseCharge){
    this.licenceNumber = licenseNumber;
    this.type = type;
    this.baseCharge = baseCharge;
}
public VehicleType getType(){
    return type;
}
public int getBaseCharge(){
    return baseCharge;
}
}