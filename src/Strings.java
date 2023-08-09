public class Strings {
    public static void main(String[] args) {
        String name= "Vivek Rawat";
        String B ="Vivek Rawat";
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
