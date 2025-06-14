package ConditionsLoops;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

        public static boolean isPrime ( int number) {

            if (number <= 1)
                return false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0)
                    return false;
            }
            return true;

        }
}