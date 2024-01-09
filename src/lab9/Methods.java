package lab9;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        testMethods();
    }

    public static void testMethods() {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        try {
            System.out.print("Enter the value of a: ");
            a = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the value of b: ");
            b = Integer.parseInt(scanner.nextLine());

            calculate(a, b);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input. You must enter an integer.");
        } catch (IllegalArgumentException | ArithmeticException | MyException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void calculate(int a, int b)
            throws  MyException, IllegalAccessException {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("IllegalArgumentException: a and b is less than zero");
        } else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            throw new ArithmeticException("ArithmeticException: a or b is zero and the other is non-zero");
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException("IllegalAccessException: a and b are zero");
        } else if (a > 0 && b > 0) {
            throw new MyException("MyException: a and b are greater than zero");
        } else {

            int sum = a + b;
            int difference = a - b;
            int multiplication = a * b;
            int division = a / b;

            System.out.println("Sum a and b: " + sum);
            System.out.println("Difference a and b: " + difference);
            System.out.println("Multiplication a and b: " + multiplication);
            System.out.println("Division a / b: " + division);
        }
    }
}



