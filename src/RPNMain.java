/**
 * Created by coffincw on 12/13/16.
 */
import java.util.Scanner;
import java.util.HashMap;
public class RPNMain {

    static HashMap<String, RPNOperator> operatorMap;
    static HashMap<String, Double> variableMap;

    static RPNStack myStack = new RPNStack();

    public static String readLine(String prompt) {
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }

    public static String[] getTokens(String input) { return input.split(" ");}

    public static void processRPNInput() {
        boolean input = true;
        while (input) {
            String[] tokens = getTokens(readLine(": "));
            for (String t : tokens) {
                //System.out.println(t)
                myStack.push(t);
            }

            myStack.printStack();
            String inputline = readLine("exit?");
            inputline = inputline.toLowerCase();
            if (inputline.equals("yes")) {
                input = false;
            }
        }
    }

    public static void main (String[] args) {
        operatorMap = new HashMap<String, RPNOperator>();
        variableMap = new HashMap<String, Double>();

        operatorMap.put("+", new RPNAddOperator());
        operatorMap.put("-", new RPNSubtractOperator());
        operatorMap.put("*", new RPNMultiplyOperator());
        operatorMap.put("/", new RPNDivideOperator());
        operatorMap.put("!", new RPNFactOperator());
        operatorMap.put("^", new RPNPowerOperator());
        operatorMap.put("sqrt", new RPNSquareRootOperator());
        operatorMap.put("||", new RPNAbsOperator());
        operatorMap.put("acos", new RPNINVCosineOperator());
        operatorMap.put("cos", new RPNCosineOperator());
        operatorMap.put("sin", new RPNSineOperator());
        operatorMap.put("asin", new RPNINVSineOperator());
        operatorMap.put("tan", new RPNTangentOperator());
        operatorMap.put("atan", new RPNINVTangentOperator());
        operatorMap.put("%", new RPNModuloOperator());
        operatorMap.put("=", new RPNAssignmentOperator());
        operatorMap.put("<", new RPNLessThanOperator());
        operatorMap.put(">", new RPNGreaterThanOperator());
        operatorMap.put("&&", new RPNAndOperator());
        operatorMap.put("||", new RPNOrOperator());
        operatorMap.put("==", new RPNEqualsOperator());
        operatorMap.put("--", new RPNUnaryMinusOperator());
        operatorMap.put("quad", new RPNQuadOperator());



        processRPNInput();

//        myStack.push(new RPNStackItem(3.0));
//        myStack.push(new RPNStackItem(4.0));
//        addOp.evaluate(myStack);
//        myStack.printStack();
//        String test = readLine("TEST ");
//        System.out.println(test);
       // processRPNInput();
    }
}
