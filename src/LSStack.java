import java.util.ArrayList;

public class LSStack {
    ArrayList <LSStackItem> myList = new ArrayList();

    LSStack() {}

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
