package Hacker_Blocks;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //   StringBuilder sb=new StringBuilder();
        //   int m=-1000000000;
        Scanner s = new Scanner(System.in);
        //BigInteger n=s.nextBigInteger();
        int t = s.nextInt();
        int[] nums = new int[t];
        for (int i = 0; i < t; i++) {

            nums[i] = s.nextInt();


        }
        int target = s.nextInt();
        Arrays.sort(nums);
        System.out.println(binarysearch(nums, target));
    }









//    public static void lexicographicalorder(String str,int n,int index,StringBuilder sb) {
//        if (index == n) {
//      //      System.out.println(1);
//            return;
//        }
//        System.out.println(sb);
//       // System.out.println(index);
//        for (int i =index+1; i <n ; i++) {
//            sb.append(str.charAt(i));
//            lexicographicalorder(str,n,i,sb);
//
//        //    System.out.println("length"+sb.length());
//            sb.deleteCharAt(sb.length()-1);
//
//
//        }
//       // System.out.println(2);
//        return;
//    }
//    public static String sortString(String inputString)
//    {
//        // convert input string to char array
//        char tempArray[] = inputString.toCharArray();
//
//        // sort tempArray
//        Arrays.sort(tempArray);
//
//        // return new Sorted string
//        return new String(tempArray);
//    }
//    public static void printseries(int n1,int n2){
//        for (int i = 1; i <n1 ; i++) {
//            {
//                if((3*i+2)%n2==0){
//                    System.out.println(3*i+2);
//                }
//            }
//
//        }
//    }
//    public static void sumofoddeven(int num){
//        int i=1;
//        int odd=0;
//        int even=0;
//        while (num!=0){
//            int r=num%10;
//            if(i%2!=0){
//                odd+=r;
//                i++;
//
//            }
//            else {
//                even+=r;
//                i++;
//            }
//            num=num/10;
//        }
//
//    }
    //Shopping game
    public static void shoppinggame(int n1,int n2){

         int i=1;
         int harshit=0;
         int aayush=0;
        while (true){
           aayush+=i;
           harshit+=i+1;
           if(aayush>n1){
               System.out.println("Harshit");
               break;
           }
           if(harshit>n2){
               System.out.println("Aayush");
               break;
           }

        }

    }
    public static int binarysearch(int[] nums,int target){

        int  start=0;
        int end=nums.length-1;
        int mid=(start+end)/2;
        while (start<=end){
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }


        }
        return -1;
    }




}

