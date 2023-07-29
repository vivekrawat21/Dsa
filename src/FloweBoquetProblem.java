public class FloweBoquetProblem {
    public static void main(String[] args) {
//flower bouquet problem
        int [] arr={1,2,3,4,5,5,5,5,5,6,6,7,8,8,9,8,7,6};
        int noOfadjacentflower=3;
        int noOfBoquet=5;

        System.out.println("minimum no. of days required: "+ BinarySearch(arr,noOfBoquet,noOfadjacentflower));
        }
    //
    static Boolean possible(int[] arr, int day, int m ,int k){
        int count=0;
        int noOfBoquet=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=day){
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
    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE };
        }

        int minElement = arr[0];
        int maxElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
            } else if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        return new int[] { minElement, maxElement };
    }
     static int BinarySearch(int[] arr ,int m , int k){

        if(arr.length<m*k){
            return -1;
        }
      int[] minmax=  findMinMax(arr);
        int min= minmax[0];
        int max= minmax[1];

    while(min<=max){
        int mid = (min+(max-min)/2);
        if(possible(arr,mid,m,k)==true){
            max = mid-1;
        }
        else {
            min=mid+1;
        }

    }
    return min;

    }
}



