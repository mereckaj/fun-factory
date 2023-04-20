package fun.factory.math.operators;

public class AdditionOperationService  implements OperationService<Long, Long>{
    @Override
    public Long compute(Long argOne, Long argTwo) {
        return argOne + argTwo;
    }
}
