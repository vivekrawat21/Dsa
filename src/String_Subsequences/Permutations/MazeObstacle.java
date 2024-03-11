package String_Subsequences.Permutations;

import java.util.ArrayList;

public class MazeObstacle {
    public static void main(String[] args) {
        System.out.println(displayMazePathRDDiObstacle("",3,3,2));
    }

    static ArrayList<String> displayMazePathRDDiObstacle(String p, int r, int c,int skip) {
        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        ArrayList<String> diagonal = new ArrayList<>();
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        } else {

            if (r==skip && c==skip){
                return new ArrayList<>();
            }

            if (c > 1) {

                left = displayMazePathRDDiObstacle(p + "R", r, c - 1,skip);
            }

            if (r > 1) {

                right = displayMazePathRDDiObstacle(p + "D", r - 1, c,skip);
            }
            if (r > 1 && c > 1) {
                diagonal = displayMazePathRDDiObstacle(p + "Di", r - 1, c - 1,skip);
            }

            left.addAll(right);
            left.addAll(diagonal);
            return left;

        }
    }
}
