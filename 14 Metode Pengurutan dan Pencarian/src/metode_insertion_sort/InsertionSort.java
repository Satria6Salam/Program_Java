package metode_insertion_sort;

public class InsertionSort {
    public int[] insertion(int[] data) {
        int ukuran = data.length;
        int max;
        int j;
        int i = 1; 

        while (i < ukuran) {
            max = data[i]; 

            for (j = i; j > 0; j--) {
                if (max<data[j-1]) {
                    data[j] = data[j-1];
                } else {
                    break;
                }
            }

            data[j] = max;
            i++;
        }

        return data;
    }
}
