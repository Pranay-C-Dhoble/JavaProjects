package create_calculator.action;

import create_calculator.model.Result;
import create_calculator.validator.CommandValidator;

public class Odd implements CommandValidator {
    public Result execute(String[] args) throws Exception{
        if(validate(args)){
            int odd = 0;
            for(int i = 0; i < args.length; i++){
                if(Integer.parseInt(args[i]) % 2 != 0){
                    odd += Integer.parseInt(args[i]);
                }
            }
            return Result.builder().message("The result is " + odd).result(odd).build();
        }
        return Result.builder().message("Invalid input").build();
    }
    public boolean validate (String[] args) throws Exception{
        if(args.length < 1) {
            throw new Exception("Usage: java Calculator -action odd -n1 \"number1\" -n2 \"number2\"");
        }
        return true;
    }
}
