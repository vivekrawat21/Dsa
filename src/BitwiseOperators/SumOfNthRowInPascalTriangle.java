package BitwiseOperators;

import java.util.Scanner;

public class SumOfNthRowInPascalTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the row you want sum of in Pascal Triangle: ");
        int n = in.nextInt();

        int ans = 1<<(n-1);

        System.out.println("The sum of row number "+n+" in Pascal's Triangle is: "+ans);
    }
}
