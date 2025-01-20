package Assignment_Package;

// 3.	Write a method isPalindrome to check if a string is a palindrome.

public class CheckStringIsPalindrome {

    public static boolean isPalindrome(String str) {

    	str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
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
        String word = "Madam";
        System.out.println(" Is Palindrome?  "+  isPalindrome(word));
       
    }
}
