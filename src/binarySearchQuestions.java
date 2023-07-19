public class binarySearchQuestions {

    public static void main(String[] args) {
//        Q. cealing of a number
        // sealing : Smallest element in array >= target element
        //arr= {2,3,4,5,14,16,18}
        //ex : target=14 the cealing =14 target= 15 ceiling= 16
// For Binary search first we should know that the array will always be sorted- you see sorted array apply binary search
         int[] arr= {-3,-1,0,2,7,10,19,44,45,55};
        System.out.println(cealingCealing(arr,-6));

    }

    static int cealingCealing(int[] arr , int target){
        int[] sealing = new int[30];
        int j=0;

        for (int i = 0; i <arr.length ; i++) {
            {
                if(arr[i]>= target){

                    sealing[j]=arr[i];




                }
                j++;


            }


        }
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < sealing.length; i++) {

            if (sealing[i]<min ){
                min= sealing[i];
            }

        }


        return min;
    }

}

