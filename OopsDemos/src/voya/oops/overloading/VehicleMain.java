package voya.oops.overloading;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.getDetails();

        Vehicle vehicle1 = new Vehicle("Yamaha");
        vehicle.getDetails();

        Vehicle vehicle2=new Vehicle("cp88", "yamaha");
        vehicle.getDetails();

        Vehicle vehicle3=new Vehicle("yamaha",10000, "cp88");
        vehicle.getDetails();

        vehicle.print();

    }
}
