// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int closestPrime = findClosestPrime(a);
        System.out.println(closestPrime);
//        if ( isPrime(a) )
//            System.out.print("Yes");
//        else
//            System.out.print("No");
//        System.out.print(fibonacci(a-1));
        }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
//    public static int fibonacci(int n) {
//        if (n <= 1) {
//            return n;
//        }
//
//        int fib = 1;
//        int prevFib = 1;
//
//        for (int i = 2; i < n; i++) {
//            int temp = fib;
//            fib += prevFib;
//            prevFib = temp;
//        }
//
//        return fib;
//    }

    public static int findClosestPrime(int n) {
        if (n <= 2) {
            return 2; // Số nguyên tố đầu tiên là 2
        }

        int closestPrime = 0;
        int difference = Integer.MAX_VALUE;

        for (int i = n - 1; i >= 2; i--) {
            if (isPrime(i)) {
                int currentDifference = n - i;

                if (currentDifference < difference) {
                    closestPrime = i;
                    difference = currentDifference;
                }
            }
        }

        return closestPrime;
    }
}