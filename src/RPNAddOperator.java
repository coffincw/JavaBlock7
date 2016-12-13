/**
 * Created by coffincw on 12/13/16.
 */
public class RPNAddOperator extends RPNOperator {
    public RPNAddOperator() {
        super("+", 2);
    }

    public void evaluate(RPNStack stack) {
        RPNStackItem item1 = (RPNStackItem) stack.pop();
        RPNStackItem item2 = (RPNStackItem) stack.pop();

        double d1 = item1.getDoubleValue();
        double d2 = item2.getDoubleValue();
        double result = d1 + d2;
        stack.push(new RPNStackItem(result));
    }
}
