package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Max_in_subarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int k=s.nextInt();
        int[] nums=new int[t];
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <t ; i++) {
            nums[i]=s.nextInt();

        }
        Integer max=-999999999;

        for (int i = 0; i <t-k+1 ; i++) {
            max=-999999999;
            for (int j = i; j <i+k ; j++) {
                if(nums[j]>max){
                    max=nums[j];
                }


            }
            list.add(max);

        }
        //System.out.println(Arrays.toString(list.toArray()));
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");

        }

        }
    }

