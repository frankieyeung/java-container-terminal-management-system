import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PortManagement portManagement = new PortManagement();
        Scanner scanner = new Scanner(System.in);

        // Main menu
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

    // Terminal menu
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

    // Customer menu
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
                    portManagement.addCustomer();
                    break;
                case 2:
                    portManagement.showAllCustomers();
                    break;
                case 3:
                    portManagement.updateCustomer();
                    break;
                case 4:
                    portManagement.deleteCustomer();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Booking menu
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
                    portManagement.addBooking();
                    break;
                case 2:
                    portManagement.showAllBookings();
                    break;
                case 3:
                    portManagement.updateBooking();
                    break;
                case 4:
                    portManagement.deleteBooking();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
