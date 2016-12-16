/**
 * Created by coffincw on 12/16/16.
 */
public class RPNPowerOperator extends RPNOperator {
    public RPNPowerOperator() {
        super("^", 2);
    }

    public void evaluate(RPNStack stack) {
        RPNStackItem item1 = stack.pop();
        RPNStackItem item2 = stack.pop();

        double d1 = item1.getDoubleValue();
        double d2 = item2.getDoubleValue();
        double result = Math.pow(d1, d2);
        stack.push(new RPNStackItem(result));
    }
}
