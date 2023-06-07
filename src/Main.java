
    // * 1. Set Up

    import java.util.ArrayList;
    import java.util.Scanner;

    public class Main {
    // In public class Main, create a public static void main(String[] args) function.
    public static void main(String[] args) {

        // * 4. Object Declaration

        // Create a new ArrayList which contains Cupcake and call it cupcakeMenu
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<>();
        // Create a new Cupcake object named cupcake
        // Create a new ArrayList which contains Drink and call it drinkMenu
        ArrayList<Drink> drinkMenu = new ArrayList<>();
        Cupcake cupcake = new Cupcake();
        // Create a new RedVelvet object named redVelvet
        RedVelvet redVelvet = new RedVelvet();
        // Create a new Chocolate object named chocolate
        Chocolate chocolate = new Chocolate();
        // Create a new Drink object named water
        Drink water = new Drink();
        // Create a new Soda object named soda
        Soda soda = new Soda();
        // Create a new Milk object named milk
        Milk milk = new Milk();

        // * 5. Pricing

        // ? Cupcake Menu

        // Print "We are in the middle of creating the cupcake menu. We currently have three cupcakes on
        // the menu, but we need to decide on pricing"
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on" +
                "\nthe menu but we need to decide on pricing");
        // Create a Scanner object named input, so we can accept the users input
        Scanner input = new Scanner(System.in);
        // Print "We are deciding on the price for our standard cupcake. Here is the description:"
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description: ");
        // Call the type() method on the cupcake object to get the description of the standard cupcake
        cupcake.type();
        // Print "How much would you like to charge for the cupcake?
        // (Input a numerical number taken to 2 decimal places)"
        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        // Create a String variable named priceText and assign it the value of input.nextLine()
        // We are accepting the price as a String named priceText so we can convert it into a double later, just for practice
        String priceText = input.nextLine();
        // Create a double variable named price and set it equal to Double.parseDouble(priceText)
        double price = Double.parseDouble(priceText);
        // Now that we have the price, we can call the setPrice() method with the parameter of price on the cupcake object
        cupcake.setPrice(price);
        // Print "We are deciding on the price for our red velvet cupcake. Here is the description:"
        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description: ");
        // Call the type() method on the redVelvet object to get the description of the red velvet cupcake
        redVelvet.type();
        // Print "How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)"
        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        // Set the String variable named priceText equal to input.nextLine()
        // We are accepting the price as a String named priceText so we can convert it into a double later, just for practice
        priceText = input.nextLine();
        // Set the double variable named price equal to Double.parseDouble(priceText)
        price = Double.parseDouble(priceText);
        // Now that we have the price, we can call the setPrice() method with the parameter of price on the redVelvet object
        redVelvet.setPrice(price);
        // Print "We are deciding on the price for our chocolate cupcake. Here is the description:"
        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description: ");
        // Call the type() method on the chocolate object to get the description of the chocolate cupcake
        chocolate.type();
        // Print "How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)"
        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        // Set the String variable named priceText equal to input.nextLine()
        // We are accepting the price as a String named priceText so we can convert it into a double later, just for practice
        priceText = input.nextLine();
        // Set the double variable named price equal to Double.parseDouble(priceText)
        price = Double.parseDouble(priceText);
        // Now that we have the price, we can call the setPrice() method with the parameter of price on the chocolate object
        chocolate.setPrice(price);
        // Add cupcake to cupcakeMenu
        cupcakeMenu.add(cupcake);
        // Add redVelvet to cupcakeMenu
        cupcakeMenu.add(redVelvet);
        // Add chocolate to cupcakeMenu
        cupcakeMenu.add(chocolate);
        // Print cupcakeMenu
        for (Cupcake menu : cupcakeMenu) {
            menu.type();
            System.out.println(menu.getPrice());
        }

        // ? Drink Menu

        // Print "We are in the middle of creating the drink menu. We currently have three types of drinks on
        // the menu, but we need to decide on pricing"
        System.out.println("We are in the middle of creating the drink menu. We currently have three types of drinks on" +
                "\nthe menu but we need to decide on pricing");
        // Print "We are deciding on the price for our bottled water. Here is the description:"
        System.out.println("We are deciding on the price for our bottled water. Here is the description: ");
        // Call the type() method on the water object to get the description
        water.type();
        // Print "How much would you like to charge for the water bottle?
        // (Input a numerical number taken to 2 decimal places)"
        System.out.println("How much would you like to charge for the water bottle?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        // Set the String variable named priceText equal to input.nextLine()
        // We are accepting the price as a String named priceText, so we can convert it into a double later, just for practice
        priceText = input.nextLine();
        // Set the double variable named price equal to Double.parseDouble(priceText)
        price = Double.parseDouble(priceText);
        // Now that we have the price, we can call the setPrice() method with the parameter of price on the water object
        water.setPrice(price);
        // Print "We are deciding on the price for our bottle of soda. Here is the description:"
        System.out.println("We are deciding on the price for our bottle of soda. Here is the description: ");
        // Call the type() method on the soda object to get the description
        soda.type();
        // Print "How much would you like to charge for the bottled soda?
        // (Input a numerical number taken to 2 decimal places)"
        System.out.println("How much would you like to charge for the bottled soda?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        // Set the String variable named priceText equal to input.nextLine()
        // We are accepting the price as a String named priceText so we can convert it into a double later, just for practice
        priceText = input.nextLine();
        // Set the double variable named price equal to Double.parseDouble(priceText)
        price = Double.parseDouble(priceText);
        // Now that we have the price, we can call the setPrice() method with the parameter of price on the soda object
        soda.setPrice(price);
        // Print "We are deciding on the price for our bottle of milk. Here is the description:"
        System.out.println("We are deciding on the price for our bottle of milk. Here is the description: ");
        // Call the type() method on the milk object to get the description
        milk.type();
        // Print "How much would you like to charge for the bottled milk?
        // (Input a numerical number taken to 2 decimal places)"
        System.out.println("How much would you like to charge for the bottled milk?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        // Set the String variable named priceText equal to input.nextLine()
        // We are accepting the price as a String named priceText so we can convert it into a double later, just for practice
        priceText = input.nextLine();
        // Set the double variable named price equal to Double.parseDouble(priceText)
        price = Double.parseDouble(priceText);
        // Now that we have the price, we can call the setPrice() method with the parameter of price on the milk object
        milk.setPrice(price);
        // add water to drinkMenu
        drinkMenu.add(water);
        // add soda to drinkMenu
        drinkMenu.add(soda);
        // add milk to drinkMenu
        drinkMenu.add(milk);

        // Print cupcakeMenu
        for (Drink menu : drinkMenu) {
            menu.type();
            System.out.println(menu.getPrice());
        }

    }

    // * 2. Generic Cupcake

    // Create a new class named Cupcake. This will be the class all other cupcakes inherit from.
    static class Cupcake {
        // Create a public double variable named price, but do not assign it a value.
        public double price;
        // Create a public function named getPrice that has no parameters and returns the price.
        public double getPrice() {
            return price;
        }
        // Create a public function named setPrice that takes in one parameter, a double named price, and returns void.
        // In the setPrice function, assign this.price the value of the parameter price.
        public void setPrice(double price) {
            this.price = price;
        }
        // Create a public function named type that prints “A basic, generic cupcake, with vanilla frosting” and returns void.
        public void type() {
            System.out.println("A basic, generic cupcake, with vanilla frosting");
        }
    }

    // * 3. Cupcake Variants

    // Create a new class named RedVelvet that inherits from the Cupcake class you created
    static class RedVelvet extends Cupcake {
        public void type() {
            System.out.println("A red velvet cupcake, with cream cheese frosting");
        }
    }

    // Create a new class named Chocolate that extends from Cupcake
    static class Chocolate extends Cupcake
    {
        // Create a public function named type that returns void and prints a description of the cupcake
        public void type()
        {
            System.out.println("A chocolate based cupcake, with chocolate frosting");
        }
    }
    // Create a new class named Drink. This will be the class all other drinks inherit from.
    static class Drink {
        // Create a public double variable named price, but do not assign it a value
        public double price;

        // Create a public function named getPrice that has no parameters and returns the price
        public double getPrice() {
            return price;
        }

        // Create a public function named setPrice that has one parameter, a double named price, and returns void
        public void setPrice(double price) {
            this.price = price;
        }

        // Create a public function named type that prints a description and returns void
        public void type()
        {
            System.out.println("A bottle of water");
        }
    }
    // Create a new class named Soda that extends from Drink
    static class Soda extends Drink {
        // Create a public function named type that prints a description and returns void
        public void type() {
            System.out.println("A bottle of soda");
        }
    }
    //Create a new class named Milk that extends from Drink
    static class Milk extends Drink
    {
        // Create a public function named type that prints a description and returns void
        public void type()
        {
            System.out.println("A bottle of milk");
        }
    }

}