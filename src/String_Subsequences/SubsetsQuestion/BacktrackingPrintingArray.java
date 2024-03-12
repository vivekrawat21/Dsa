package String_Subsequences.SubsetsQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class BacktrackingPrintingArray {

        public static void main(String[] args) {
            boolean [][]maze = {
                    {true,true,true},
                    {true,true,true},
                    {true,true,true}
            };
            int [][]path = new int[3][3];


            backtrackPrint(maze,0,0,"",path,1);
        }
        static void backtrackPrint(boolean [][]maze, int r, int c, String p,int[][]arr,int step){

            if (r == maze.length-1 && c == maze[0].length-1){
            arr[r][c] = step;
         for (int[] ar : arr) {
             System.out.println(Arrays.toString(ar));

         }
                System.out.println(p);
                System.out.println();
                return;
            }
            if(maze[r][c]==false){
               return;
            }
            maze[r][c] = false; // i am considring it false if not
            arr[r][c] = step;
            if(r<maze.length-1){
                backtrackPrint(maze , r+1,c , p+"D",arr,step+1);
            }
            if(r>0){
                backtrackPrint(maze , r-1,c , p+"U",arr,step+1);
            }
            if (c< maze[0].length-1){
                backtrackPrint(maze , r,c+1,p+"R",arr,step+1);
            }
            if(c>0){
                backtrackPrint(maze , r , c-1, p+"L",arr,step+1);
            }
            arr[r][c]=0;
            maze[r][c]= true;
        }
    }



