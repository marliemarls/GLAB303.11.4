import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSortExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");

        //unsorted
        System.out.println(linkedList);

        //sort the list
        Collections.sort(linkedList);

        //sorted
        System.out.println(linkedList);

        //custom sorting
        Collections.sort(linkedList, Collections.reverseOrder());

        //custom sorted
        System.out.println(linkedList);


    }
}
