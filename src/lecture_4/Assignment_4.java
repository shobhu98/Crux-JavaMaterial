package lecture_4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int target=s.nextInt();
        int n = s.nextInt();

        int[] nums1 = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = s.nextInt();
        }
//        int[] nums2= new int[n];
//        for (int j = 0; j <n ; j++) {
//            nums2[j]=s.nextInt();
//
//        }
       // ques11(nums1,nums2);
        ques12(nums1,target);

       // ques1(nums);
      // int x= ques2(nums,4);
       // System.out.println(x);
      //  ques4(nums);
        //ques_5_6(nums);



    }
     // finding the maximum number in an array
    public static void ques1(int[] nums){
        int max=0;


        for (int i = 0; i <nums.length-1; i++) {
            if(i==0){
                max=nums[i];
            }
            if(nums[i]>max){
                 max=nums[i];
            }


        }

        System.out.println(max);

        }
        // index of a value of int m
    public static int ques2(int[] nums,int m){



        for (int i = 0; i <nums.length; i++) {
            if(nums[i]==m){
                return i;
            }
        }

       return -1;

    }
    // reversing a array
    public static void ques4(int[] nums){
        for (int i = 0; i <nums.length/2 ; i++) {
            // swapping the first and last followedby other values of array
            int temp=nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;


        }
        Main.display(nums);

    }
    public  static void ques_5_6(int[] nums){
        int[] result =new int[nums.length];
        int c=0;
        for (int i = 0; i <nums.length ; i++) {
            int p=nums[i];
            result[p]=i;

        }
        for (int i = 0; i <nums.length ; i++) {
            if(result[i]==nums[i]){
                c+=1;

            }
            else{
                System.out.println("not Inverse");
                break;
            }

        }
        if(c==nums.length){
            System.out.println("Inverse");
        }

    }
    //bubble sort
    public static void ques8(int[] nums){
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = 0; j <nums.length-i-1 ; j++) {
                if(nums[j+1]>nums[j]){
                    Main.swap(nums,j,j+1);
                }

            }

        }
    }
    //insertion sort
    public static  void ques9(int[] nums){
        for (int i = 0; i <nums.length-1 ; i++) {
            int Maxindex=Main.maxIndexInRange(nums,0,nums.length-i-1);
            Main.swap(nums,Maxindex,nums.length-i);
        }
    }
    public static int binary(int[] nums, int target,int start){


        int end = nums.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;

            if (nums[mid] == target){
                return nums[mid];
            } else if (nums[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return 0;
    }
    public static void ques11(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] nums3=new int[nums1.length];
        for (int i = 0; i <nums1.length ; i++) {
            int search=nums1[i];
            int x=binary(nums2,search,i);
            nums3[i]=x;


        }
        Main.display(nums3);
    }
    public static void ques12(int[] nums,int target){
        ArrayList<Integer> list= new ArrayList<>();
        int start=0;
        int end=nums.length-1;
        Arrays.sort(nums);
        while (start<=end){
            if(nums[start]+nums[end]==target){
                list.add(nums[start]);
                list.add(nums[end]);
                start++;
                end--;
            }
            else if(nums[start]+nums[end]>=target){
                end--;
            }
            else{
                start++;
            }



        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i));

        }
    }






}


