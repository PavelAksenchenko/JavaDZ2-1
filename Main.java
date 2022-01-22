public class Main {
    public static void main(String[] args) {
        int ticketPrice = 200;
        int priceBonusMile = 20;
        int freeMile;

        freeMile = (ticketPrice / priceBonusMile);

        System.out.println("Вам начисленно" + " " + freeMile + " " + "бонусных миль");

    }
}