package stacks;

import java.util.Scanner;

public class implement_two_stacks_inarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] nums=new int[n];
        int[] d=new int[2];
        int top1=-1;
        int top2=n;
        for (int i = 0; i <2 ; i++) {
            d[i]=s.nextInt();

        }

        for (int i = 0; i <d[0] ; i++) {
            top1++;
            nums[i]=s.nextInt();


        }
        for (int i =n-1 ; i >=n-d[1] ; i--) {
            top2--;
            nums[i]=s.nextInt();

        }
        for (int i = 0; i <n ; i++) {
            System.out.print(nums[i]);

        }
        System.out.println(nums[top1]);
        System.out.println(nums[top2]);
        top1--;
        top2++;

        System.out.println("Elements in stack1 are");
        if(top1<=-1){
            System.out.println("None");
        }
        else{
            for (int i = 0; i <=top1 ; i++) {
                System.out.print(nums[i]+" ");

            }
        }

        System.out.println();
        System.out.println("Elements in stack2 are");
        if(top2>=n){
            System.out.println("None");
        }
        else{

            for (int i = n-1; i >=top2 ; i--) {
                System.out.print(nums[i]+" ");

            }
        }




    }

}
