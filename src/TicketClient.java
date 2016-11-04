/**
 * Created by curti_000 on 10/26/2016.
 */
public class TicketClient {
    public static void main(String[] args){
        double originalPrice = 50;

        Ticket walkupTicket = new WalkupTicket(4,originalPrice);
        System.out.println(walkupTicket);

        Ticket adTicket = new AdvanceTicket(20, originalPrice, 29);
        Ticket adTicket2 = new AdvanceTicket(21, originalPrice, 5);
        System.out.println(adTicket);
        System.out.println(adTicket2);

        Ticket studentTicket = new StudentAdvanceTicket(8, originalPrice, 4);
        Ticket studentTicket2 = new StudentAdvanceTicket(9, originalPrice, 11);
        System.out.println(studentTicket);
        System.out.println(studentTicket2);
    }
}
