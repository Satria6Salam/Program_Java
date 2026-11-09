package metode_selection_sort;

public class SelectionSort {
    public int[] selection(int[] data) {
        int ukuran = data.length;

        while (ukuran > 0) {
            int max = 0;
            int i;
            
            for (i = 1; i < ukuran; i++) {
                if (data[max] < data[i]) {
                    max = i;
                }
            }

            int temp = data[max];
            data[max] = data[ukuran-1];
            data[ukuran-1] = temp;

            ukuran--;
        }

        return data;
    }
}
