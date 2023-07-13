import java.util.ArrayList;
import java.util.Scanner;

public class ARRAYLIST {
    public static void main(String[] args) {
        //syntax
//        <> Generic Class
        ArrayList<Integer> dynamicArray = new ArrayList<>(10);  //no matter how much capacity it has it allocte it dynamically and resize the aaray according to some algorith

        Scanner in = new Scanner(System.in);

//        dynamicArray.add(67);
//        dynamicArray.add(672);
//        dynamicArray.add(6732);
//        dynamicArray.add(6723);
//        dynamicArray.add(67232);
//
//        System.out.println(dynamicArray);//Internally calling .toString in this
        // there are many methods like
//        dynamicArray.add(),dynamicArray.contains(),dynamicArray.remove(),dynamicArray.equals()

        System.out.print("Enter how many no. you want to store: ");
        int num =in.nextInt();
        System.out.println("Enter "+num+ (num>=10?" numbers":" number"));
        try{
        for (int i = 0; i < num; i++) {
            dynamicArray.add(in.nextInt());

        }
            System.out.print("Your Array is: ");
        System.out.println(dynamicArray);}
        catch (Exception e){
            System.out.println("please Enter valid datatype: "+e.getMessage());
        }
    }
}
