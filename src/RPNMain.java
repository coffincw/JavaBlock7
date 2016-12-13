/**
 * Created by coffincw on 12/13/16.
 */
import java.util.Scanner;
import java.util.HashMap;
public class RPNMain {

    static HashMap<String, RPNOperator> operatorMap;

    public static String readLine(String prompt) {
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }

    public static String[] getTokens(String input) { return input.split(" ");}

    public static void processRPNInput() {
        RPNStack myStack= new RPNStack();

        //myStack.registerOperator(new RPNAddOperator());

        String [] tokens = getTokens(readLine(": "));
        for (String t : tokens) {
            //System.out.println(t)
            myStack.push(new RPNStackItem(t));
        }

        myStack.printStack();
    }

    public static void main (String[] args) {
        operatorMap = new HashMap<String, RPNOperator>();
        RPNStack myStack = new RPNStack();
        RPNOperator addOp = new RPNAddOperator();
        operatorMap.put("+", new RPNAddOperator());

        myStack.push(new RPNStackItem(3.0));
        myStack.push(new RPNStackItem(4.0));
        addOp.evaluate(myStack);
        myStack.printStack();
//        String test = readLine("TEST ");
//        System.out.println(test);
       // processRPNInput();
    }
}
