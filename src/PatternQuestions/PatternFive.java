package PatternQuestions;

public class PatternFive {

    public static void main(String[] args) {
        //Approach:
        //no. of lines == no.of rows == no. of time the outer loop will run.

        //Identify for every row number how many columns are there or types of elements in the column

        //What do you need to print for every element
        patternFive(6);
    }

    static void patternFive(int n){
        for (int row = 1; row <= 2*n-1; row++) {
            //for every row how many colums are = row
            int Totalcol = row>=n ? 2*n-row:row;
            for (int col=1; col<=Totalcol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
