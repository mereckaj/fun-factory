package fun.factory.math;

import fun.factory.math.arguments.AdditionArgumentProvider;
import fun.factory.math.operators.AdditionOperationService;
import fun.factory.math.operators.OperationService;
import fun.factory.math.services.AdditionService;
import fun.factory.math.services.MathematicsService;
import fun.factory.math.validation.AdditionArgumentValidator;
import fun.factory.math.validation.ArgumentValidationService;

public class Application {
    public static void main(String[] args) {
        AdditionArgumentProvider argOneProvider = new AdditionArgumentProvider();
        AdditionArgumentProvider argTwoProvider = new AdditionArgumentProvider();
        ArgumentValidationService<Long> argumentValidationService = new AdditionArgumentValidator();
        OperationService<Long, Long> operationService = new AdditionOperationService();
        MathematicsService<Long, Long, Long> additionService = new AdditionService(
                argumentValidationService,
                operationService
        );

        System.out.println(additionService.compute(argOneProvider, argTwoProvider));
    }
}
