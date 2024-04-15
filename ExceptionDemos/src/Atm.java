public class Atm {
    public static void main(String[] args) {
        System.out.println("in ATM");
        Bank bank = new Bank();
        try{
            bank.withdraw(2220);
            System.out.println("Amount withdraw");

        } catch (Exception e){
            System.out.println("exception..");
            System.out.println(e.getMessage());
        }
        System.out.println("GoodBye");
    }
}
