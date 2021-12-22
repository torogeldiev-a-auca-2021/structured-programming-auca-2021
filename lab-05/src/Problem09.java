import java.util.Scanner;

public class Problem09 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = inp.nextLine();

        int low = 0;
        int high = s.length() - 1;

        boolean isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if (isPalindrome){
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}