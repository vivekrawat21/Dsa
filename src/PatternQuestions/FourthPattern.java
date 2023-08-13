package PatternQuestions;

public class FourthPattern {

    public static void main(String[] args) {
        //Approach:
        //no. of lines == no.of rows == no. of time the outer loop will run.

        //Identify for every row number how many columns are there or types of elements in the column

        //What do you need to print for every element
        patternFour(6);
    }

    static void patternFour(int n){
        for (int row = 1; row <= n; row++) {
            //for every row how many colums are = row
            int count =0;
            for (int col=1; col<=row;col++){

                count++;
                System.out.print(count + " " );
            }
            System.out.println();
        }
    }
}
