import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        //Here i will try to find a squareroot using binary search
        //The squareroot should be of integer no float
        //This can be using  the method of finding floor of a number
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want squareRoot of: ");
         long num= in.nextLong();

        System.out.println("SquareRoot of "+ num + " is " + squareRoot(num) );



    }
    static long squareRoot(long num){
     long low =1;
     long high = num;
     while(low<=high){
        long mid= low +(high-low)/2;
        if(mid*mid<=num){
           low= mid+1;


        }
        else {
            high=mid-1;
        }
     }
     return high;
    }
}
