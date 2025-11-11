import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean loop = true;
        Scanner input = new Scanner(System.in);
        start();
        while (loop) {                                                   //loop == true | same as just loop
            anotherCalc();
            System.out.print("Are you done calculating? [Y]/[N]");
            String answer = input.nextLine();
            if (!answer.equalsIgnoreCase("N")) {            //! means inverse
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
                memory = addition(x, y);
            } else if (value == 2) {
                System.out.println("The difference is: " + subtraction(x, y));
                memory = subtraction(x, y);
            } else if (value == 3) {
                System.out.println("The product is: " + multiplication(x, y));
                memory = multiplication(x, y);
            } else if (value == 4) {
                System.out.println("The quotient is: " + division(x, y));
                memory = division(x, y);

            } else System.out.println("The remainder of the division is: " + modulus(x, y));
            memory = modulus(x, y);

            count++;
            System.out.println("Current amount of calculations this session: " + count);
        }
    }

    public static void anotherCalc() {
        Scanner input = new Scanner(System.in);

        System.out.print("Do you wish to perform another calculation on " + memory + "? [Y]/[N]");
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("Y")) {
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

                System.out.print("Enter the number you wish to calculate with on " + memory + ": ");
                double z = input.nextDouble();

                if (value == 1) {
                    System.out.println("The sum is: " + additionMemory(memory, z));
                    memory = additionMemory(memory, z);
                } else if (value == 2) {
                    System.out.println("The difference is: " + subtractionMemory(memory, z));
                    memory = subtractionMemory(memory, z);
                } else if (value == 3) {
                    System.out.println("The product is: " + multiplicationMemory(memory, z));
                    memory = multiplicationMemory(memory, z);
                } else if (value == 4) {
                    System.out.println("The quotient is: " + divisionMemory(memory, z));
                    memory = divisionMemory(memory, z);

                } else System.out.println("The remainder of the division is: " + modulusMemory(memory, z));
                memory = modulusMemory(memory, z);

                count++;
                System.out.println("Current amount of calculations this session: " + count);
            }
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

    public static double memory;

    public static double additionMemory(double z, double memory) {
        return memory + z;
    }

    public static double subtractionMemory(double z, double memory) {
        return memory - z;
    }

    public static double multiplicationMemory(double z, double memory) {
        return memory * z;
    }

    public static double divisionMemory(double z, double memory) {
        return memory / z;
    }

    public static double modulusMemory(double z, double memory) {
        return memory % z;
    }

    public static int count;
}

