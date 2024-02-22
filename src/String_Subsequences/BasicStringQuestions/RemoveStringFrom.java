package String_Subsequences.BasicStringQuestions;

import java.util.Scanner;

public class RemoveStringFrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want to store: ");
        String unprocessed = sc.next();
        String proccessed = "";
        System.out.print("Enter the word you want to skip: ");
        String Word =  sc.next();

        skip(proccessed,unprocessed,Word);
        System.out.println("Skipping if the word is not full: ");
        skipFirstThreeIfNotFull(proccessed,unprocessed,Word);

    }

      static void skip(String p , String up, String SkipWord) {
          if (up.isEmpty()) {
              System.out.println(p);
              return;
          }
          if (up.startsWith(SkipWord)) {
              skip(p, up.substring(SkipWord.length()), SkipWord);
          } else {
              skip(p + up.charAt(0), up.substring(1), SkipWord);
          }
      }
          static void skipFirstThreeIfNotFull(String p , String up, String SkipWord) {
              if (up.isEmpty()) {
                  System.out.println(p);
                  return;
              }
              if (up.startsWith(SkipWord.substring(0, 3)) && !up.startsWith(SkipWord)) {
                  skipFirstThreeIfNotFull(p,up.substring(SkipWord.substring(0, 3).length()),SkipWord );
              }
              else {
                  skipFirstThreeIfNotFull(p + up.charAt(0), up.substring(1), SkipWord);
              }
          }

}
