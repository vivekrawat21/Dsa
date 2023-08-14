package PatternQuestions;

public class PatternSix {
    public static void main(String[] args) {
        //Approach:
        //no. of lines == no.of rows == no. of time the outer loop will run.

        //Identify for every row number how many columns are there or types of elements in the column

        //What do you need to print for every element
        patternSix(6);
    }

    static void patternSix(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            //for every row how many colums are = row
            int Totalcol = row >= n ? 2 * n - row : row;

            int noOfSpaces = n - Totalcol;
            for (int spaces = 0; spaces < noOfSpaces; spaces++) {
                System.out.print(" ");

            }
            for (int col = 1; col <= Totalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
