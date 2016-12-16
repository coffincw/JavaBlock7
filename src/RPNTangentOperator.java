/**
 * Created by coffincw on 12/16/16.
 */
public class RPNTangentOperator extends RPNOperator {
    public RPNTangentOperator() {
        super("tan", 1);
    }

    public void evaluate(RPNStack stack) {
        RPNStackItem item1 = stack.pop();

        double d1 = item1.getDoubleValue();
        double result = Math.tan(d1);
        stack.push(new RPNStackItem(result));
    }
}
