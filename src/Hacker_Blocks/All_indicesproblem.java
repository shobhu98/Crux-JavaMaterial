package Hacker_Blocks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class All_indicesproblem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] nums=new int[n];
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            nums[i]=s.nextInt();

        }
        int m=s.nextInt();
  ArrayList<Integer> l = all_indicesproblem(nums,list,0,m);
        for (int i = 0; i <l.size() ; i++) {
            System.out.println(l.get(i));

        }

    }
    public static ArrayList<Integer> all_indicesproblem(int[] nums, ArrayList<Integer> list,int start,int m){
        if(start==nums.length){
            return list ;
        }
        if(nums[start]==m){
            list.add(start);
            return all_indicesproblem(nums,list,start+1,m);
        }
        return all_indicesproblem(nums,list,start+1,m);

    }
}
