import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {

        int n, r;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        n = input.nextInt();
        System.out.print("Enter the value of r: ");
        r = input.nextInt();

        int result = calculateCombination(n, r);
        System.out.println("C(" + n + ", " + r + ") = " + result);
    }

    public static int calculateCombination(int n, int r) {
        int numerator = factorial(n);
        int denominator = factorial(r) * factorial(n - r);
        int result = numerator / denominator;
        return result;
    }

    public static int factorial(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
