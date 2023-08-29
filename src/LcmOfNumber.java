public class LcmOfNumber {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int num;
        if (a > b) {
            num = a;
        } else {
            num = b;
        }
        for (int i = num; i <=  a*b ; i++) {

            if( i % a == 0 && i % b==0){
                break;

            }
        num++;


    }
        System.out.println(num);

}
    }

