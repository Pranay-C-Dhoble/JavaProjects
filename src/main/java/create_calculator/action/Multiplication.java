package create_calculator.action;

import create_calculator.model.Result;
import create_calculator.validator.CommandValidator;

public class Multiplication implements CommandValidator {
    public Result execute(String[] args) throws Exception {
        if(validate(args)) {
            int mult = 1;
            for(int i = 0; i < args.length; i++) {
                mult *= Integer.parseInt(args[i]);
            }
            return Result.builder().message("The result is " + mult).build();
        }
        return Result.builder().message("Invalid input").build();
    }

    public boolean validate(String[] args) throws Exception {
        if(args.length < 2) {
            throw new Exception("Usage: java Calculator -action multiply -n1 \"number1\" -n2 \"number2\"");
        }
        return true;
    }
}
