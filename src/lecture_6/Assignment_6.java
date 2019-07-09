package lecture_6;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_6 {
    public static void main(String[] args) {
        //  System.out.println(palindrome_rec("abc",0,2));
        int[] nums={1,2,2,2,3};
        //reversearray_rec(nums,0,2);
     //   System.out.println(findfirst_index(nums,0,3,0));
    //    System.out.println(findlast_index(nums,nums.length-1,2));
       // down_triangle(4,0);
       // ArrayList<Integer> sb=new ArrayList<>();

       int[] result=findAllIndex(nums,0,2,0);
        System.out.println(Arrays.toString(result));
    }
    // q11
    public static boolean palindrome_rec(String list,int s,int e){
        //base case
        if(s==e) {
            return true;
        }
        if(list.charAt(s)!=list.charAt(e)){
            return false;
        }
       //  palindrome_rec(list,s+1,e-1);

        return palindrome_rec(list,s+1,e-1);


    }
    // q-12
    public static void reversearray_rec(int[] nums,int s,int e){
        if(s==e) {
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]);
            }
            return;
        }
         if(s!=e){
             int temp=nums[s];
             nums[s]=nums[e];
             nums[e]=temp;

         }
         reversearray_rec(nums,s+1,e-1);

    }
    //q-8
    public static int findfirst_index(int[] nums,int index,int target,int count){
        if(index==nums.length){
            return -1;
        }
        if(nums[index]==target){
            return index;
        }
        return findfirst_index(nums,index+1,target,count);

    }
    //q-9
    public static  int findlast_index(int[] nums,int index,int target){
        if(index==0){
            return -1;
        }
        if(nums[index]==target){
            return  index;
        }
        return findlast_index(nums,index-1,target);
    }
    //q-3
    public static void down_triangle(int rows,int col){
        if(rows==0){
            return;
        }
        if(rows==col){
            System.out.println();
            down_triangle(rows-1,0);
            return;
        }
        System.out.print('*');
        down_triangle(rows,col+1);

    }
    //q-14
    public static void bubble_sort(int[] nums,int row, int col) {

        if (row == 0) {
            return;
        }

        if (row == col) {
            System.out.println();
            bubble_sort(nums,row-1, 0);
            return;
        }
        if(nums[col]>nums[col+1]){
            int temp=nums[col];
            nums[col]=nums[col+1];
            nums[col+1]=temp;
        }



        bubble_sort(nums,row, col + 1);
    }
    //q-10
    public static int[] findAllIndex(int[] nums, int index, int target, int count){
        if (index == nums.length){
            return new int[count];
        }

        if (nums[index] == target){

            int[] result = findAllIndex(nums, index + 1, target, count+1);
            result[count] = index;

            return result;
        }

        return findAllIndex(nums, index + 1, target, count);
    }



}
