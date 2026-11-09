package metode_selection_sort;

public class Main {
    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();


        int[] data = {4,6,9,1,5,2,8,3};

        int[] sortData = sort.selection(data);

        for (int i = 0; i < sortData.length; i++) {
            System.out.print(sortData[i] + " ");
        }
        
    }
}
