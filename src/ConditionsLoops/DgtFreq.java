package ConditionsLoops;

import java.util.Scanner;

public class DgtFreq {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            long number = sc.nextLong();

            int[] frequency = new int[10];

            while (number > 0) {
                int digit = (int)(number % 10);
                frequency[digit]++;
                number = number / 10;
            }

            System.out.println("Digit Frequencies:");
            for (int i = 0; i < 10; i++) {
                if (frequency[i] > 0) {
                    System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
                }
            }

            sc.close();
        }


}
