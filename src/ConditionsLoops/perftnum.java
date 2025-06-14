package ConditionsLoops;

import java.util.*;
public class perftnum {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Entern a Number");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1 ; i<=n/2; i++){
                if(n%i==0)
                    sum = sum + i;
        }

        if(sum == n){
            System.out.println( n + " is perfect Number");
        }else
            System.out.println( n + " is not perfect Number");
    }
}
