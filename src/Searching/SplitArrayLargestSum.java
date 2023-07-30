package Searching;

public class SplitArrayLargestSum {
    //In this question we have to find the minimum sums from the largest sum that is possible from the partitions
    //For example arr={2,3,4,5,6,7,9,0} partition1={2,3,4} partition2={5,6,7,9,0} so the max partition sum  is partition 2 which is 5+6+7+9+0 which is 27 so the we have to make partiition like that and find the parttion which is maximum but have to minimum when we ccomparte it with all the partitions
    public static void main(String[] args) {
        //for this
        //1. minimum number of partion that can be make which is =1
        //2. what is the max number of partitions can be make  which is = N like {2},{3},{4},{5},{6},{7},{9},{0}
        //What will be the answer in case 1 is sum of the entire array.
        // In case2. the answer/max value of sum will be the  each/individual element of the array.


        //So by above we can say that max no. of sum /answer is in case 1.
        //and minimum number of sum will be in case2
        //minAns= max value in array
        //maxAns= sum of all values in array
        int[] arr= {1,2,4,5,7,8,9,8,9};
        System.out.println(splitArray(arr,2));


    }
    public static int splitArray(int[] nums ,int m){
        int start =0;
        int end=0;
      for (int i=0; i<nums.length;i++){
          start = Math.max(start, nums[i]);// in the end of the loop this will contain the max item from the array
          end += nums[i];
      }

      while(start<end){
        //try for the middle for the potential answer
        int mid = start+(end-start)/2;

        //calculate how many pieces you can divide this in with this max sum
          int sum =0;
          int pieces=1;
          for(int num : nums){
              if (sum+num>mid){
                  //you cannot add this in this subarray, make this new one
                  //say you  add this num in new subarray, then sum =num
                  sum=num;
                  pieces++; //one subarray is placed

              }else {
                  sum += num;
              }

          }
if (pieces >m){
    start = mid+1;

}
else {
    end=mid;
}
      }
      return end; // at the end start ==end
    }
}
