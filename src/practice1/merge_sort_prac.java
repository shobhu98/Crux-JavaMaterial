package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class merge_sort_prac {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int[] nums=new int[t];
        for (int i = 0; i <t ; i++) {
            nums[i]=s.nextInt();

        }
        System.out.println(Arrays.toString(merge_sort(nums)));

    }
    public static int[] merge_sort(int[] nums){
        int mid=nums.length/2;
        if(nums.length<=1){
            return nums;
        }
        int[] first= Arrays.copyOfRange(nums,0,mid);
        int[] second=Arrays.copyOfRange(nums,mid,nums.length);
        first=merge_sort(first);
        second=merge_sort(second);
        return merge(first,second);
    }

    public static int[] merge(int[] first,int[] second){
        int[] result= new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<first.length&&j<second.length){
            if(first[i]<second[j]){
                result[k++]=first[i++];
            }
            else{
                result[k++]=second[j++];
            }
        }
        while (i<first.length){
            result[k++]=first[i++];
        }
        while (j<second.length){
            result[k++]=second[j++];
        }
        return result;


    }
}
