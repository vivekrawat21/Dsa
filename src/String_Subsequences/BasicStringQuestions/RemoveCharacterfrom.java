package String_Subsequences.BasicStringQuestions;

import java.util.Scanner;

public class RemoveCharacterfrom {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string you want to check : ");
        String a = in.next();
        String p = "";
        skip(p,a);
        System.out.println(skipwithReturn(a));
    }
    static void skip(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch=='a'){
            skip(p,up.substring(1));}
            else{
                skip(p+ch,up.substring(1));
            }
        }

        static String skipwithReturn(String up)
        {

            if(up.isEmpty()){
                return "";
            }
            char ch = up.charAt(0);
             if(ch =='a') {
                return skipwithReturn(up.substring(1));
            }
            else {
                return ch + skipwithReturn(up.substring(1));
            }

        }
}
