package Recursion.level1;

import java.util.Scanner;

public class SumOfDigitsOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();

        System.out.println("Sum of the digits of the numbers are: "+ Sum(num));

    }
    private static int Sum(int num){
        int digit = num%10;
        if (num==0){
             return num;
        }

        else {
          return digit + Sum(num/10);
        }


    }
}
