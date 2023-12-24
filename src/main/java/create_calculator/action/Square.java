package create_calculator.action;

import create_calculator.model.Result;
import create_calculator.validator.CommandValidator;

public class Square implements CommandValidator {
    public Result execute(String[] args) throws Exception{
        if(validate(args)){
            int square = 0;
            for(int i = 0; i < args.length; i++){
                square = Integer.parseInt(args[i]) * Integer.parseInt(args[i]);
                System.out.println("The square of " + args[i] + " is " + square);
            }
            return Result.builder().message("The result is " + square).result(square).build();
        }
        return Result.builder().message("Invalid input").build();
    }
    public boolean validate (String[] args) throws Exception{
        if(args.length < 1) {
            throw new Exception("Usage: java Calculator -action square -n1 \"number1\"");
        }
        return true;
    }
}
