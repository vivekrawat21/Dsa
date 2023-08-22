package PatternQuestions;

public class PatternSeven {
    public static void main(String[] args) {
        //Approach:
        //no. of lines == no.of rows == no. of time the outer loop will run.

        //Identify for every row number how many columns are there or types of elements in the column

        //What do you need to print for every element
        patternSeven(5);
    }

    static void patternSeven(int n){
        for (int row = 1; row <= n; row++) {
            //for every row how many colums are = row
            int NoOfSpaces =n-row;
            for (int spaces=1; spaces<=NoOfSpaces;spaces++){
                System.out.print("  ");

            }
            for (int col=row; col>=1; col--){
                System.out.print(col+" ");
            }
            for (int col=2; col<=row; col++){
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
}
