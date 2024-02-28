package String_Subsequences.SubsetsQuestion;

import java.util.Scanner;

public class SubsequenceAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String you want to find subset of :");
        String up = sc.next();
        System.out.print("Subsets are: ");
         subseqAscii(up, "");
    }
    static void subseqAscii(String up ,String p) {
        if (up.isEmpty()){
            System.out.print(p+",");
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(up.substring(1),p);
        subseqAscii(up.substring(1), p+ch);
        subseqAscii(up.substring(1), p+(ch+0));

    }
}

