package fun.factory.math.validation;

public interface ArgumentValidationService<A> {
    boolean isValidArgument(A argumentToValidate);
}
