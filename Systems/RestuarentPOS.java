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

import java.util.Scanner;


class Item{
    public int prodID;
    public String name;
    public float price;

    Item(String name, float price, int id){
        prodID = id++ ;
        this.name = name;
        this.price = price;
    }

    public float getBill(int qty, float SST){
        
        float bill = price * qty;
        float totalBill = bill + bill * (SST/100) ;

        return totalBill;
    }

}



public class RestuarentPOS {
    
    static Scanner scanner = new Scanner(System.in) ;
    public static int id = 1;

    public static float SST = 8f;        // In percentage

    public static Item Items[] = {
        new Item("Mutton Paneer", 300, id),
        new Item("Biryani", 250, id),
        new Item("Pulao", 430, id),
        new Item("Roti/Salan", 300, id)
    } ;

    public static String Menu[] = {
            "1. Mutton Paneer", 
            "2. Biryani",
            "3. Pulao",
            "4. Roti/Salan"
        };

    // Main Function
    public static void main(String[] args) {
        int choice;

        do{

            System.err.println("Welcome to Developement Restuarent");

            displayMenu();
            float bill = takeOrder();        // Takes order from the user and returns the total bill including the SST.
            System.out.printf("\nThe total of your bill is %.2f (Including %%8 SST) \n", bill);


            System.out.print("Want to order something more? Press Any key to continue (0 to exit) ");
            choice = scanner.nextInt();
        }while(choice != 0);

        System.err.println("Thankyou for vising Developement Restuarent");
    }

    public static void displayMenu() {

        for (int i = 0; i < Menu.length; i++) {
            System.out.println(Menu[i]);
        }

    }

    public static float takeOrder(){

        scanner.nextLine();     // clearing the buffer

        System.out.print("Enter the name of dish: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter the quantity: ");
        int qty = scanner.nextInt();
        
        System.err.println("Your order has been placed Sir! You'll be served shortly.");
        
        Item item = getItem(name) ;     // Extracting the item 
        if(item == null){
            System.out.println("Invalid dish name!");
            return 0 ;
        }

        float bill = item.getBill(qty, SST);
        
        return bill;
    }

    public static Item getItem(String name){
        for(int i = 0; i < Items.length; i++){
            if(name.equals(Items[i].name)){

                return Items[i];
            }
        }

        return null;
    }
}