package Hacker_Blocks;

import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] nums=new int[n];

        for (int i = 0; i <n ; i++) {
               nums[i]=s.nextInt();
        }
        int[] ni=selection_sort(nums,n);
        for (int i = 0; i <n ; i++) {
            System.out.println(ni[i]);

        }

    }
    public static int[] selection_sort(int[] nums,int len){
        for (int i = 0; i <len ; i++) {
            int maxIndex=maxIndexInRange(nums,0,nums.length-i-1);

            swap(nums,nums.length-i-1,maxIndex);


        }

        return nums;
    }
    public static void  swap(int[] nums,int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;

    }


    public static int maxIndexInRange(int[] nums, int start, int end){
        int max = start;

        for (int i = start; i <= end; i++) {
            if (nums[i] > nums[max]){
                max = i;
            }
        }

        return max;
    }

}
