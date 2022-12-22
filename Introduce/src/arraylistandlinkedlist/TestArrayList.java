package arraylistandlinkedlist;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("New York"); arrayList.add("Atlanta");
        arrayList.add("Dallas"); arrayList.add("Madison");

        System.out.println(arrayList);
        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("New York");
        linkedList.add("Atlanta"); linkedList.add("Dallas");
        linkedList.add("Madison");
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        ListIterator<String> listIterator1 = linkedList.listIterator();
        while (listIterator1.hasNext()) {
            System.out.print(listIterator1.next() + " ");
        }
    }
}
