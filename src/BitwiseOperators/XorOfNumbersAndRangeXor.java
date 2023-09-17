package BitwiseOperators;

import java.util.Scanner;

public class XorOfNumbersAndRangeXor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter till number you want to XOR: ");
        System.out.print("Enter the range of the number you want to store: "+"\nFrom: ");
        int a = in.nextInt();
        System.out.print("till: ");
        int b = in.nextInt();
        System.out.println(Xor(b)^Xor(a-1));

//        int num = in.nextInt();
//        System.out.println("Xor of till the number : "+ Xor(num));
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
