import java.util.Scanner;

public class Main {

    public static double memory;
    public static int count = 0;

    public static void main(String[] args) {
        boolean loop = true;
        Scanner input = new Scanner(System.in);

        while (loop || count == 0) {
            start(input);
            System.out.print("Do you wish to perform another calculation on " + memory + "? [Y]/[N]");
            String answerContinue = input.nextLine();
            if (answerContinue.equalsIgnoreCase("N")) {
                System.out.println("Byebye");
                loop = false;
            }
        }
    }

    public static void start(Scanner input) {
        System.out.println("Select a calculation type:");
        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");
        System.out.println("[5] Modulus");

        System.out.print("Enter selected calculation: ");
        int value = input.nextInt();

        if (value > 5 || value < 1) {
            System.out.println("Invalid input");
        } else {
            double x, y;

            if (count == 0) {
                System.out.print("Enter the first number for your calculation: ");
                x = input.nextDouble();
                System.out.print("Enter the second number for your calculation: ");
            } else {
                System.out.print("Enter the number you wish to calculate with on " + memory + ": ");
                x = memory;
            }
            y = input.nextDouble();

            if (value == 1) {
                memory = addition(x, y);
                System.out.println("The sum is: " + memory);
            } else if (value == 2) {
                memory = subtraction(x, y);
                System.out.println("The difference is: " + memory);

            } else if (value == 3) {
                memory = multiplication(y, x);
                System.out.println("The product is: " + memory);

            } else if (value == 4) {
                memory = division(x, y);
                System.out.println("The quotient is: " + memory);

            } else {
                memory = modulus(y, x);
                System.out.println("The remainder of the division is: " + memory);
            }
            count++;
            System.out.println("Current amount of calculations this session: " + count);
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

    public static double modulus(double x, double y) {
        return x % y;
    }
}