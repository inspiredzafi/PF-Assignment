import java.util.Scanner;

public class displayMenu {
    
    public static String[] EXERCISES = {
            "1. Declare, initialize, and print three variables.",
            "2. Print a specific message: \"C language is a powerful programing language.\"",
            "3. Swap the values of two variables (assignment method).",
            "4. Convert a variable 'year' value into months.",
            "5. Input two numbers, calculate and print their sum and product.",
            "6. Input age in years and calculate the age in months.",
            "7. Calculate Total and Average marks for 3 subjects (out of 100).",
            "8. Convert temperature from Fahrenheit (F) to Celsius (C): C = 5/9 (F - 32)",
            "9. Find the maximum value among four numbers.",
            "10. Convert 2.5 miles into kilometers (1 mile = 1.609 km).",
            "11. Calculate the average of two initialized 'int' variables.",
            "12. Calculate cylinder volume (V = pi r^2 h) using a 'const' qualifier for pi.",
            "13. Calculate circle area (A = pi r^2) using a define directive for pi.",
            "14. Convert millimeters (mm) into inches (1 inch = 25.4 mm).",
            "15. Swap the values of two variables.",
            "16. Assign value 3 to three 'int' variables using multiple assignment and calculate their product.",
            "17. Separate the integral and fractional parts of a real number (15.58971).",
            "18. Compute distance (s) using the motion formula: s = vi t + 1/2 a t^2",
            "19. Convert age in years into months and days.",
            "20. Print formatted text using escape sequences: ",
            "21. Print a descending triangle pattern (XXXXX down to X) using one print statement and '\\n'.",
            "22. Input and print student's name, age, height, and gender.",
            "23. Calculate circle area (A = pi r^2) and circumference (C = 2 pi r) from a given radius.",
            "24. Input marks for five subjects and calculate the Total and Average marks.",
            "25. Calculate triangle area using Heron's formula: Area = sqrt{s(s-a)(s-b)(s-c)}",
            "26. Convert 12000 rupees (Rs) into dollars (1 dollar = Rs. 60).",
            "27. Convert time input (hours, minutes, seconds) into total seconds.",
            "28. Calculate the quadratic discriminant: disc = b^2 - 4ac",
            "29. Conditional print: Print a message if variable 'n' is greater than 100.",
            "30. Check if a given integer is odd or even using a simple 'if' structure."
        };


public static int displayExercises() {
    Scanner scanner = new Scanner(System.in);
    int totalExercises = EXERCISES.length;
    int currentIndex = 0;
    int exercisesPerPage = 10;
    
    while (currentIndex < totalExercises) {
        // Clear console
        clearConsole();
        // scanner.nextLine();         // Clears the buffere in the second and following iterations. If not here. The program terminates with an error of Invalid choice! 
        
        System.out.println("--- Programming Exercises ---");
        
        // Calculate how many exercises to display on this page
        int endIndex = Math.min(currentIndex + exercisesPerPage, totalExercises);
        int displayedProblems = endIndex - currentIndex;
        
        // Display exercises for current page
        for (int i = currentIndex; i < endIndex; i++) {
            System.out.println(EXERCISES[i]);
        }
        
        System.out.println("\n------------------------------------------------");
        System.out.print("Enter 'n' for next page, or a number (choice) to execute: ");
        
        String input = scanner.nextLine().trim();
        
        // Check if user wants next page
        if (input.equalsIgnoreCase("n")) {
            currentIndex += exercisesPerPage;
            continue;
        }
        
        // Try to parse as number
        try {
            int choice = Integer.parseInt(input);
            
            // Check if choice is within the currently displayed range
            if (choice >= 1 && choice <= 30) {
                return choice;
                
            } else {
                // Invalid choice - move to next page
                currentIndex += exercisesPerPage;
            }
        } catch (NumberFormatException e) {
            // Invalid input - move to next page
            currentIndex += exercisesPerPage;
        }
    }
    
    System.out.println("\nEnd of exercises list.");

    return 0;
}

// Helper method to clear console
private static void clearConsole() {
    try {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    } catch (Exception e) {
        // Fallback: print multiple newlines
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}


}
