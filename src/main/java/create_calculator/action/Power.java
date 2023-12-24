package create_calculator.action;

import create_calculator.model.Result;
import create_calculator.validator.CommandValidator;

public class Power implements CommandValidator {
    public Result execute(String[] args) throws Exception{
        if(validate(args)){
            double power = 1;
            double a = Integer.parseInt(args[0]);
            double b=Integer.parseInt(args[1]);
            power=  Math.pow(a,b);

            return Result.builder().message("The result is " + power).result(power).build();
        }
        return Result.builder().message("Invalid input").build();
    }
    public boolean validate (String[] args) throws Exception{
        if(args.length < 2) {
            throw new Exception("Usage: java Calculator -action power -n1 \"number1\" -n2 \"number2\"");
        }
        return true;
    }
}
