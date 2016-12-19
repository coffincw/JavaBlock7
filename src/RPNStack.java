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
            super.push(new RPNStackItem(s));
        }
    }
}
