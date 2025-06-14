package ConditionsLoops;

public class revnum {
    public static void main(String args[]){

        int n = 125454;
        int rev = 0;

        while(n > 0) {
            int a = n % 10;
            rev = rev * 10 + a;
            n = n / 10;
        }

        System.out.println(rev);

    }
}
