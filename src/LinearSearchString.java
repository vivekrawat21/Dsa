import java.util.Scanner;

public class LinearSearchString {
//    static Boolean LinearSearch(String s,char target) {
//        if (s.length() == 0) {
//            return false;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            if (target==s.charAt(i)){
//                return true;
//
//            }
//        }
//        return false;
//    }
    static Boolean LinearSearch2(String s,char target) {
        if (s.length() == 0) {
            return false;
        }
        for (char ch : s.toCharArray()){
            if (target==ch){
                return true;

            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = in.next();
         char target = 's';
        System.out.println(LinearSearch2(name,target)==true?("character "+target+" is found"):("Character not found"));
    }
}
