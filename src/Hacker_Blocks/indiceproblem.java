package Hacker_Blocks;

import java.util.ArrayList;
import java.util.Scanner;

public class indiceproblem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] nums=new int[n];
       // ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            nums[i]=s.nextInt();

        }
        int m=s.nextInt();
        System.out.println(indice(nums,0,m));
    }
    public static boolean indice(int[] nums,int start,int m){
        if (nums.length==start){
            return false;
        }

        if(nums[start]==m){
            return true;
        }


        return indice(nums,start+1,m);



    }
}
