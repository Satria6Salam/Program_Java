package metode_quick_sort;

public class Main {
    public static void main(String[] args) {
        Quick quick = new Quick();

        int[] data = {4,1,6,8,2,7};
        int[] quikData = quick.quick(data);

        for (int i = 0; i < quikData.length; i++) {
            System.out.print(quikData[i] + " ");
        }
    }
}
