/**
 * Created by coffincw on 12/16/16.
 */
public class RPNINVSineOperator extends RPNOperator {
    public RPNINVSineOperator() {
        super("asin", 1);
    }

    public void evaluate(RPNStack stack) {
        RPNStackItem item1 = stack.pop();

        double d1 = item1.getDoubleValue();
        double result = Math.asin(d1);
        stack.push(new RPNStackItem(result));
    }
}
