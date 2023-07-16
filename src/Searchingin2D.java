import java.util.Arrays;
import java.util.Scanner;

public class Searchingin2D {

    //for searching like this first of all we want to sort the array/matics firs
    public static void main(String[] args) {
      int[][] RowColArray ={{10,20,30},
                            {13,25,33},
                             {18,27,40}};
      Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to search: ");
         int target =in.nextInt();



            System.out.println("Element Found at index: "+Arrays.toString(Search(RowColArray, target)));
        }
    }public static int[] Search(int arr[][], int target){
        int row = 0;
        int col= arr.length-1;


while(row<arr.length && col>=0){
    if(target==arr[row][col]){
        return new int[] {row,col};
    } else if (target>arr[row][col]) {
        row++;
    }
    else{
        col--;
    }

}




        return new int[] {-1,-1} ;
}
}
