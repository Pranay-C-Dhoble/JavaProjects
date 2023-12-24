package create_calculator;
import create_calculator.action.*;
import create_calculator.model.Result;
import create_calculator.validator.CommandValidator;

import java.util.Scanner;
public class CalculatorApp {
    public static void main(String[] args) {
        System.out.println("----------------Welcome to Calculator----------------");
        while (true) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Enter the operation you want to perform");
            Scanner sc = new Scanner(System.in);
            String action = sc.nextLine();
            //Splitting the string into an array of strings
            args = action.split(" ");
            if (args.length < 2) {
                System.out.println("Usage: java Calculator -action [add|subtract|multiply|divide] -n1 \"number1\" -n2 \"number2\"");
                return;
            }
            CommandValidator command = null;
            switch (args[0]) {
                case "add":
                    command = new Addition();
                    break;
                case "subtract":
                    command = new Subtraction();
                    break;
                case "multiply":
                    command = new Multiplication();
                    break;
                case "divide":
                    command = new Division();
                    break;
                case "average":
                    command = new Average();
                    break;
                case "even":
                    command = new Even();
                    break;
                case "odd":
                    command = new Odd();
                    break;
                case "prime":
                    command = new Prime();
                    break;
                case "factorial":
                    command = new Factorial();
                    break;
                case "Max":
                    command = new Maximum();
                    break;
                case "Min":
                    command = new Minimum();
                    break;
                case "square":
                    command = new Square();
                    break;
                case "power":
                    command = new Power();
                    break;
                case "palindrome":
                    command = new Palindrome();
                    break;
                case "exit":
                    System.out.println("-----------------------------------------------");
                    System.out.println("-------------------Thank You-------------------");
                    System.out.println("-------------Calculator is closed--------------");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid action. Supported actions: add, subtract, multiply, divide");
            }
            String[] attributes = new String[args.length - 1];
            System.arraycopy(args, 1, attributes, 0, args.length - 1); //copying the array from index 1 to attributes array
            try {
                Result result = command.execute(attributes);
                System.out.println(result.getMessage());
                System.out.println(result.getResult());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
