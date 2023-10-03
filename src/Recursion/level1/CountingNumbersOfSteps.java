package Recursion.level1;

import java.util.Scanner;

public class CountingNumbersOfSteps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number you want to reduce and count number of steps: ");
        int num= in.nextInt();
        System.out.println(StepsCount(num));
    }
    private static int StepsCount(int num){
        return (helper(num,0));
    }

    private static int helper(int num, int steps) {
        if (num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2,steps+1);
        }
        else {
            return helper(num-1,steps+1);
        }
    }

}
