import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PortManagement portManagement = new PortManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Terminal");
            System.out.println("2. Customer");
            System.out.println("3. Booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int mainChoice = scanner.nextInt();

            switch (mainChoice) {
                case 1:
                    terminalMenu(portManagement, scanner);
                    break;
                case 2:
                    customerMenu(portManagement, scanner);
                    break;
                case 3:
                    bookingMenu(portManagement, scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void terminalMenu(PortManagement portManagement, Scanner scanner) {
        while (true) {
            System.out.println("\nTerminal Menu:");
            System.out.println("1. Add Terminal");
            System.out.println("2. Show All Terminals");
            System.out.println("3. Update Terminal");
            System.out.println("4. Delete Terminal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int terminalChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (terminalChoice) {
                case 1:
                    portManagement.addTerminal();
                    break;
                case 2:
                    portManagement.showAllTerminals();
                    break;
                case 3:
                    portManagement.updateTerminal();
                    break;
                case 4:
                    portManagement.deleteTerminal();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void customerMenu(PortManagement portManagement, Scanner scanner) {
        while (true) {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. Show All Customers");
            System.out.println("3. Update Customer");
            System.out.println("4. Delete Customer");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int customerChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (customerChoice) {
                case 1:
                    // Add customer
                    break;
                case 2:
                    // Show all customers
                    break;
                case 3:
                    // Update customer
                    break;
                case 4:
                    // Delete customer
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void bookingMenu(PortManagement portManagement, Scanner scanner) {
        while (true) {
            System.out.println("\nBooking Menu:");
            System.out.println("1. Add Booking");
            System.out.println("2. Show All Bookings");
            System.out.println("3. Update Booking");
            System.out.println("4. Delete Booking");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int bookingChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (bookingChoice) {
                case 1:
                    // Add booking
                    break;
                case 2:
                    // Show all bookings
                    break;
                case 3:
                    // Update booking
                    break;
                case 4:
                    // Delete booking
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}


//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Main {
//    private static final Scanner scanner = new Scanner(System.in);
//    private static final PortManagement portManagement = new PortManagement();
//    private static final Map<String, Customer> customers = new HashMap<>();
//
//    public static void main(String[] args) {
//        boolean exit = false;
//        while (!exit) {
//            printMenu();
//            String input = scanner.nextLine().trim();
//            switch (input) {
//                case "1":
//                    addTerminal();
//                    break;
//                case "2":
//                    showTerminal();
//                    break;
//                case "3":
//                    updateTerminal();
//                    break;
//                case "4":
//                    deleteTerminal();
//                    break;
//
//                case "5":
//                    exit = true;
//                    break;
//                default:
//                    System.out.println("Invalid option. Please try again.");
//            }
//        }
//    }
//
//    private static void printMenu() {
//        System.out.println("\nPort Terminal Management System");
//        System.out.println("1. Add Terminal");
//        System.out.println("2. Add Customer");
//        System.out.println("3. Book Terminal");
//        System.out.println("4. Release Terminal");
//        System.out.println("5. View Bookings");
//        System.out.println("6. Exit");
//        System.out.print("Enter your choice: ");
//    }
//
//    private static void addTerminal() {
//        System.out.print("Enter terminal ID: ");
//        String id = scanner.nextLine().trim();
//        System.out.print("Enter terminal charge per day: ");
//        int chargePerDay = Integer.parseInt(scanner.nextLine().trim());
//        Terminal terminal = new Terminal(id, chargePerDay);
//        portManagement.addTerminal(terminal);
//        System.out.println("Terminal added successfully.");
//    }
//
//
//
//
//
//
//
//
//
//
//
//    private static void addCustomer() {
//        System.out.print("Enter customer ID: ");
//        String id = scanner.nextLine().trim();
//        System.out.print("Enter customer name: ");
//        String name = scanner.nextLine().trim();
//        Customer customer = new Customer(id, name);
//        customers.put(id, customer);
//        System.out.println("Customer added successfully.");
//    }
//





//    private static void bookTerminal() {
//        System.out.print("Enter customer ID: ");
//        String customerId = scanner.nextLine().trim();
//        Customer customer = customers.get(customerId);
//        if (customer == null) {
//            System.out.println("Customer not found.");
//            return;
//        }
//
//        System.out.print("Enter terminal ID: ");
//        String terminalId = scanner.nextLine().trim();
//        System.out.print("Enter number of days: ");
//        int days = Integer.parseInt(scanner.nextLine().trim());
//
//        if (portManagement.bookTerminal(customer, terminalId, days)) {
//            System.out.println("Terminal booked successfully.");
//        } else {
//            System.out.println("Terminal booking failed. Terminal not available.");
//        }
//    }
//
//    private static void releaseTerminal() {
//        System.out.print("Enter terminal ID: ");
//        String terminalId = scanner.nextLine().trim();
//        if (portManagement.releaseTerminal(terminalId)) {
//            System.out.println("Terminal released successfully.");
//        } else {
//            System.out.println("Terminal release failed. Terminal not found or not booked.");
//        }
//    }
//
//    private static void viewBookings() {
//        System.out.println("\nActive Bookings:");
//        for (String terminalId : portManagement.getActiveBookings().keySet()) {
//            Booking booking = portManagement.getActiveBooking(terminalId);
//            System.out.println("Booking ID: " + booking.getId() +
//                    "\nCustomer ID: " + booking.getCustomer().getId() +
//                    "\nCustomer Name: " + booking.getCustomer().getName() +
//                    "\nTerminal ID: " + booking.getTerminal().getId() +
//                    "\nDays: " + booking.getDays() +
//                    "\nTotal Charges: " + booking.calculateTotalCharges() + "\n");
//        }
//    }


