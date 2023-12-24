package create_calculator.action;

import create_calculator.model.Result;
import create_calculator.validator.CommandValidator;

public class Prime implements CommandValidator {
    public Result execute(String[] args) throws Exception{
        if(validate(args)){
            int prime = 0;
            for(int i = 0; i < args.length; i++){
                int val = Integer.parseInt(args[i]);
                int j = 2;
                boolean p = true;
                while (j < val) {
                    if (val % i == 0) {
                        p = false;
                        break;
                    }
                    j++;
                }
                if(p){
                    System.out.println(val + " is prime");
                }
                else {
                    System.out.println(val + " is not prime");
                }
            }
            return Result.builder().message("The result is " + prime).result(prime).build();
        }
        return Result.builder().message("Invalid input").build();
    }
    public boolean validate (String[] args) throws Exception{
        if(args.length < 1) {
            throw new Exception("Usage: java Calculator -action prime -n1 \"number1\" -n2 \"number2\"");
        }
        return true;
    }
}
