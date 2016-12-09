import java.util.ArrayList;
import java.util.Iterator;

public class LSStack implements Iterable<LSStackItem> {
    ArrayList <LSStackItem> myList = new ArrayList();



    LSStack() {}

    public Iterator<LSStackItem> iterator() {
        
        return null;
    }

    void push(LSStackItem obj) {
        myList.add(0, obj);
    }

    LSStackItem pop() {
        if (isEmpty())
            return null;
        return myList.remove(0);
    }

    boolean isEmpty() {
        return myList.size() ==0;
    }
    LSStackItem peek() {
        if (isEmpty())
            return null;
        return myList.get(0);
    }

    void printStack() {
        System.out.println("---------");
        for(Object obj : myList) {
            System.out.println(obj);
        }
        System.out.println("---------");
    }
}
