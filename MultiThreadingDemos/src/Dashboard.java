public class Dashboard {
    public static void main(String[] args) {
        Booking booking = new Booking();
        Counter counter = new Counter("tom",10, booking);
        Counter counter1 = new Counter("paul",20, booking);
        Counter counter2 = new Counter("sam",40, booking);

//        counter.run();


    }
}
