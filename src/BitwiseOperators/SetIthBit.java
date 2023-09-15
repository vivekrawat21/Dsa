package BitwiseOperators;

import java.util.Scanner;

public class SetIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to set the nth bit: ");
        int num = sc.nextInt();
        int shift = num>>(num-1);
        int setBit = shift | 1;
        System.out.println(setBit);


    }
}
