public class Booking {
    private String id;
    private Customer customer;
    private Terminal terminal;
    private int days;


    public Booking(String id, Customer customer, Terminal terminal, int days) {
        this.id = id;
        this.customer = customer;
        this.terminal = terminal;
        this.days = days;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Terminal getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        if (days > 0) {
            this.days = days;
        } else {
            System.out.println("Booking days must be greater than 0");
        }
    }

    public double calculateTotalCharges() {
        if (customer.getType().equals("premier")) {
            return terminal.getChargePerDay() * days * 0.9;
        } else {
            return terminal.getChargePerDay() * days;
        }
    }
}