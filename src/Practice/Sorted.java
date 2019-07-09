package Practice;

import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int[] nums=new int[t];
        for (int i = 0; i <t ; i++) {
            nums[i]=s.nextInt();


        }
        System.out.println(isSorted(nums,t,0));


    }
    public static boolean isSorted(int[] nums,int t,int i){
        if(i!=t-1){
            if(nums[i]<=nums[i+1]){
                isSorted(nums,t,i+1);
            }
            else {
                return false;
            }
        }
        return true;

    }


}

