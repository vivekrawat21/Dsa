package Recursion;

public class FIbbonacciSeries {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fibo(n));
    }
   //0,1,1,2,3,5,8,13,21,34

    static int fibo(int atIndex){

        if(atIndex==0){
            return 0;
        }
        if (atIndex==1){
            return 1;
        }
        return fibo(atIndex-1)+fibo(atIndex-2);

    }

}
