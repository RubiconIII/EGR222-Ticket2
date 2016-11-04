/**
 * Created by curti_000 on 10/26/2016.
 */
public class WalkupTicket extends Ticket {

    //constructor
    public WalkupTicket(int number, double price) {
        super(number, price);
    }

    //overrides toString in Ticket
    @Override
    public String toString() {
        return "Ticket Type: Walk-up, Number " + number + ", Price: " + price;
    }
}
