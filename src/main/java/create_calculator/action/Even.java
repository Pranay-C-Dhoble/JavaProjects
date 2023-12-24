package create_calculator.action;

import create_calculator.model.Result;
import create_calculator.validator.CommandValidator;

public class Even implements CommandValidator {
    public Result execute(String[] args) throws Exception {
        if(validate(args)) {
            for(int i = 1; i < args.length; i++) {
                if(Integer.parseInt(args[i]) % 2 == 0) {
                    System.out.println(args[i] + " is even");
                }else{
                    System.out.println(args[i] + " is not even");
                }
            }
            return Result.builder().message("This is the Solution for Even Number").build();
        }
        return Result.builder().message("Invalid input").build();
    }
    public boolean validate(String[] args) throws Exception{
        if(args.length < 1) {
            throw new Exception("Usage: java Calculator -action even -n1 \"number1\" -n2 \"number2\"");
        }
        return true;
    }
}
