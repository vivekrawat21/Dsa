import java.util.Scanner;

public class LinearSearchString {
    static Boolean LinearSearch(String s,char target) {
        if (s.length() == 0) {
            return false;
        }
        else for (int i = 0; i < s.length(); i++) {
            if (target==s.charAt(i)){
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
        System.out.println(LinearSearch(name,target)==true?("character is found"):("Character not found"));
    }
}
