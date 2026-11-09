package metode_addFirst_addLast;

import java.util.LinkedList;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        LinkedList linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        System.out.println(linkedList);

        linkedList.addFirst("First");
        linkedList.addLast("Last");
        System.out.println(linkedList);
    }
}
