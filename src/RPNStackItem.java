/**
 * Created by coffincw on 12/13/16.
 */
public class RPNStackItem extends LSStackItem {

    RPNStackItem(String input) {
        super(input);
    }

    RPNStackItem(double d) {
        super(new Double(d).toString());
    }



    double getDoubleValue() {
        return Double.valueOf(value);
    }
}
