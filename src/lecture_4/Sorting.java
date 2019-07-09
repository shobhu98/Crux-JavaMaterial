package lecture_4;

import java.util.Arrays;

public class Sorting {
    public static class main {
        public static void main(String[] args) {


            int[] nums = {3, 6, 1, 2, 5, 0, 4};
            //bubble(nums);
            selection(nums);


    }
    //bubble sort
        public static void bubble(int[] nums){
            for (int i = 0; i <nums.length-1 ; i++) {
                {
                    for (int j = 0; j <nums.length-i-1 ; j++) {
                        if(nums[j]>nums[j+1])
                        {
                           Main.swap(nums,j,j+1);
                        }
                        
                    }
                }
                
            }
            Main.display(nums);
        }
     //selection sort
     public static void selection(int[] nums){
         for (int i = 0; i < nums.length - 1; i++) {
             int maxIndex = Main.maxIndexInRange(nums, 0, nums.length - i - 1);
             Main.swap(nums,  nums.length - i - 1,maxIndex);
         }
         Main.display(nums);
     }





}
}