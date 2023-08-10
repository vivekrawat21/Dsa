package Strings;

import java.util.ArrayList;

public class PreetyPrinting {
    public static void main(String[] args) {
        //want to print two digits
        float a= 1212.121212f;
        System.out.printf("Formatted number is %.2f \n",a);
        ArrayList<Integer> array= new ArrayList<Integer>();
        array.add(5);
        array.add(9);
        System.out.println(array);
        //Object and every datatypes which are object will call toString before calling sout
    }
}
