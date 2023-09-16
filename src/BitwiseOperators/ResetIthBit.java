package BitwiseOperators;

public class ResetIthBit {
    public static void main(String[] args) {
        int num = 10;
        int i = 2;
        System.out.println(reSetBit(num,i));

    }

    private static int reSetBit(int num , int i){
        return num & (~(1<<(i-1)));
    }
}

