package jamil.customer;

import java.util.Scanner;
public class CustomerApp {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        String display = "y";
        System.out.println("Welcome to the Customer Viewer");
        System.out.println();
        int id = 0;

        while (display.equals("y")){
            System.out.println();
            System.out.println("Enter a Customer Number: ");
            Scanner scanner = new Scanner(System.in);
            String number = scanner.nextLine();
            id = Integer.parseInt(number);
            CustomerDB db = new CustomerDB();
            Customer n = db.getCustomer(id);

            if (n == null)
            {
                System.out.println();
                System.out.println("There is no customer number "+ id
                        + " in our records.");
                System.out.println();
            }

            else {
                System.out.println();
                System.out.println(n.getNameAndAddress());
                System.out.println();
            }

            System.out.println("Display another customer (y/n):");
            display = scanner.next();
            display = display.trim();
        }

    }

}
