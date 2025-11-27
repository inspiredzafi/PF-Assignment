import java.util.Scanner;
import java.lang.reflect.Method;

public class Programs {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String arg[]) {

        int choice = displayMenu.displayExercises();

        // Configuration for calling methods dynamically.   // Reflection😁
        String methodName = "problem" + choice;
        try {

            Method method = Programs.class.getMethod(methodName); // This line needs to be handled properly. Warna error day rhi.

            method.invoke(null);      // Sai Boss wali feeling arhi.
        } catch (Exception e) {

            System.out.println("Error agya bhai, dubara enter kr choice!");
        }

        System.out.println("Invalid Choice!");
    }

    /*
     * 1. Write a program to assigned values to three variables at the time of
     * declaration. Print the assigned values on the computer screen.
     */
    public static void problem1() {

        int a = 3;
        int b = 4;
        int c = 7;

        System.out.printf("%d, %d, %d", a, b, c);

    }

    /*
     * 2. Write a program to print a message
     * "C language is a powerful programing language." on screen.
     */
    public static void problem2() {

        System.out.println("Java is the best programming language. ");
    }

    /*
     * 3. Write a program to assign two varibles by assignment statement.
     * Interchange the values and print the result on the screen.
     */
    public static void problem3() {

        // Assigning value to 2 variables
        int a = 3;
        int b = 4;

        // Interchanging the values of a and b.
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("The value of a is " + a + " and the value of b is " + b);
    }

    /*
     * 4. Write a program to assign the numeric value to a variable year. Calculate
     * the number of months, and print on the screen.
     */
    public static void problem4() {

        // Assigning numeric value to variable year
        int year = 18;

        // Calculating the number of months

        int months = year * 12;

        System.out.println("The number of months in " + year + " years are " + months);
    }

    /*
     * 5. Write a program to get two numbers. Calculate the sum and product of the
     * numbers and then print the result on the screen.
     */
    public static void problem5() {

        // Getting two values from the user.
        int a, b;

        System.out.println("Enter the value for a: ");
        a = scanner.nextInt();

        System.out.println("Enter the value for a: ");
        b = scanner.nextInt();

        // Calculating the sum and product of a and b
        int sum = a + b;
        int product = a * b;

        // Printing the sum to the console.

        System.out.println("The sum of " + a + " and " + b + " is " + sum + ".");
        System.out.println("The Product of " + a + " and " + b + " is " + product + ".");

    }

    /*
     * 6. Write a program to get age (in years) of a person. Calculate the age in
     * months and print the age in months.
     */

    public static void problem6() {

        int age; // In years.

        // Getting age from the user.
        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        // Calculating the age in months

        int months = age * 12;

        // Printing the age in months

        System.out.println("Your age in months is " + months);

    }

    /*
     * 7. Write a program to get the Roll No. of a student and marks obtained in
     * three subject Programming Fundamentals, Introduction to Computing and
     * Computer Graphics. Calculate the Total and Average. Each subject has a
     * maximum of 100 marks.
     */

    public static void problem7() {

        // Variables to be used in this problem.
        int rollNO;
        int PF;
        int ICT;
        int CG;

        // Getting inputs from user.
        System.out.println("Enter your Roll NO: ");
        rollNO = scanner.nextInt();

        System.out.println("Enter your marks in PF: ");
        PF = scanner.nextInt();

        System.out.println("Enter your marks in ICT: ");
        ICT = scanner.nextInt();

        System.out.println("Enter your marks in CG: ");
        CG = scanner.nextInt();

        // Calculating Total and Average of marks.
        int Total = PF + ICT + CG;
        float Average = Total / (float) 3;

        // Printing the total and average to the console.
        System.out.println("You bear Roll. No : " + rollNO);
        System.out.println("The Total of the marks is " + Total);
        System.out.println("The Average of the marks is " + Average);

    }

    /*
     * 8. Write a program to get temperature in Fahrenheit. Convert the temperature
     * to Celsius degrees by using the formula.
     * C = 5/9(f - 32)
     * 
     */

    public static void problem8() {

        // Variables to be used in this problem.
        float tempF;
        float tempC;

        // Getting temperature in Fahrenheit from user.
        System.out.println("Enter your Roll NO: ");
        tempF = scanner.nextFloat();

        // Calculating temperature in Celcius.

        tempC = (5 / (float) 9) * (tempF - 32);

        // Printing the temperature in Celcius.
        System.out.println("Temperature in Degree Centigrade is: " + tempC);

    }

    /*
     * 9. Write a program to find the maximum number from four numbers.
     */

    public static void problem9() {

        // Variables to be used in this problem.
        int a, b, c, d;
        int max;

        // Getting inputs from user.
        System.out.println("Enter value for a: ");
        a = scanner.nextInt();

        System.out.println("Enter value for b: ");
        b = scanner.nextInt();

        System.out.println("Enter value for c: ");
        c = scanner.nextInt();

        System.out.println("Enter value for d: ");
        d = scanner.nextInt();

        // Logic to find the MAX number of all four.
        max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;

        // Printing the largest number on the screen.

        System.out.println("The largest number of " + a + ", " + b + ", " + c + ", and " + d + " is " + max);

    }

    /*
     * 10. Wirte a program to convert 2.5 miles into kilometers and print the result
     * on screen. (Hint: 1 mile = 1.609 kilometers)
     */

    public static void problem10() {

        float miles = 2.5f;

        float km = miles * 1.609f;

        // Printing the distance in kilometers on the screen.

        System.out.println("2.5 miles is " + km + " in Kilometers");

    }

    /*
     * 11. Write a program to declare and initialize two variables of "int" type.
     * Calculate the average of these values and print the result on screen
     */

    public static void problem11() {

        int a = 8;
        int b = 2;

        float avg = (a + b) / 2f; // This "f" flag tell the compiler that this 2 is of type "float".

        // Printing the Average of 2 numbers on the screen.

        System.out.println("The Average of " + a + " and " + b + " is " + avg);

    }

    /*
     * 12. Write a program to find the volume of a cylinder using the 'const'
     * qualifier.
     * Formula:
     * Volume = πR2 x H ;
     */

    public static void problem12() {

        final float PI = 3.1415f;

        // Variables
        float R; // Radius of the cylinder
        float H; // Height of the cylinder

        float Volume;

        // Taking the Radius and Height of the cylinder from the user.

        System.out.println("Enter the radius of the cylinder: ");
        R = scanner.nextFloat();

        System.out.println("Enter the radius of the cylinder: ");
        H = scanner.nextFloat();

        // Calculating the Volume
        Volume = PI * R * R * H;

        // Printing the Volume of the cylinder.

        System.out.println("The Volume of the cylinder is " + Volume);

    }

    /*
     * 13. Write a program to Calculate the Area of circle using 'const' qualifier
     * for PI.
     * Area of Circle :
     * Area = πR^2
     */

    public static void problem13() {

        final float PI = 3.1415f;

        // Variables
        float R; // Radius of the Circle

        float Area;

        // Taking the Radius of the circle from the user.

        System.out.println("Enter the radius of the Circle: ");
        R = scanner.nextFloat();

        // Calculating the Area of the circle

        Area = PI * R * R;

        // Printing the Volume of the Circle.

        System.out.println("The Area of the Circle is " + Area);

    }

    /*
     * 14. Write a program to convert millimeters into inches and print the result
     * on screen. (Hint: 1 inch = 25.4 mm)
     */

    public static void problem14() {

        // Variables
        float mm;
        float inches;

        // Taking the length in milimeters from the user.

        System.out.println("Enter the length in milimeters: ");
        mm = scanner.nextFloat();

        // Length in Inches

        inches = mm / 25.4f;

        // Printing the length in Inches.

        System.out.println(mm + " milimeters in inches are " + inches);

    }

    /*
     * 15. Write a program to interchange values of two variables.
     */

    public static void problem15() {

        // Variables
        int a;
        int b;

        // Getting value for a and b from the user.

        System.out.println("Enter the value for a: ");
        a = scanner.nextInt();

        System.out.println("Enter the value for b: ");
        b = scanner.nextInt();

        // Interchanging the values

        a = a + b;
        b = a - b;
        a = a - b;

        // Printing the length in Inches.

        System.out.println("The Value of a: " + a);
        System.out.println("The Value of b: " + b);

    }

    /*
     * 16. Write a program to assign a value 3 to "int" type variables a, b and c
     * using multiple assignment statement. Calculate the product of these numbers.
     */

    public static void problem16() {

        // Variables
        int a = 3;
        int b = 3;
        int c = 3;

        int prod = a * b * c;

        System.out.println("Product of three numbers is " + prod);

    }

    /*
     * 17. Write a program to separate the integral and fractional parts of a
     * 15.58971 real number and print the result on screen.
     */

    public static void problem17() {

        // Variables
        float number = 15.58971f; // This 'f' flag at the end of the decimal integer indicates the value is of
                                  // type float.

        int integral = (int) number; // This would contain the whole part of the number. i.e. 15

        float decimal = number - integral; // This would seperate the decimal i.e. 0.58971

        System.out.println("The whole part of " + number + "is" + integral + " and the decimal part is " + decimal);

    }

    /*
     * 18. Write a program to assign values to variables 'vi' and 't' and comput the
     * value of 's' by using this foumula:
     * s = vi * t * 1/2* a *(t^2)
     */

    public static void problem18() {

        // Variables
        float vi, t;
        float S;
        float a = 2f; // We're not asked to get this.

        // Get 'vi' and 't' from the user.
        System.out.println("Enter the 'vi' : ");
        vi = scanner.nextInt();

        System.out.println("Enter the 't' : ");
        t = scanner.nextInt();

        // Calculating Distance 'S'
        S = vi * t * (1 / 2f) * a * (t * t);

        System.out.println("The covered Distance 'S' is " + S);

    }

    /*
     * 19. Write a program to to assign your age in a variable and find the age in
     * months and days.
     */

    public static void problem19() {

        // Assigning numeric value to variable year
        int year = 20;

        // Calculating the age in months

        int months = year * 12;

        // Calculating the age in days
        int days = months * 30;

        System.out.println("Your age in Months is" + months);
        System.out.println("Your age in Days is" + days);
    }

    /*
     * 20. Write a program to print the output as given under by using escape
     * sequence.
     * C:\Windows>
     * 'P' 'A' 'K'
     * "Pakistan"
     */

    public static void problem20() {

        System.out.println("C:\\Windows>\n\'P\'\t\'A\'\t\'K\'\n\"Pakistan\" ");

    }

    /*
     * 21. Write a program to print the output as shown below using '\n' escape
     * sequence (without using loop and use one printf statement)
     * XXXXX
     * XXXX
     * XXX
     * XX
     * X
     */

    public static void problem21() {

        System.out.println("XXXXX\nXXXX\nXXX\nXX\nX");

    }

    /*
     * 22. Write a program to input the name, age, height and gender of the student
     * and prints the data of student on screen.
     */

    public static void problem22() {

        // Variables
        String name;
        int age;
        float height;
        char gender;

        String temp; // For gender

        // Getting data from user
        System.out.println("What's your name?");
        name = scanner.nextLine();

        System.out.println("How old are you?");
        age = scanner.nextInt();

        System.out.println("How tall you are?");
        height = scanner.nextFloat();

        System.out.println("What is your gender? (M or F)");
        temp = scanner.next();

        gender = temp.charAt(0);

        // Logging the Data to the console.

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Gender: " + gender);

    }

    /*
     * 23. Write a program to input the radius of a circle and calculate area &
     * circumstance of the circle.
     * Formula for Area of a circle = πR2
     * Formula for Circumference of a circle = 2πR
     */

    public static void problem23() {

        final float PI = 3.1415f;

        // Variables
        float R; // Radius of the Circle
        float Circum;
        float Area;

        // Taking the Radius of the circle from the user.

        System.out.println("Enter the radius of the Circle: ");
        R = scanner.nextFloat();

        // Calculating the Area and Circumference of the circle

        Area = PI * R * R;
        Circum = 2 * PI * R;

        // Printing the Volume of the Circle.

        System.out.println("The Area of the Circle is " + Area);
        System.out.println("The Circumference of the Circle is " + Circum);

    }

    /*
     * 24. Write a program to input marks of five subjects of a student. Calculate
     * the Total and Average marks. (Each subject has weight of 100 marks).
     */

    public static void problem24() {

        // Variables
        int marks1;
        int marks2;
        int marks3;
        int marks4;
        int marks5;

        float obtMarks;
        int Total = 5 * 100; // Since each subject has a weight of 100 marks.

        float Average;

        // Taking marks of the subjects
        System.out.println("Enter the marks of 1st subject: ");
        marks1 = scanner.nextInt();

        System.out.println("Enter the marks of 2nd subject: ");
        marks2 = scanner.nextInt();

        System.out.println("Enter the marks of 3rd subject: ");
        marks3 = scanner.nextInt();

        System.out.println("Enter the marks of 4th subject: ");
        marks4 = scanner.nextInt();

        System.out.println("Enter the marks of 5th subject: ");
        marks5 = scanner.nextInt();

        // Computations.

        obtMarks = marks1 + marks2 + marks3 + marks4 + marks5;
        Average = ((float) obtMarks / Total) * 100;

        System.out.println("The Total of the obtained marks is " + obtMarks);
        System.out.println("The Average of the marks is " + Average);

    }

    /*
     * 25. Write a program to input the values of the three sides of a triangle and
     * find its area using the formula:
     * Area = √(s(s-a)(s-b)(s-c)) where, s = (a+b+c)/2
     */

    public static void problem25() {

        // Variables
        float a;
        float b;
        float c;
        float s;

        double Area;

        // Taking marks of the subjects
        System.out.println("Enter the side a: ");
        a = scanner.nextFloat();

        System.out.println("Enter the side b: ");
        b = scanner.nextFloat();

        System.out.println("Enter the side c: ");
        c = scanner.nextFloat();

        // Computations.
        s = (a + b + c) / 2;

        Area = Math.sqrt((double) (s * (s - a) * (s - b) * (s - c))); // Math.sqrt() takes a double arguement and
                                                                      // returns a double value.

        System.out.println("The Area of the Triangle is " + Area);

    }

    /*
     * 26. Write a program to convert 12000 rupees into dollars (1 dollar = Rs. 60)
     */

    public static void problem26() {

        float rupees = 12000;
        float dollars = rupees / 60;

        System.out.println(rupees + " rupees in dollars are $" + dollars);

    }

    /*
     * 27. Write a program to input time in hours, minutes and seconds. Convert time
     * into seconds and print the result on screen.
     */

    public static void problem27() {

        System.out.print("Enter the Hours: ");
        int hours = scanner.nextInt();

        System.out.print("Enter the Minutes: ");
        int mins = scanner.nextInt();

        System.out.print("Enter the Seconds: ");
        long secs = scanner.nextInt();

        long timeInSeconds = secs + (60 * mins) + (3600 * hours);

        System.out.printf("The time %d:%d:%d in seconds is %d", hours, mins, secs, timeInSeconds);

    }

    /*
     * 28. Write a program to input values into variables a, b and c. Compute the
     * value of 'disc' by using formula: disc = b2 - 4ac
     */

    public static void problem28() {

        System.out.print("Enter the value for a: ");
        float a = scanner.nextFloat();

        System.out.print("Enter the value for b: ");
        float b = scanner.nextFloat();

        System.out.print("Enter the value for c: ");
        float c = scanner.nextFloat();

        double disc = Math.pow(b, 2) - 4 * a * c;

        System.out.printf("The Discriminat is %.2f", disc);

    }

    /*
     * 29. Write a program to print a message if the value of variable "n" is
     * greater than 100, otherwise ignore the statement.
     */

    public static void problem29() {

        System.out.print("Enter the value for n: ");
        int n = scanner.nextInt();

        if (n > 100)
            System.out.println("Hello bro! The entered value is greater than 100.");

    }

    /*
     * 30. Write a program to test whether a given integer is odd or even using
     * simple 'if' structure
     */

    public static void problem30() {

        System.out.print("Enter an Integer: ");
        int n = scanner.nextInt();

        if (n % 2 == 0)
            System.out.println(n + " is an Even number.");
        else
            System.out.println(n + " is an Odd number.");

    }

}
