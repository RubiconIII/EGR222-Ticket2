/**
 * Created by curti_000 on 10/26/2016.
 */
public class StudentAdvanceTicket extends AdvanceTicket {

    //constructor
    public StudentAdvanceTicket(int number, double price, int days) {
        super(number, price, days);
        this.price *= 0.5;
    }


    //overrides toString in Ticket
    @Override
    public String toString() {
        return "Ticket Type: Student Advanced, Number " + number + ", Price: " + price;
    }
}


