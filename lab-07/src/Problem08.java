import java.util.*;

public class Problem08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        int[] num = new int[10];

        for (int i = 0; i < num.length; ++i) {
            num[i] = input.nextInt();
        }

        System.out.println("Index of minimum number: " + indexOfSmallestElement(num));
    }

    public static int indexOfSmallestElement(int[] array) {

        double min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; ++i) {
            if (min > array[i]) {
                index = i;
            }
        }
        return index;
    }
}



