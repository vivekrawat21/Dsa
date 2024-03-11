package Leetcode;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(pad("","12").size());
        System.out.println(" total numbers of counts is : "+padCount("","12"));
    }
    static  ArrayList<String> pad(String p , String up) {
        if (up.isEmpty()) {
//            System.out.println(p);  
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;

        }

        int digit = up.charAt(0) - '0'; //this will convert '2' into 2
           ArrayList <String>  list= new ArrayList<>();
        for (int i = (digit-1) * 3 ; i < digit *3 ; i++){
            char ch = (char) ('a' + i);
          list.addAll(pad(p+ch,up.substring(1)));
        }

        return list;

    }
    static int padCount(String p, String up){
        if(up.isEmpty()){
            return 1;

        }
        int count = 0;
        int digit= up.charAt(0)-'0';
        for (int i = (digit-1)*3 ; i < digit*3 ; i++){
            char ch = (char) ('a'+i);
            count = count + padCount(p +ch, up.substring(1));
        }
        return  count;
    }
}

