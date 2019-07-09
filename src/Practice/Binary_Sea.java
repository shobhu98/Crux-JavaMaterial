package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Sea {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] nums1=new int[n];
        for (int i = 0; i <n ; i++) {
          int x=s.nextInt();
            nums1[i]=x;

        }
        int target=s.nextInt();
        linear(nums1,target);


    }
    public static int binarysearch(int[] nums,int target){

        int start = 0;
        int end = nums.length-1 ;


        while (start <= end){
            int mid = (start + end) / 2;

            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] > target){
                end = mid - 1;
            } else if(nums[mid] < target) {
                start = mid + 1;
            }
        }

        return -1;
    }
    public static void reversearray(int[] nums){
        for (int i = 0; i <nums.length/2; i++) {
            int temp=nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;

        }
        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);

        }
    }
    public static int linear(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }
        }

        return -1;
    }
}
