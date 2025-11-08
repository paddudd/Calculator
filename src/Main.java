import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner input = new Scanner(System.in);

        System.out.println("Select a calculation type:");
        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");

        System.out.print("Enter selected calculation: ");
        int value = input.nextInt();

        if (value > 4 || value < 1) {
            System.out.println("FUCK OFF CUNT!!!!");
        }
        else {

            System.out.print("Enter the first number for your calculation: ");
            double x = input.nextDouble();
            System.out.print("Enter the second number for your calculation: ");
            double y = input.nextDouble();

            if (value == 1) {
                System.out.println("The sum is: " + addition(x, y));
            } else if (value == 2) {
                System.out.println("The difference is: " + subtraction(x, y));
            } else if (value == 3) {
                System.out.println("The product is: " + multiplication(x, y));
            } else System.out.println("The quotient is: " + division(x, y));

        }
    }

    public static double addition(double x, double y) {
        return x + y;
    }

    public static double subtraction(double x, double y) {
        return x - y;
    }

    public static double multiplication(double x, double y) {
        return x * y;
    }

    public static double division(double x, double y) {
        return x / y;
    }
}


