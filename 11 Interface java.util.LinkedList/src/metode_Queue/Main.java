package metode_Queue;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(10); // Menambahkan elemen ke antrian
        queue.offer(20);
        queue.offer(30);
        System.out.println("Queue: " + queue); // [10, 20, 30]
        System.out.println("Dequeued: " + queue.poll()); // 10 (hapus elemen pertama)
        System.out.println("Elemen pertama dalam queue: " + queue.peek()); // 20
        System.out.println("Queue: " + queue);
        
    }
}
