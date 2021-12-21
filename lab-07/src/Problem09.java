import java.util.*;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];

        System.out.print("Enter ten number: ");
        for (int i = 0; i < a.length; i++)
            a[i] = input.nextInt();

        int[] distinctNumbers = eliminateDuplicates(a);

        System.out.print("The distinct numbers are: ");
        for (int e: distinctNumbers) {
            if (e > 0)
                System.out.print(" " + e);
        }
        System.out.println();
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] distinctList = new int[list.length];
        int i = 0;
        for (int e: list) {
            if (sorting(distinctList, e) == -1) {
                distinctList[i] = e;
                i++;
            }
        }
        return distinctList;
    }

    public static int sorting(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }
}