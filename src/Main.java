import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
            System.exit(0);
        }
        else {

        System.out.print("Enter the first number for your calculation: ");
        int x = input.nextInt();
        System.out.print("Enter the second number for your calculation: ");
        int y = input.nextInt();

            if (value == 1) {
            int sum = x + y;
            System.out.printf("The sum is: %d%n", sum);
        }
            if (value == 2) {
                int difference = x - y;
                System.out.printf("The difference is: %d%n", difference);
            }

            if (value == 3) {
                int product = x * y;
                System.out.printf("The product is: %d%n", product);
            }

            if (value == 4) {
                int quotient = x / y;
                System.out.printf("The quotient is: %d%n", quotient);
            }

        }
    }
}


