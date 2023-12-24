package create_calculator.action;

import create_calculator.model.Result;
import create_calculator.validator.CommandValidator;

public class Subtraction implements CommandValidator {
    @Override
    public Result execute(String[] args) throws Exception {
        if(validate(args)) {
            int difference = Integer.parseInt(args[0]);
            for(int i = 1; i < args.length; i++) {
                difference -= Integer.parseInt(args[i]);
            }
            return Result.builder().message("The result is " + difference).result(difference).build();
        }
        return Result.builder().message("Invalid input").build();
    }
    public boolean validate(String[] args) throws Exception{
        if(args.length < 2) {
            throw new Exception("Usage: java Calculator -action subtract -n1 \"number1\" -n2 \"number2\"");
        }
        return true;
    }
}
