package Strings;

public class Palindrome {
    public static void main(String[] args) {
//        Check whether string is palindrome or not
        // means read from left to right same and right to left is same
        String palindrome= "viiiiv";
        System.out.println(isPalindrome(palindrome)?"It is a palindrome":"Not a palindrome");

    }
    static boolean isPalindrome(String a){
        for (int i = 0; i < a.length() /2; i++) {
            char start = a.charAt(i);
            char end = a.charAt(a.length()-1-i);
            if(start!=end){
                return false;
            }
        }
return true;
    }
}
