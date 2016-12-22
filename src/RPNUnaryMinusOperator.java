/**
 * Created by coffincw on 12/21/16.
 */
public class RPNUnaryMinusOperator extends RPNOperator {
    public RPNUnaryMinusOperator() {
        super("--", 1);
    }

    public void evaluate(RPNStack stack) {
        RPNStackItem item1 = stack.pop();

        double d1 = item1.getDoubleValue();
        double result = d1 * -1;
        stack.push(new RPNStackItem(result));
    }
}
