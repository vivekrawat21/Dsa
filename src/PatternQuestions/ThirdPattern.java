package PatternQuestions;

public class ThirdPattern {

    public static void main(String[] args) {
        //Approach:
        //no. of lines == no.of rows == no. of time the outer loop will run.

        //Identify for every row number how many columns are there or types of elements in the column

        //What do you need to print for every element
        patternThird(6);
    }

    static void patternThird(int n){
        for (int row = 1; row <= n; row++) {
            //for every row how many colums are = row
            for (int col=0; col<=n-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
