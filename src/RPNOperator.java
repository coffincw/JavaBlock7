/**
 * Created by coffincw on 12/13/16.
 */
public abstract class RPNOperator {
    String name;
    int numberOperands;

    RPNOperator(String s, int n) {
        name = s;
        numberOperands= n;
    }

    abstract void evaluate(RPNStack stack);

}
