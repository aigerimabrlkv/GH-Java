public class FactorialCalculator {

    public static long factorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        long resultIterative = factorialIterative(number);
        long resultRecursive = factorialRecursive(number);

        System.out.println("Factorial of " + number + " (iterative) is: " + resultIterative);
        System.out.println("Factorial of " + number + " (recursive) is: " + resultRecursive);
    }
}

