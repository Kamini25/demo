//import java.io.*;
class ParkingMain{
    public static void main(String args[]){

        ParkingLot pl = new ParkingLot();
        pl.createParkingLot("RESERVED");
        System.out.println("parkingLot type " + pl.plType);
    }
}