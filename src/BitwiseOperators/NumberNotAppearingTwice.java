package BitwiseOperators;

public class NumberNotAppearingTwice {
    public static void main(String[] args) {
        int [] arr = {1,4,2,3,4,1,2};

        System.out.println(find(arr));

    }

    private static int find(int []arr){
        int unique = 0;
        for (int n : arr) {

            unique = unique^n;

        }
        return unique;
    }
}
