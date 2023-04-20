package fun.factory.math.operators;

public interface OperationService<A,B>{
    A compute(A argOne, B argTwo);
}
