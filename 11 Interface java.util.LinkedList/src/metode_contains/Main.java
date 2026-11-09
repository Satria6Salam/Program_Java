package metode_contains;

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

        boolean isPresent = linkedList.contains("B");
        System.out.println("Apakah elemen 'B' ada: " + isPresent);
    }
}
