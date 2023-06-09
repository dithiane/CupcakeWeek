import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

// * Set up
public class Order {
    // Create a public constructor function named Order
    // Parameters: an ArrayList of Cupcake objects named cupcakeMenu, and an ArrayList of Drink objects named drinkMenu.
    public Order(ArrayList<Main.Cupcake> cupcakeMenu, ArrayList<Main.Drink> drinkMenu)
    {
        // Print “Hello customer. Would you like to place an order? (Y or N)”.
        System.out.println("Hello customer. Would you like to place an order? (Y or N)");
        // Create a Scanner object named input, to accept the users input.
        Scanner input = new Scanner(System.in);
        // Create a String object named placeOrder and set it equal to the user input
        String placeOrder = input.nextLine();
        //Create an Arraylist that contains Objects
        ArrayList<Object> order = new ArrayList<>();
        //Create an if statement that checks if placeOrder equals Y ignoring capitalization
        if (placeOrder.equalsIgnoreCase("Y")) {
            // Add LocalDate.now() to order.
            order.add(LocalDate.now());
            // Add LocalTime.now() to order.
            order.add(LocalTime.now());
            // Print “Here is the menu.”
            System.out.println("Here is the menu.");
            // Print “CUPCAKES:”
            System.out.println("CUPCAKES:");
            // Create an int variable named itemNumber and set it equal to 0.
            int itemNumber = 0;
            for (Main.Cupcake cupcake : cupcakeMenu) {
                // Inside the for loop, increment itemNumber by one.
                itemNumber++;
                // Print itemNumber.
                System.out.println(itemNumber + ".");
                // Output the type of cupcake at cupcakeMenu at i, by calling the type() method.
                System.out.println(cupcake.type());
                // Print 'Price: ' with the price being the price of that cupcake.
                System.out.println("Price: $" + cupcake.getPrice());
                // Print a new line.
                System.out.println();
            }
            // Print “DRINKS:”
            System.out.println("DRINKS:");
            for (Main.Drink drink : drinkMenu) {
                // Print itemNumber.
                itemNumber++;
                System.out.println(itemNumber + ".");
                // Output the type of drink at drinkMenu at i, by calling the type() method
                System.out.println(drink.type());
                // Print 'Price: ' with the price being the price of that drink.
                System.out.println("Price: $" + drink.getPrice());
                // Print a new line.
                System.out.println();
            }
            // Create a boolean variable named ordering and set it equal to true
            boolean ordering = true;

            // Create a while loop that continues as long as ordering equals true
            while (ordering)
            {
                // Print "What would you like to order? Please use the number associated with each item to order"
                System.out.println("What would you like to order? Please use the number associated with each item to order");
                // Create an int named orderChoice and set it equal to what the user inputs
                int orderChoice = input.nextInt();
                // Call input.nextLine() to correct the terminal scanner input location.
                input.nextLine();

                if ((orderChoice >= 1) && (orderChoice <= 6))
                    choiceMenu(orderChoice, order, cupcakeMenu, drinkMenu);
                // Create an else statement with no parameters
                else {
                    System.out.println("Sorry, we don't seem to have that on the menu");
                }
                //Print "Would you like to continue ordering? (Y/N)"
                System.out.println("Would you like to continue ordering? (Y/N)");
                //Create a String object named continueOrder and set it equal to the user iput
                String continueOrder = input.nextLine();
                //Create an if statement that checks if continueOrder does NOT equal Y ignoring capitalization
                if (!continueOrder.equalsIgnoreCase("Y")) {
                    // Set ordering equal to false
                    ordering = false;
                }
                // Print order
                // Print the first item in the order ArrayList - the date
                System.out.println(order.get(0));
                //Print the second item in the order ArrayList - the time
                System.out.println(order.get(1));
                // Create a double variable named subtotal and set it to 0.0;
                double subTotal = 0.0;
                // Create a for loop that starts at i = 2 and continues incrementing by 1, while, i, is less than order.size
                for (int i = 2; i < order.size(); i++)
                    subTotal = checkMenu(i, subTotal, order, cupcakeMenu,  drinkMenu);
                // Print subtotal
                System.out.println("$" + subTotal + "\n");
            }
        }
        else
        {
            System.out.println("Have a nice day then");
        }
        // Create a new CreateFile()
       new CreateFile();
        // Create a new WriteToFile() with the parameter order
        new WriteToFile(order);

    }

    // Create a class named CreateFile
    static class CreateFile {
        // Create a public constructor function
        public CreateFile() {
            // Create a try catch block, with a catch parameter of IOException e
            try {
                // Create a File object named salesData and set it equal to a new File with the parameter "salesData.txt"
                File salesData = new File("salesData.txt");
                // Create an if statement with that parameter salesData.createNewFile()
                // .createNewFile() will return true if a new file is created
                if (salesData.createNewFile()) {
                    System.out.println("File created: " + salesData.getName());
                }
                else {
                    System.out.println("File already exists");
                }
            }
            catch (IOException e) {
                System.out.println("An error occurred");
            }
        }
    }

    // Create a class named WriteToFile
    static class WriteToFile {
        // Create a public constructor function named WriteToFunction(), with ArrayList<Object> order as the parameter
        public WriteToFile(ArrayList<Object> order) {
            // Create a try catch block, with a catch parameter of IOException e
            try {
                // Create a new FileWriter object named fw, and set it equal to new FileWriter whose constructor
                // parameters are the name of the object "salesData.txt", and the boolean true, which is an option that
                // allows for appending to the file
                FileWriter fw = new FileWriter("salesData.txt", true);
                // Create a new PrintWriter object named salesWriter, and set it equal to new PrintWriter object whose
                // constructor parameter is the FileWriter object fw created previously.
                PrintWriter salesWriter = new PrintWriter(fw);
                // Print each value in order.
                for (Object o : order) {
                    salesWriter.println(o);
                }
                // Stop the writer from continuing to run
                salesWriter.close();
                System.out.println("Successfully wrote to the file");
            }
            catch (IOException e) {
                System.out.println("An error occurred");
            }
        }
    }


    public Double checkMenu(int i, Double subTotal, ArrayList<Object> order, ArrayList<Main.Cupcake> cupcakeMenu, ArrayList<Main.Drink> drinkMenu ){
        for (Main.Cupcake capcake : cupcakeMenu) {
            // Check if order at, i, is equal to cupcakeMenu at j
            if (order.get(i).equals(capcake)) {
                // Print the type of cupcake at cupcakeMenu index j
                capcake.type();
                subTotal +=  capcake.getPrice();
            }
        }
        for (Main.Drink drink : drinkMenu) {
            // Check if order at, i, is equal to drinkMenu at j
            if (order.get(i).equals(drink)) {
                // Print the type of cupcake at drinkMenu index j
                drink.type();
                subTotal +=  drink.getPrice();
            }
        }
        return subTotal;
    }

    public void choiceMenu(int choice, ArrayList<Object> order, ArrayList<Main.Cupcake> cupcakeMenu, ArrayList<Main.Drink> drinkMenu) {
        // Add the first item from the cupcakeMenu/drinkMenu array to the order array
        if (choice < 4) order.add(cupcakeMenu.get(choice - 1));
        else order.add(drinkMenu.get(choice - 4));
        // If so, add the first item from the cupcakeMenu/drinkMenu ArrayList to the order ArrayList and print “Item added to order”.
        System.out.println("Item added to order");
    }

}
