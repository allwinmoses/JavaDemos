import javax.sound.midi.Soundbank;

public class Booking {
    public double bookTickets(String name, int noOfTickets){
        double costPerTicket = 20;
        System.out.println("Booked for "+name);
        double totalPrice = costPerTicket*noOfTickets;
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Total "+totalPrice);
        return totalPrice;

    }
}
