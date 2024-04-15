import com.api.lang.Vehicle;

public class HashDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("benz","b1","Black");
        Vehicle vehicle1 = new Vehicle("benz","b1","White");
        Vehicle vehicle3 = new Vehicle("bmw","b1","White");
        Vehicle vehicle4 = new Vehicle("benz","b1","Black");

        System.out.println(vehicle1.equals(vehicle));
        System.out.println(vehicle3.equals(vehicle));
        System.out.println(vehicle1.equals(vehicle4));
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle1.hashCode());
        System.out.println(vehicle3.hashCode());
        System.out.println(vehicle4.hashCode());


    }
}
