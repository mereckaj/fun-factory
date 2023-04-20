package fun.factory.math.arguments;

import java.util.Random;

public class AdditionArgumentProvider implements ArgumentProvider<Long>{
    @Override
    public Long getArgument() {
        long l = new Random().nextLong(5);
        System.out.println("Generated " + l);
        return l;
    }
}
