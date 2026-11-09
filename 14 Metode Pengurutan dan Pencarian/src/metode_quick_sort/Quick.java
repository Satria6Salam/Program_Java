package metode_quick_sort;

public class Quick {
    public int[] quick(int[] data) {
        int ukuran = data.length - 1;

        quickProses(data, 0, ukuran);

        return data;
    }

    public void quickProses(int[] data, int st, int end) {
        if (st < end) {
            int pivot = getPivot(data, st, end);
            quickProses(data, st, pivot-1);
            quickProses(data, pivot+1, end);
        }
    }

    public int getPivot(int[] data, int st, int end) {
        int pivot = data[end];
        int i = st - 1;

        for (int j = st; j <= end-1; j++) {
            if (pivot > data[j]) {
                i++;
                swap(data, i, j);
            }
        }

        swap(data, i + 1, end);
        return i + 1;
    }

    public void swap(int[] data, int a, int b) {
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    } 
}
