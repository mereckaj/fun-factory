package fun.factory.math.services;

import fun.factory.math.arguments.ArgumentProvider;

public interface MathematicsService<A,B,R> {
    R compute(ArgumentProvider<A> argumentOneProvider, ArgumentProvider<B> argumentTwoProvider);
}
