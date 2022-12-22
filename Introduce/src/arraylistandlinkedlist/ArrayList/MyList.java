package arraylistandlinkedlist.ArrayList;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public void MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void MyList(int capacity){
        elements = new Object[capacity];
    }
    void add(int index, E element){
        Object temp = new Object[0];
        temp = elements;
        Object elements = new Object[0];
        for(int i = 0; i< index;i++){

        }
    }
}
