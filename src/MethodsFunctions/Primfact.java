package MethodsFunctions;

public class Primfact {
    public static void printPrimeFactors(int n) {
        System.out.print("Prime factors of " + n + ": ");

        // Factor out 2s
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // Factor out odd numbers from 3 to sqrt(n)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // If remaining number is a prime > 2
        if (n > 2) {
            System.out.print(n);
        }

        System.out.println(); // for new line
    }

    public static void main(String[] args) {
        int num = 84;
        printPrimeFactors(num);
    }
}
