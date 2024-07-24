import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");

        //displaying linked list content
        System.out.println("Linked List Content: " + linkedlist);

        //add first and last element
        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " + linkedlist);

        //how to get and set values
        Object firstVar = linkedlist.get(0);
        System.out.println("First element: " + firstVar );
        linkedlist.set(0, "Changed first item");
        Object firstVar2 = linkedlist.get(0);
        System.out.println("First element after update by set method: " + firstVar2);

        //remove first and last element
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList after deletion of first and last: " + linkedlist);

        //add to a position and remove from a position
        linkedlist.add(0, "Newly added item");
        linkedlist.remove(2);
        System.out.println("Final content: " + linkedlist);

    }
}
