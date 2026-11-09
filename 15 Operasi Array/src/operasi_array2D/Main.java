package operasi_array2D;

public class Main {
    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        print(matriks, "Matriks");

    }

    static void print(int[][] data, String message) {
        System.out.println(message);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
