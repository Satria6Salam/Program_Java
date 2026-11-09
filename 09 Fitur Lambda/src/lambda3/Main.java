/*
 * Lambda dengan Blok Kode Jika ekspresi terdiri dari beberapa baris, gunakan {}.
 */
package lambda3;

interface Greeting {
    void sayHello();    
}
public class Main {
    public static void main(String[] args) {
        Greeting greeting = () -> {
            System.out.println("Hello, world!");
            System.out.println("Selamat belajar Java!");
        };

        greeting.sayHello();
    }
}
