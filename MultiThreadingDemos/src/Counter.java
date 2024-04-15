public class Counter implements  Runnable {

    Booking booking;
    String name;
    int noOftickets;

    public Counter(String name, int noOftickets, Booking booking) {
        this.name = name;
        this.noOftickets = noOftickets;
        this.booking = booking;
        Thread t = new Thread(this, name);
        t.start();
    }

    public void run() {
        synchronized (booking) {
            System.out.println("Welcome to ABC " + name);
            double amount = booking.bookTickets(name, noOftickets);
            System.out.println("Amount to be paid " + amount);
        }
    }
}
