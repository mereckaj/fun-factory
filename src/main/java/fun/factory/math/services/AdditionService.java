package fun.factory.math.services;

import fun.factory.math.arguments.ArgumentProvider;
import fun.factory.math.operators.OperationService;
import fun.factory.math.validation.ArgumentValidationService;

public class AdditionService implements MathematicsService<Long, Long, Long>{
    private final ArgumentValidationService<Long> argumentValidationService;
    private final OperationService<Long, Long> operationService;

    public AdditionService(
            ArgumentValidationService<Long> argumentValidationService,
            OperationService<Long, Long> operationService
    ) {
        this.argumentValidationService = argumentValidationService;
        this.operationService = operationService;
    }

    @Override
    public Long compute(ArgumentProvider<Long> argumentOne, ArgumentProvider<Long> argumentTwo) {
        Long argOne = argumentOne.getArgument();
        Long argTwo = argumentTwo.getArgument();
        if(argumentValidationService.isValidArgument(argOne) && argumentValidationService.isValidArgument(argTwo)){
            return operationService.compute(argOne, argTwo);
        }

        throw new RuntimeException("arguments were not valid");
    }
}
