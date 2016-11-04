/**
 * Created by curti_000 on 10/26/2016.
 */
public class AdvanceTicket extends Ticket {

    //constructor
    public AdvanceTicket(int number, double price, int days) {
        super(number, price);
        setPrice(days);
    }

    //sets price
    private void setPrice(int days){
        if (days >= 10) {
            price = price - (price * 0.4);

        } else {
            price = price - (price * 0.2);
        }
    }

    //overrides toString in Ticket
    @Override
    public String toString() {
        return "Ticket Type: Advanced, Number " + number + ", Price: " + price;
    }
}

