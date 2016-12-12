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
        for (LSStackItem item : stack) {
            System.out.println(item);

        }
//        while (myIterator.hasNext()) {
//            LSStackItem item = myIterator.next();
//            System.out.println(item);
//        }
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
        System.out.println(" ");
        queue.add(new LSQueueItem("Hi"));
        queue.add(new LSQueueItem("There"));
        queue.add(new LSQueueItem("1"));

        Iterator<LSQueueItem> myIterator = queue.iterator();
        while (myIterator.hasNext()) {
            LSQueueItem item = myIterator.next();
            System.out.println(item);
            LSQueueIterator.currentPosition++;
        }
    }

    public static void main (String[] args) {
        testStack();
        testQueue();

    }
}
