package String_Subsequences;

import java.util.ArrayList;

public class Backtracking {
    public static void main(String[] args) {
        boolean [][]maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        System.out.println(backtrack(maze,0,0,""));
    }
    static ArrayList<String> backtrack(boolean [][]maze,int r,int c,String p){
        ArrayList<String> down = new ArrayList<>();
        ArrayList<String> up = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        ArrayList<String> left = new ArrayList<>();
        if (r== maze.length-1 && c == maze.length-1){
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return  list;
        }
        if(maze[r][c]==false){
            return new ArrayList<>();
        }
        maze[r][c] = false; // i am considring it false if not
        if(r<maze.length-1){
           down =  backtrack(maze , r+1,c , p+"D");
        }
        if(r>0){
            up =  backtrack(maze , r-1,c , p+"U");
        }
        if (c< maze[0].length-1){
            right = backtrack(maze , r,c+1,p+"R");
        }
        if(c>0){
            left = backtrack(maze , r , c-1, p+"L");
        }
        maze[r][c]= true;
        up.addAll(down);
        right.addAll(left);
        up.addAll(right);
        return up;
    }
}
