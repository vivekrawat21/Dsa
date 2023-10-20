package Recursion.patterns;

public class rightTriangleReverse {
    public static void main(String[] args) {
        triangle(5,0);

    }
    private  static void triangle(int row , int cols){
        if (row==0){
            return;
        }   if (cols<row ) {
            System.out.print("*");
            triangle(row,cols+1);
            //Normal triangle below
            System.out.print("*");

        }
        else {
            System.out.println();
            triangle(row-1, 0);
            //Normal triangle below
            System.out.println();
        }
    }
}
