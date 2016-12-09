/**
 * Created by coffincw on 12/7/16.
 */
import java.util.*;

public class LSStackMain {

    public static void testStack() {
        LSStack stack = new LSStack();
        stack.push(new LSStackItem("3"));
        stack.push(new LSStackItem("-1"));
        stack.push(new LSStackItem("bleah"));
        stack.push(new LSStackItem("last"));
        // stack.printStack();

        Iterator<LSStackItem> myIterator = stack.iterator();
        while (myIterator.hasNext()) {
            LSStackItem item = myIterator.next();
            System.out.println(item);
        }
//        stack.pop();
//        stack.printStack();
//        stack.pop();
//        stack.printStack();
//        Object obj = stack.pop();
//        if (obj instanceof Integer) {
//            Integer i = (Integer) obj;
//        }
//        if (obj instanceof String) {
//            String b = (String) obj;
//        }
    }

    public static void testQueue() {
        LSQueue queue = new LSQueue();
        queue.add(new Integer(2));
        queue.add(new Integer(-1));
        queue.add(new Integer(10));
        queue.printQueue();
        queue.remove();
        queue.printQueue();
        queue.remove();
        queue.printQueue();
    }

    public static void main (String[] args) {
        testStack();
        testQueue();

    }
}
