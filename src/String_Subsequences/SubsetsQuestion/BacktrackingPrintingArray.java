package String_Subsequences.SubsetsQuestion;

import java.util.ArrayList;

public class BacktrackingPrintingArray {

        public static void main(String[] args) {
            boolean [][]maze = {
                    {true,true,true},
                    {true,true,true},
                    {true,true,true}
            };


            backtrackPrint(maze,0,0,"");
        }
        static void backtrackPrint(boolean [][]maze, int r, int c, String p){
//            ArrayList<String> down = new ArrayList<>();
//            ArrayList<String> up = new ArrayList<>();
//            ArrayList<String> right = new ArrayList<>();
//            ArrayList<String> left = new ArrayList<>();
            if (r== maze.length-1 && c == maze.length-1){
                System.out.println(p);
            }
            if(maze[r][c]==false){
               return;
            }
            maze[r][c] = false; // i am considring it false if not
            if(r<maze.length-1){
                backtrackPrint(maze , r+1,c , p+"D");
            }
            if(r>0){
                backtrackPrint(maze , r-1,c , p+"U");
            }
            if (c< maze[0].length-1){
                backtrackPrint(maze , r,c+1,p+"R");
            }
            if(c>0){
                backtrackPrint(maze , r , c-1, p+"L");
            }
            maze[r][c]= true;
        }
    }



