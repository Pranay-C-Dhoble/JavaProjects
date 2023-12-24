package create_calculator.validator;

import create_calculator.model.Result;

public interface CommandValidator {
    public Result execute(String[] args) throws Exception;
    public boolean validate(String[] args) throws Exception;
}
