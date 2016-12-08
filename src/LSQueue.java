import java.util.ArrayList;

/**
 * Created by coffincw on 12/7/16.
 */
public class LSQueue {
    ArrayList myQueue = new ArrayList();

    LSQueue() {}

    void add(Object obj) {
        myQueue.add(0, obj);
    }
    Object remove() {
        if (isEmpty())
            return null;
        return myQueue.remove(myQueue.size() - 1);
    }

    boolean isEmpty() {
        return myQueue.size() ==0;
    }
    Object peek() {
        if (isEmpty())
            return null;
        return myQueue.get(0);
    }

    void printQueue() {
        System.out.println("---------");
        for(Object obj : myQueue) {
            System.out.println(obj);
        }
        System.out.println("---------");
    }
}

