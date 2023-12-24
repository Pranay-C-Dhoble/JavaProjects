package create_calculator.action;

import create_calculator.model.Result;
import create_calculator.validator.CommandValidator;

public class Maximum implements CommandValidator {
    @Override
    public Result execute(String[] args) throws Exception {
        if(validate(args)) {
            int max = Integer.parseInt(args[0]);
            for(int i = 1; i < args.length; i++) {
                if(Integer.parseInt(args[i]) > max) {
                    max = Integer.parseInt(args[i]);
                }
            }
            return Result.builder().message("The result is " + max).result(max).build();
        }
        return Result.builder().message("Invalid input").build();
    }

    @Override
    public boolean validate(String[] args) throws Exception {
        if(args.length < 2) {
            throw new Exception("Usage: java Calculator -action maximum -n1 \"number1\" -n2 \"number2\"");
        }
        return true;
    }
}
