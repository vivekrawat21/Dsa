package BitwiseOperators;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();


        if ((num & 1) == 0){ //int java the equality operator has high prefrence than bitwise  so we need to specify the pranthesis.
            System.out.println("Number is even ");
        }
        else {
            System.out.println("Number is odd" + " ");
        }
    }
}
