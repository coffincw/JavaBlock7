import java.util.Iterator;

/**
 * Created by coffincw on 12/9/16.
 */
public class LSQueueIterator implements Iterator<LSQueueItem>{
    LSQueue myQueue;
    static int currentPosition;
    public LSQueueIterator (LSQueue queue) {
        myQueue = queue;
        currentPosition = 0;
    }

    public boolean hasNext() {
        return currentPosition < myQueue.myQueue.size();
    }

    public LSQueueItem next() {
        return myQueue.myQueue.get(myQueue.myQueue.size() - 1 - currentPosition);
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}

