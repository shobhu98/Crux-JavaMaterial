package Hacker_Blocks;

import java.util.Scanner;

public class Waveprint {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int[][] nums=new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                nums[i][j]=s.nextInt();

            }

        }
        waveprint(nums,m,n);

    }
    public static  void waveprint(int[][] nums,int m,int n){
        for (int i = 0; i <n ; i++) {
            if(i%2==0){
                for (int j = 0; j <m ; j++) {
                    System.out.print(nums[j][i]+", ");

                }
            }
            else if(i%2==1){
                for (int j = m-1; j >=0 ; j--) {
                    System.out.print(nums[j][i]+", ");
                }
            }

        }
        System.out.print("END");
        }

    }

