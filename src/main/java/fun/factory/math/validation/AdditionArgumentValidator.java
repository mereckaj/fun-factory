package fun.factory.math.validation;

public class AdditionArgumentValidator implements ArgumentValidationService<Long>{
    @Override
    public boolean isValidArgument(Long argumentToValidate) {
        if(argumentToValidate == null){
            throw new RuntimeException("Argument to validate is null");
        }
        return true;
    }
}
