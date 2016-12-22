/**
 * Created by coffincw on 12/22/16.
 */
public class RPNQuadOperator  extends RPNOperator{
    public RPNQuadOperator() {
        super("quad", 3);
    }

    public void evaluate(RPNStack stack) {
        RPNStackItem item1 = stack.pop();
        RPNStackItem item2 = stack.pop();
        RPNStackItem item3 = stack.pop();

        double a = item1.getDoubleValue();
        double b = item2.getDoubleValue();
        double c = item3.getDoubleValue();
        double resultPos = ((-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
        double resultNeg = ((-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
        stack.push(new RPNStackItem(resultPos) + ", " + new RPNStackItem(resultNeg));
    }
}
