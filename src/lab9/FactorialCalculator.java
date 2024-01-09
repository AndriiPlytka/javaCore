package lab9;

import java.util.Scanner;

public class FactorialCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = 0;
            long factorial = 1;

            try {
                System.out.print("Enter number n to calculate the factorial: ");
                n = scanner.nextInt();

                if (n < 0) {
                    throw new IllegalArgumentException("Factorial is defined only for non-negative numbers.");
                } else {
                    for (int i = 1; i <= n; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial number " + n + " = " + factorial);
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid value entered. Please enter an integer.");
            } finally {
                scanner.close();
            }
        }
}