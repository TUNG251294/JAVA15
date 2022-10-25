package Lesson15.THNumberFormat;

import java.util.Scanner;

public class Calculation {
    static void beginCalculate(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number ");

        try {
            double x = Double.parseDouble(input.nextLine());
            System.out.println("Enter second number ");
            double y = Double.parseDouble(input.nextLine());

            System.out.println("Sum of " + x + " and " + y + " is " + (x + y));
            System.out.println("Subtract of " + x + " and " + y + " is " + (x - y));
            System.out.println("Multiply of " + x + " and " + y + " is " + (x * y));
            System.out.printf("%s%f%s%f%s%.3f","Divide of ",x ," and ",y," is ",(x / y));
        } catch (NumberFormatException e){
            System.out.println("Wrong Format");
        } catch (ArithmeticException e){
            System.out.println("Divide by 0");
        }
    }


}
