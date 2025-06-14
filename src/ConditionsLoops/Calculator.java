package ConditionsLoops;
import java.util.Scanner;
public class Calculator {
public static void main(String args[]) {
    System.out.println("Calculator");
    System.out.println("Press (+) for Addition");
    System.out.println("Press (-) for Substraction");
    System.out.println("Press (*) for Multiplication");
    System.out.println("Press (/) for Divide");

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    double a = sc.nextDouble();
    System.out.println("Enter second Number");
    double b = sc.nextDouble();

    System.out.println("Enter operator");

    double result;
    char oper = sc.next().charAt(0);

    switch (oper) {

        case '+':
            result = a + b;
            System.out.println("Result : " + result);
            break;

        case '-':
            result = a - b;
            System.out.println("Result : " + result);
            break;

        case '*':
            result = a * b;
            System.out.println("Result : " + result);
            break;

        case '/':
            result = a / b;
            System.out.println("Result : " + result);
            break;

        default:
            System.out.println("Invalid operator");
    }

}


}
