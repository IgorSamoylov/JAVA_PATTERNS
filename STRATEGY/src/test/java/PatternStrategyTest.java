import org.testng.Assert;
import org.testng.annotations.Test;

public class PatternStrategyTest {

    @Test
    public void testMult() {
        Strategy strategy = new StrategyMultiply();
        Context context = new Context(strategy, 10, 1000);
        int result = context.doAction();
        Assert.assertEquals(result, 10_000);
        System.out.println(result);
    }
    
    @Test
    public void testSubt() {
        Strategy strategy = new StrategySubtract();
        Context context = new Context(strategy, 10, 1000);
        int result = context.doAction();
        Assert.assertEquals(result, -990);
        System.out.println(result);
    }

    @Test
    public static void testAdd() {
        Strategy strategy = new StrategyAdd();
        Context context = new Context(strategy, 10, 1000);
        int result = context.doAction();
        Assert.assertEquals(result, 1010);
        System.out.println(result);
    }
}
