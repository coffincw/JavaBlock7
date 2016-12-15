/**
 * Created by coffincw on 12/13/16.
 */
public class RPNStack extends LSStack {

    public RPNStackItem pop() {
        return (RPNStackItem) super.pop();
    }

    public void push(String s) {
        // check is s an operator
        if (RPNMain.operatorMap.containsKey(s)) {
            // do the operator
            RPNOperator op = RPNMain.operatorMap.get(s);
            op.evaluate(this);
        } else {
            try {
                double d = Double.valueOf(s);
                push(new RPNStackItem(s));
                // some more stuff here
            }
            catch (NumberFormatException ex) {
                System.out.println("Invalid token: " + s);
                System.exit(-1);
            }
        }
    }
}
