import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PortManagement {
    private Map<String, Terminal> terminals;
    private Map<String, Customer> customers;
    private Map<String, Booking> bookings;
    Scanner scanner = new Scanner(System.in);

    public PortManagement() {
        terminals = new HashMap<>();
        customers = new HashMap<>();
        bookings = new HashMap<>();
    }

    // CRUD of Terminal
    public void addTerminal() {
        System.out.print("Enter terminal ID: ");
        String id = scanner.nextLine().trim();
        System.out.print("Enter terminal charge per day: ");
        int chargePerDay = Integer.parseInt(scanner.nextLine().trim());
        Terminal terminal = new Terminal(id, chargePerDay);
        terminals.put(id, terminal);
        System.out.println("Terminal added successfully.");
    }

    public void showAllTerminals() {
        for (Terminal terminal : terminals.values()) {
            System.out.println("Terminal ID: " + terminal.getId());
            System.out.println("Charge Per Day: $" + terminal.getChargePerDay());
            System.out.println("");
        }
    }

    public void updateTerminal() {
        System.out.println("Enter terminal ID: ");
        String id = scanner.nextLine().trim();
        System.out.print("Enter terminal charge per day: ");
        int chargePerDay = Integer.parseInt(scanner.nextLine().trim());
        terminals.get(id).setChargePerDay(chargePerDay);
        System.out.println("Terminal update successfully");
    }

    public void deleteTerminal() {
        System.out.println("Enter terminal ID: ");
        String id = scanner.nextLine().trim();
        terminals.remove(id);
        System.out.println("Terminal delete successfully");
    } // End of CRUD of Terminal

    // CRUD of Customer
    public void addCustomer() {
        System.out.print("Enter customer ID: ");
        String id = scanner.nextLine().trim();
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter customer type (normal or premier): ");
        String type = scanner.nextLine().trim();
        Customer customer = new Customer(id, name, type);
        customers.put(id, customer);
        System.out.println("Customer added successfully.");
    }

    public void showAllCustomers() {
        for (Customer customer : customers.values()) {
            System.out.println("Customer ID: " + customer.getId());
            System.out.println("Customer Name: " + customer.getName());
            System.out.println("Customer Type: " + customer.getType());
            System.out.println("");
        }
    }

    public void updateCustomer() {
        System.out.println("Enter customer ID: ");
        String id = scanner.nextLine().trim();
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter customer type (normal or premier): ");
        String type = scanner.nextLine().trim();
        customers.get(id).setName(name);
        customers.get(id).setType(type);
        System.out.println("Customer update successfully");
    }

    public void deleteCustomer() {
        System.out.println("Enter customer ID: ");
        String id = scanner.nextLine().trim();
        customers.remove(id);
        System.out.println("Customer delete successfully");
    } // End of CRUD of Custoemr

    // CRUD of Booking
    public void bookTerminal() {
        System.out.println("Enter booking ID: ");
        String bookingId = scanner.nextLine().trim();
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine().trim();
        Customer customer = customers.get(customerId);
        if (customer == null) {
            System.out.println("Customer not exist, Booking add failed");
            return;
        }
        System.out.print("Enter terminal ID: ");
        String terminalId = scanner.nextLine().trim();
        Terminal terminal = terminals.get(terminalId);
        if (terminal == null) {
            System.out.println("Terminal not exist, Booking add failed");
            return;
        }
        if (!terminal.isAvailable()) {
            System.out.println("Terminal is not available, Booking add failed");
            return;
        } else {
            terminal.setAvailability(false);
        }
        System.out.print("Enter days: ");
        int days = Integer.parseInt(scanner.nextLine());
        Booking booking = new Booking(bookingId, customer, terminal, days);
        bookings.put(bookingId, booking);
        System.out.println("Booking add successfully");
    }

    public void showAllBookings() {
        for (Booking booking : bookings.values()) {
            System.out.println("Booking ID: " + booking.getId());
            System.out.println("Customer ID: " + booking.getCustomer().getId());
            System.out.println("Customer Name: " + booking.getCustomer().getName());
            System.out.println("Customer Type: " + booking.getCustomer().getName());
            System.out.println("Terminal ID: " + booking.getTerminal().getId());
            System.out.println("Days: " + booking.getDays());
            System.out.println("Total Charges: " + booking.calculateTotalCharges());
            System.out.println("");
        }
    }

    public void updateBooking() {
        System.out.println("Enter booking ID: ");
        String bookingId = scanner.nextLine().trim();
        Booking booking = bookings.get(bookingId);
        if (booking == null) {
            System.out.println("Booking not exist, Booking update failed");
            return;
        }
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine().trim();
        System.out.print("Enter terminal ID: ");
        String terminalId = scanner.nextLine().trim();
        Terminal terminal = terminals.get(terminalId);
        if (terminal == null) {
            System.out.println("Terminal not exist, Booking update failed");
            return;
        }
        if (!terminal.isAvailable()) {
            System.out.println("Terminal is not available, Booking update failed");
            return;
        } else {
            terminal.setAvailability(false);
        }
        System.out.print("Enter days: ");
        int days = Integer.parseInt(scanner.nextLine());
        bookings.get(bookingId).setCustomer(customers.get(customerId));
        bookings.get(bookingId).setTerminal(terminals.get(terminalId));
        bookings.get(bookingId).setDays(days);
        System.out.println("Booking update successfully");
    }

    public void deleteBooking() {
        System.out.println("Enter booking ID: ");
        String id = scanner.nextLine().trim();
        bookings.remove(id);
        System.out.println("Booking delete successfully");
    }



}