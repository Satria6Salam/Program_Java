package metode_insertion_sort;

public class Main {
    public static void main(String[] args) {
        InsertionSort insert = new InsertionSort();

        int[] data = {4,2,8,9,3,6,1};
        int[] insertData = insert.insertion(data);

        for (int i = 0; i < insertData.length; i++) {
            System.out.print(insertData[i] + " ");
        }
    }
}
