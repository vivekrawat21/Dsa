package BitwiseOperators;

import java.util.Scanner;

public class IsNumberIsInThePowerOfTwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to check if it is a power of 2 or not: ");
        int num = in.nextInt();

        if ((num & (num - 1)) == 0) {
            System.out.println("The number is a power of 2.");
        } else {
            System.out.println("The number is not a power of 2.");
        }
    }
}
