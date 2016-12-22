/**
 * Created by coffincw on 12/21/16.
 */
public class RPNEqualsOperator extends RPNOperator {
    public RPNEqualsOperator() {
        super("==", 2);
    }

    public void evaluate(RPNStack stack) {
        RPNStackItem item1 = stack.pop();
        RPNStackItem item2 = stack.pop();

        double d1 = item1.getDoubleValue();
        double d2 = item2.getDoubleValue();
        double result;
        if (d2 == d1) {
            result = 1;
        } else {
            result = 0;
        }
        stack.push(new RPNStackItem(result));
    }
}
