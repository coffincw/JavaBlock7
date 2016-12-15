/**
 * Created by coffincw on 12/15/16.
 */
public class RPNFactOperator extends RPNOperator {
    public RPNFactOperator() {
        super("!", 1);
    }

    public void evaluate(RPNStack stack) {
        RPNStackItem item1 = stack.pop();
        double d1 = item1.getDoubleValue();
        double result = 0;
        for (int i = (int) d1 - 1; i > 0 ; i--) {
            d1 = d1 * i;
            result = d1;
        }
        stack.push(new RPNStackItem(result));
    }
}
