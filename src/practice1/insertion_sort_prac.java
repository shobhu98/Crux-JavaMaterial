package practice1;

import java.util.Scanner;

public class insertion_sort_prac {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();

        int[] nums=new int[t];

        for (int i = 0; i <t ; i++) {
            nums[i]=s.nextInt();

        }
        insertion_sort(nums);
        for (int i = 0; i <t ; i++) {
            System.out.println(nums[i]);

        }

    }
    public static void insertion_sort(int[] nums){

        for (int i = 0; i <nums.length ; i++) {
            int max=0;
            int val=nums[0];

            for (int j = 0; j <=nums.length-i-1; j++) {
                if(nums[j]>val){

                    max=j;

            }

                    int temp=nums[nums.length-i-1];
                    nums[nums.length-i-1]=nums[max];
                    nums[max]=temp;



        }


        }


    }
    //public static void maxin


}
