import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by coffincw on 12/7/16.
 */
public class LSQueue {
    ArrayList <LSQueueItem> myQueue = new ArrayList();

    LSQueue() {}

    public Iterator<LSQueueItem> iterator() {

        return new LSQueueIterator(this);
    }

    void add(LSQueueItem obj) {
        myQueue.add(0, obj);
    }
    LSQueueItem remove() {
        if (isEmpty())
            return null;
        return myQueue.remove(myQueue.size() - 1);
    }

    boolean isEmpty() {
        return myQueue.size() ==0;
    }

    LSQueueItem peek() {
        if (isEmpty())
            return null;
        return myQueue.get(0);
    }

    void printQueue() {
        System.out.println("---------");
        for(LSQueueItem obj : myQueue) {
            System.out.println(obj);
        }
        System.out.println("---------");
    }
}

