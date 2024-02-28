package String_Subsequences.SubsetsQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetDuplicateIteration {
    public static void main(String[] args) {
        int []arr = {1,2,2};
        List<List<Integer>> ans = subset(arr);
        System.out.println(ans);
    }
    static List <List <Integer>> subset (int []arr) {

        List<List<Integer>> outer = new ArrayList<>();
        Arrays.sort(arr);
        outer.add(new ArrayList<>());
        int start = 0;
        int end =0;

        for (int i =0 ;i<arr.length;i++){
            start = 0;
            //if my current and previous element is same , s= e+1
            if(i>0 && arr[i]==arr[i-1]){
                start= end+1;
            }
             end = outer.size()-1;
            int n = outer.size();
            for (int j =start; j<n ; j++){
                List <Integer> internal = new ArrayList<>(outer.get(j)); //This will get the outer list copy
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
