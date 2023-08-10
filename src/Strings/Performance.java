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

    public static class String {
        public static void main(java.lang.String[] args) {
            java.lang.String name= "Vivek Rawat";
            java.lang.String B ="Vivek Rawat";
            Integer num = 33;
            System.out.println(num);
            //Both the refrence variable pointing to same memory space in heap
    //        System.out.println(B);
            //Strings in java are immutable

    //         methods of string
            System.out.println(name.equals(B));

            System.out.println(name.charAt(0));
        }
    }
}
