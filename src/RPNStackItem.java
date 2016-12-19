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
        try {
            double d = Double.valueOf(value);
            return d;
            // some more stuff here
        }
        catch (NumberFormatException ex) {
            if (RPNMain.variableMap.containsKey(value)) {
                Double dop = RPNMain.variableMap.get(value);
                return dop.doubleValue();
            } else {
                System.out.println("Invalid token: " + value);
                System.exit(-1);
            }
        }
        return -1;
    }
}
