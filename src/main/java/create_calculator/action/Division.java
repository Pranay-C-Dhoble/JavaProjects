package create_calculator.action;

import create_calculator.model.Result;
import create_calculator.validator.CommandValidator;

public class Division implements CommandValidator {
    public Result execute(String[] args) throws Exception {
        if(validate(args)) {
            double quotient = Integer.parseInt(args[0]);
            for(int i = 1; i < args.length; i++) {
                quotient /= Integer.parseInt(args[i]);
            }
            return Result.builder().message("The result is " + quotient).result(quotient).build();
        }
        return Result.builder().message("Invalid input").build();
    }
    public boolean validate(String[] args) throws Exception{
        if(args.length < 2) {
            throw new Exception("Usage: java Calculator -action divide -n1 \"number1\" -n2 \"number2\"");
        }
        return true;
    }
}
