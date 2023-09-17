package BitwiseOperators;

import java.util.Scanner;

public class XorOfNumbersAndRangeXor {

    public static void main(String[] args) {
        System.out.print("Enter till number you want to XOR: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Xor of till the number : "+ Xor(num));
    }

    private static int Xor(int num) {
        if(num%4==0){
        return num;}
        else if (num%4==1) {
            return 1;

        }
        else if (num%4==2) {
            return num+1;
        }
        return 0;
    }


}
