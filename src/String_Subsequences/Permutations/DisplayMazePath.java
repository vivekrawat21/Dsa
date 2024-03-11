package String_Subsequences.Permutations;

import java.util.ArrayList;

public class DisplayMazePath {
    public static void main(String[] args) {

        System.out.println(displayMazePathRDDi("",3,3));

    }
    static ArrayList<String> displayMazePathRD(String p, int r, int c){
        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        if (r==1 && c ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return  list;
        }
        else {
            if (c > 1) {
                left = displayMazePathRD(p + "R", r, c - 1);
            }

            if (r > 1) {

                right = displayMazePathRD(p + "D", r - 1, c);
            }

            left.addAll(right);
            return left;

        }


    }
    static ArrayList<String> displayMazePathRDDi(String p, int r, int c){
        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        ArrayList<String> diagonal = new ArrayList<>();
        if (r==1 && c ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return  list;
        }
        else {
            if (c > 1) {
                left = displayMazePathRDDi(p + "R", r, c - 1);
            }

            if (r > 1) {

                right = displayMazePathRDDi(p + "D", r - 1, c);
            }
            if (r>1 && c>1) {
                diagonal = displayMazePathRDDi(p + "Di", r - 1, c - 1);
            }
            left.addAll(right);
            left.addAll(diagonal);
            return left;

        }


    }
}
