package Recursion.level1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the message you want to check whether it is palindrome or not");
        int num = in.nextInt();
        String message =PalindromeCheck(num)?"number is palindrome":"number is not  a palindrome";
        System.out.println(message);

    }
    private static boolean PalindromeCheck(int num){
        if (num==Reverse2(num)){
            return true;
        }
      return false;
    }
    private static int Reverse2(int num) {
        int base = (int)(Math.log10(num))+1;
        return (helper(num,base));

    }
    private static  int helper(int num , int base){

        if(base==1){
            return num;
        }
        int rem = num %10;
        return rem * (int)(Math.pow(10,base-1))+helper(num/10,base-1);
    }
}
