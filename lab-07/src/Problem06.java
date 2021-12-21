import java.util.*;

public class Problem06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[0];
        int number;

        System.out.print("Enter the integers between 1 and 100: ");

        while ((number = input.nextInt()) != 0) {
            num = array(num, number);
        }

        int searchNumber = 0, searchCount = 0;

        for (int j = 0; j < num.length; j++) {
            if (searchNumber != num[j] && num[j] != 0) {
                searchNumber = num[j];

                for (int i = j; i < num.length; i++) {
                    if (searchNumber == num[i]) {
                        searchCount++;
                        num[i] = 0;
                    }
                }

                System.out.print(searchNumber + " occurs " + searchCount + " time");
                if (searchCount > 1) {
                    System.out.println("s");
                } else {
                    System.out.println();
                }

                searchCount = 0;
            }

        }

    }

    private static boolean copyArray(int[] source, int[] dest) {

        if (source.length > dest.length)
            return false;

        for (int i = 0; i < source.length; i++) {
            dest[i] = source[i];
        }
        return true;

    }


    private static int[] array(int[] source, int data) {
        int[] dest = new int[source.length + 1];
        copyArray(source, dest);
        dest[source.length] = data;
        return dest;

    }
}