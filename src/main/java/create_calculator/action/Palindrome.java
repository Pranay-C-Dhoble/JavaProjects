package create_calculator.action;

import create_calculator.model.Result;
import create_calculator.validator.CommandValidator;

public class Palindrome implements CommandValidator {
    public Result execute(String[] args) throws Exception {
        if (validate(args)) {
            for (int i = 0; i < args.length; i++) {
                if (isPalindrome(Integer.parseInt(args[i]))) {
                    System.out.println(args[i] + " is a palindrome");
                } else {
                    System.out.println(args[i] + " is not a palindrome");
                }
            }
            return Result.builder().message("------------This is the result of Palindrom number -------------").build();

        }
        return Result.builder().message("Invalid input").build();
    }
    public boolean validate(String[] args) throws Exception {
        if (args.length < 1) {
            throw new Exception("Usage: java Calculator -action palindrome -n1 \"number1\"");
        }
        return true;
    }

    private boolean isPalindrome(int i) {
        int r, sum = 0, temp;
        temp = i;
        while (i > 0) {
            r = i % 10;
            sum = (sum * 10) + r;
            i = i / 10;
        }
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }


}
