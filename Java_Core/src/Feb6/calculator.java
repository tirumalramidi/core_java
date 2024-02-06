package Feb6;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Basic Calculator!");

        String status = "c";

        while (!status.equals("q")){

            System.out.println("Please enter the first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Please enter the second number:");
            double num2 = scanner.nextDouble();

            System.out.println("Please enter the operation (+, -, *, /):");
            char operation = scanner.next().charAt(0);

            double result = 0;
            switch(operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if(num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation!");
                    return;
            }

            System.out.println("Result: " + result);



            System.out.println("Enter 'q' to quit");
            status = scanner.next();





        }

    }


}
