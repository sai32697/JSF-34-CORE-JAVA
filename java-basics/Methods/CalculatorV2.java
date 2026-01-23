package Methods;

import java.util.Scanner;

public class CalculatorV2 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter first number");
        double a = obj.nextDouble();

        System.out.println("Enter second number");
        double b = obj.nextDouble();

        System.out.println("Enter operation + - * % /");
        char operation = obj.next().charAt(0);

        switch (operation) {

            case '+':
                System.out.println("Addition is " + Arithmetic.add(a, b));
                break;

            case '-':
                System.out.println("Subtraction is " + Arithmetic.sub(a, b));
                break;

            case '*':
                System.out.println("Multiplication is " + Arithmetic.mul(a, b));
                break;

            case '/':
                System.out.println("Division is " + Arithmetic.div(a, b));
                break;

            case '%':
                System.out.println("Modulus is " + Arithmetic.mod(a, b));
                break;

            default:
                System.out.println("Invalid Operation.........");
        }

        obj.close();
    }
}
