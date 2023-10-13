package Recursion.level1;

import java.util.Scanner;

public class CountingNumberOfzeros
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        System.out.println( CountingZeros( number));

    }
    private static int CountingZeros(int num){
        return helper(num,0);
    }
    private static int helper(int num , int count){
        if (num==0){
            return count;
        }
       int  rem = num%10;
        if(rem == 0){
            return helper(num/10,count+1);
        }
        else {
            return helper(num/10,count);
        }
    }
}
