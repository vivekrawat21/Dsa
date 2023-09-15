package BitwiseOperators;

import java.util.Scanner;

public class SetIthBit{
    public static void main(String[] args) {
       int num = 9;
       int i = 3;
        System.out.println(SetBit(num,i));

    }

    private static int SetBit(int num , int i){
        return num | (1<<(i-1));
    }
}
