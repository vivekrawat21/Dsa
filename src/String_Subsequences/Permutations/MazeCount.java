package String_Subsequences.Permutations;

public class MazeCount {
    public static void main(String[] args) {
        System.out.println(mazeCount(3,3));
    }

    static int  mazeCount(int r  , int c){
        if (r==1 || c==1){
            return 1;
        }
        else {
            int left = mazeCount(r-1, c);
            int right = mazeCount(r, c-1);
            return right+left;
        }

    }
}
