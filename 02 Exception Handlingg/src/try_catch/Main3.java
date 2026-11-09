package try_catch;

import java.util.ArrayList;
// import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // try {
        //     for (Integer num : list) {
        //         System.out.println(num);
        //         if (num == 2) {
        //             list.add(4); // Modifikasi langsung pada koleksi
        //         }
        //     }
        // } catch (ConcurrentModificationException e) {
        //     e.printStackTrace();
        // }

        int num;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            num = iterator.next();
            if (num == 2) {
                iterator.remove();
            }
        }
    
        System.out.println(list);
    }
}
