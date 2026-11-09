package metode_Stack;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(100); // Menambahkan ke stack
        stack.push(200);
        stack.push(300);
        System.out.println("Stack: " + stack); // [300, 200, 100]
        System.out.println("Popped: " + stack.pop()); // 300 (hapus elemen terakhir)
        System.out.println("Elemen teratas stack: " + stack.peek()); // 200
    }
}
