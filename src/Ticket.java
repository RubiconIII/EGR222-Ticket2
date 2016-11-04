/**
 * Created by curti_000 on 10/26/2016.
 */
public abstract class Ticket{
    protected int number;
    protected double price;

    //default constructor
    public Ticket(int number) {
        this.number = number;
        this.price = 50;
    }

    //second constructor
    public Ticket(int number, double price) {
        this.number = number;
        this.price = price;
    }

    //default getPrice()
    public double getPrice() {
       return price;
    }

    //default toString()
    public abstract String toString();
}

