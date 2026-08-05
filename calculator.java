package Module1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        switch (op) {

            case "+":
                System.out.println("Answer = " + (a + b));
                break;

            case "-":
                System.out.println("Answer = " + (a - b));
                break;

            case "*":
                System.out.println("Answer = " + (a * b));
                break;

            case "/":
                if (b != 0)
                    System.out.println("Answer = " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;

            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}
