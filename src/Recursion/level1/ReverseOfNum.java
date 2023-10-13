package Recursion.level1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();

        Reverse1(num);

        System.out.println("Reverse of the digits of the numbers are using first method: "+sum);
        System.out.println("Reverse of digits of numbers by using reverse2 method is: "+ Reverse2(num));

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

    public static int sum = 0;
    private static void Reverse1(int num) {

        if(num == 0){
            return;
        }

       int rem = num%10;
      sum = sum*10+rem;
      Reverse1(num/10);


    }

}
