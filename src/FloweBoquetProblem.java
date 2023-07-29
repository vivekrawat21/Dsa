public class FloweBoquetProblem {
    public static void main(String[] args) {
//flower bouquet problem
    }
    static Boolean possible(int[] arr, int day, int m ,int k){
        int count=0;
        int noOfBoquet=0;
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i]>=day){
                count++;
            }
            else{
               noOfBoquet+= count/k;
               count=0;
            }

        }
        noOfBoquet+=count/k;
        if(noOfBoquet>=m) {
            return true;
        }
        return false;
    }
}
