package Sorting.LeetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class AllMissingNumbersCyclicSort {
    public static void main(String[] args) {
        int  []numb= {4,5,6,7,8,1,1,1};

        System.out.println(findDisappearedNumbers(numb));
    }


    public static List<Integer> findDisappearedNumbers(int[] numbs) {
        int index=0;
        while (index < numbs.length){
            int correctIndex = numbs[index]-1;

            if(numbs[index]!= numbs[correctIndex]){
                Swap(index,correctIndex,numbs);

            }
            else{
                index++;
            }
        }
        List <Integer> ans= new ArrayList<Integer>();
        for(int i=0; i<numbs.length; i++){
            if(numbs[i]!= i+1) {

                ans.add(i+1);
            }
        }
        return ans;
    }

    static void  Swap(int first, int second, int[] nums){
        int temp= nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}
