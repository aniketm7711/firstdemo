package ConditionsLoops;

import java.util.*;
public class Armstrng {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int result = 0 ;
        int digits= 0 ;

        int temp = n;
          while(temp != 0){
            temp= temp/10;
            digits++;
          }

          temp = n;
          while(temp != 0){
              int digit = temp %10;
              result = result + (int)Math.pow(digit,digits);
              temp = temp/10;
          }

        if (result == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is NOT an Armstrong number.");
        }
    }
}
