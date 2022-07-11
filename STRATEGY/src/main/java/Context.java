
interface Strategy {
    int execute(int a, int b);
}

class StrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}

class StrategySubtract implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}

class StrategyMultiply implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}

public class Context {
    private Strategy strategy;
    private int a, b;
    public Context(Strategy strategy, int a, int b) {
        this.strategy = strategy;
        this.a = a;
        this.b = b;
    }
    public int doAction() {
        return strategy.execute(a, b);
    }
}
