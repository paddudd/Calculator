import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean loop = true;
        Scanner input = new Scanner(System.in);
        while (loop) {                                                   //loop == true | same as just loop
            start();
            System.out.print("Do you want to continue? [Y]/[N]");
            String answer = input.nextLine();
            if (!answer.equalsIgnoreCase("Y")) {            //! means inverse
                System.out.println("Byebye");
                loop = false;
            }
        }


    }

    public static void start() {
        Scanner input = new Scanner(System.in);

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
            } else if (value == 4) {
                System.out.println("The quotient is: " + division(x, y));

            } else System.out.println("The remainder of the division is: " + modulus(x, y));

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

    public static int count;
}


