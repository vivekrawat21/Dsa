package Strings;
public class Performance {
    public static void main(String[] args) {
     String series="";
       for (int i=0 ; i<26;i++){ //This is not good practice in this first the string copy the before string then append the i and then print it .In the End it increase storage. It lead to wastage of storage...
           char ch = (char) ('a' + i);
           series= series+ch; //We can add character like this ..

        }
        System.out.println(series);
    }

}
