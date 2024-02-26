package String_Subsequences.SubsetsQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubsetCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String you want to find subset of :");
        String up = sc.next();
        System.out.print("Subsets are: ");
//         subset(up, "");
        System.out.println(subseq(up,""));
    }

    static void subset(String up ,String p) {
    if (up.isEmpty()){
        System.out.print(p+",");
        return;
    }
    char ch = up.charAt(0);
    subset(up.substring(1),p);
    subset(up.substring(1), p+ch);

    }
    static ArrayList<String> subseq(String up,String p){

        ArrayList<String> A = new ArrayList<>();
        if (up.isEmpty()){

            ArrayList <String>  list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
         ArrayList<String> left = subseq(up.substring(1),p);
       ArrayList<String> right = subseq(up.substring(1), p+ch);

       left.addAll(right);
       return left;


    }
}