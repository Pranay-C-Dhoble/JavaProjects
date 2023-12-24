package create_calculator.action;

import create_calculator.model.Result;
import create_calculator.validator.CommandValidator;

public class Factorial implements CommandValidator {
    public Result execute(String[] args) throws Exception{
        if(validate(args)){
            int factorial = 1;
            for(int i = 0; i < args.length; i++){
                for(int j = 1; j <= Integer.parseInt(args[i]); j++){
                    factorial *= j;
                }
                System.out.println("The factorial of " + args[i] + " is " + factorial);
            }
            return Result.builder().message("The result is " + factorial).result(factorial).build();
        }
        return Result.builder().message("Invalid input").build();
    }
    public boolean validate (String[] args) throws Exception{
        if(args.length < 1) {
            throw new Exception("Usage: java Calculator -action factorial -n1 \"number1\"");
        }
        return true;
    }
}
