package BitwiseOperators;

import java.util.Scanner;

public class NthMagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number you want the magic number:  ");
    int number = sc.nextInt();
        System.out.printf("Enter the base you want magic number: ");
    int base = sc.nextInt();

        System.out.println(magicNumber(number,base));

    }
    private static int magicNumber(int n , int base){
int ans =0;
      while(n>0){
          int lastDigit = n & 1;
         n = n>>1;
         ans +=lastDigit*base;
         base = base * 5;
      }

return ans;
    }
}
