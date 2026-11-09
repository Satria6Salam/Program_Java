package metode_insert;

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

        linkedList.add(1, "G");
        System.out.println(linkedList);
    }
    
}