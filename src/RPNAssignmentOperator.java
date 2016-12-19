/**
 * Created by coffincw on 12/16/16.
 */
public class RPNAssignmentOperator extends RPNOperator {
    public RPNAssignmentOperator() {
        super("=", 2);
    }

    public void evaluate(RPNStack stack) {
        RPNStackItem item1 = stack.pop();
        RPNStackItem item2 = stack.pop();

        double d1 = item1.getDoubleValue();
        String s2 = item2.toString();
        RPNMain.variableMap.remove(s2);
        RPNMain.variableMap.put(s2, new Double(d1));
        stack.push(item1);

    }
}
