package BitwiseOperators;

import java.util.Arrays;

public class FindiThbit {
        public static void main(String[] args) {
            int number = 23; // Replace this with the integer you want to find the k-th bit of
            int k = 3;      // Replace this with the desired bit position (0-based)

            int result = findKthBit(number, 2);

            System.out.println("The " + k + "-th bit of " + number + " is: " + result);
        }

        private static int findKthBit(int number, int k) {
            // Right-shift the number by k positions to make the k-th bit the least significant bit
            int shiftedNumber = number >> k;

            // Use a bitmask to extract the least significant bit (k-th bit)
            int kthBit = shiftedNumber & 1;

            return kthBit;
        }
    }

