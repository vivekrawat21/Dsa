package BitwiseOperators;

import java.util.Arrays;

public class FindiThbit {
    public static void main(String[] args) {
        int number = 13; // Replace this with the integer you want to find the k-th bit of
        int k = 5;      // Replace this with the desired bit position (0-based)

        int result = findKthBit(number, k);

        System.out.println("The " + k + "-th bit of " + number + " is: " + result);
    }

    private static int findKthBit(int number, int k) {

        return ((number & (1 << (k-1))) >>(k-1));



    }
}
