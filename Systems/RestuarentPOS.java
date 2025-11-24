/* 
Restaurant POS — Menu and Order Total

A restaurant POS system needs to calculate order totals.

You must write functions for:

Displaying menu

Taking an order (multiple items)

Calculating item total

Applying SST (Sales Service Tax) 8%

Returning final bill

Use functions for each step.

*/

class Order{
    String name;
    
}

public class RestuarentPOS {

    public static float SST = 8f;        // In percentage

    public static String Menu[] = {
            "1. Mutton Paneer", 
            "2. Biryani",
            "3. Pulao",
            "4. Roti/Salan"
        };
    public static void main(String[] args) {

        System.out.println("Hello, World!");
    }

    public static void displayMenu() {

        for (int i = 0; i < Menu.length; i++) {
            System.out.println(Menu[i]);
        }

    }
}