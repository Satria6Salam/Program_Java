package exception_method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        
        int[] ank = {1,2,3};
        System.out.print("Indek ke : ");
        int indeks = input.nextInt();
        
    //    System.out.println("==========Exception biasa");
    //    try {
    //        System.out.printf("Indek ke-%d adalah %d\n\n", indeks, ank[indeks] );
    //    } catch (Exception exception_message) {
    //        System.err.println("Indek melewati batas");
    //    }
        
        System.out.println("==========Exception method");
        int data = ambilData(ank, indeks);
        System.out.printf("Indek ke-%d adalah %d\n\n", indeks, data );
        
        System.out.println("Akhir Program");
    }
    
    private static int ambilData(int[] array, int indeks){
        int hasil = 0;
        
        try {
            hasil = array[indeks];
        } catch (Exception exception_message) {
            System.err.println("Indek melewati batas");
        }
        
        return hasil;
    }
}
