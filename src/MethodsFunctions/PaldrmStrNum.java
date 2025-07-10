package MethodsFunctions;

public class PaldrmStrNum {
    public static boolean isPalindrome(Object input) {
        String str = input.toString();  // Convert number or string to string
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String word = "radar";
        System.out.println(word + " is palindrome? " + isPalindrome(word));

        int number = 12321;
        System.out.println(number + " is palindrome? " + isPalindrome(number));
    }
}
