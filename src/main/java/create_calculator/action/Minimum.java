package create_calculator.action;

import create_calculator.model.Result;
import create_calculator.validator.CommandValidator;

public class Minimum implements CommandValidator {
    public Result execute(String[] args) throws Exception{
        if(validate(args)){
            int min = Integer.parseInt(args[0]);
            for(int i = 0; i < args.length; i++){
                if(Integer.parseInt(args[i]) < min){
                    min = Integer.parseInt(args[i]);
                }
            }
            return Result.builder().message("The result is " + min).result(min).build();
        }
        return Result.builder().message("Invalid input").build();
    }
    public boolean validate (String[] args) throws Exception{
        if(args.length < 1) {
            throw new Exception("Usage: java Calculator -action minimum -n1 \"number1\" -n2 \"number2\"");
        }
        return true;
    }
}
