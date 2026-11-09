package modul_5.metode_selectionsort;

public class Main {
    public static void main(String[] args) {
        int[] list = {2,6,8,4,1};

        for (int i = 0; i < list.length - 1; i++) {
            int indekTerkcil = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[indekTerkcil]) {
                    indekTerkcil = j;
                }
            }

            int buf = list[i];
            list[i] = list[indekTerkcil];
            list[indekTerkcil] = buf;
        }

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
