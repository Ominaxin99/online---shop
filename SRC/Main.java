package SRC;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Massiv uzunligini kiriting: ");
        int sizeee = scanner.nextInt();
        int[] array = new int[sizeee];

        for (int i = 0; i < sizeee; i++) {
            System.out.print("[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
        //////////////////
        int summa  = 0;
        for (int i = 0; i < sizeee; i++) {
            if (array[i] % 2 != 0) summa++;
            else summa--;
        }
        System.out.println(summa==0);

    }
}
