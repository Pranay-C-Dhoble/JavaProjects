package create_calculator.action;

import create_calculator.model.Result;
import create_calculator.validator.CommandValidator;

public class Average implements CommandValidator {
    public Result execute(String[] args) throws Exception{
        if(validate(args)){
            int avg = 0;
            for(int i = 0; i < args.length; i++){
                avg += Integer.parseInt(args[i]);
            }
            double ave = (double) avg /args.length;
            return Result.builder().message("The result is " + ave).result(ave).build();
        }
        return Result.builder().message("Invalid input").build();
    }
    public boolean validate (String[] args) throws Exception{
        if(args.length < 1) {
            throw new Exception("Usage: java Calculator -action average -n1 \"number1\" -n2 \"number2\"");
        }
        return true;
    }
}
