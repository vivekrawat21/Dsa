import java.util.Scanner;

public class NoOfDigitsInBase {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the number you want number of digits in base: ");
        int a = in.nextInt() ;
        System.out.print("Enter the base of the number: ");

        int b = in.nextInt();

        int ans = (int)(Math.log(a)/Math.log(b))+1;
        System.out.println("The number of digits in "+a+" base "+b+" is :"+ans);

    }
}
