public  class Vehicle implements DriveStrategy {
    DriveStrategy ds;
    public Vehicle(DriveStrategy ds) {
        this.ds = ds;
    }
    public Vehicle() {}
    public void drive() {
        ds.drive();
    }
    public void setDs(DriveStrategy ds) {
        this.ds = ds;
    }

}
