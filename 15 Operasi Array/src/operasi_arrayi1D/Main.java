package operasi_arrayi1D;

public class Main {
    public static void main(String[] args) {
        int[] list = new int[10];
        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        list[3] = 4;
        list[4] = 5;
        list[5] = 6;
        display("Insert Data");
        insert(list, 1, 20);
        display(list);
        
        display("\nDelete Data");
        delete(list, 2, list.length - 1);
        display(list);
        
        display("\nSearch Data");
        display(linearSearch(list, 20));
        
        display("\nFind Max");
        display(findMax(list));

        display("\nReverse Data");
        reverse(list);
        display(list);
        

    }

    static void reverse(int[] data) {
        int start = 0;
        int end = data.length - 1;
        while (start < end) {
            int temp = data[start];
            data[start] = data[end];
            data[end] = temp;
            start++;
            end--;
        }
    }

    static void insert(int[] data, int pcc, int value) {
        for (int i = data.length - 1; i > pcc; i--) {
            data[i] = data[i - 1];
        }
        data[pcc] = value;
    }

    static void delete(int[] data, int pos, int size) {
        for (int i = pos; i < size; i++) {
            data[i] = data[i+1];
        }
        data[size-1] = 0;
    }

    static int linearSearch(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    
    static int findMax(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }
    
    static void display(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    static void display(String message) {
        System.out.println(message);
    }

    static void display(int value) {
        System.out.println(value);
    }
}
