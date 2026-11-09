/*
 * Lambda dengan Runnable (Thread) 
 * Fungsi lambda sangat berguna untuk menyederhanakan kode yang menggunakan Runnable.
 */
package lambda4;

public class Main {
    public static void main(String[] args) {
        // Sebelum Java 8 (menggunakan Anonymous Class)
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread dengan Anonymous Class");
            }
        });
        thread1.start();

        // Setelah Java 8 (menggunakan Lambda)
        Thread thread2 = new Thread(() -> System.out.println("Thread dengan Lambda"));
        thread2.start();
    }
}
