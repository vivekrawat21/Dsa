package BitwiseOperators;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to find power: ");
        int num = in.nextInt();
        System.out.print("Enter the power of the number: ");
        int power = in.nextInt();
      int ans =1;
        while (power > 0) {
            if ((power & 1) == 1) {
                 ans = ans * num;
            }
            num = num * num;
            power = power >> 1;

        }
        System.out.println(ans);
    }
}
