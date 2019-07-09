package queue;

import java.util.Scanner;

public class validcreditcard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();

        for (int i = 0; i < test; i++) {
            int t = s.nextInt();
            int[] nums=new int[t];
            boolean flag = false;

            for (int j = 0; j < t; j++) {
              nums[j]=s.nextInt();

            }
            int sum=0;
            int x=0;
            for (int j = 0; j <t ; j++) {
                if(nums[j]==1){
                    if(sum<0){
                        System.out.println("Invalid");
                        break;
                    }
                    sum+=1;
                }
                if(nums[j]==0){
                    sum-=1;
                    if(sum<0){
                        System.out.println("Invalid");
                        break;
                    }

                }
                x++;

            }
            if(sum>=0& x==t){
                System.out.println("Valid");
            }



    }
        }
    }

