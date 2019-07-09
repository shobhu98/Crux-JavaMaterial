package com.shobhit.lecture_3;

import java.util.Scanner;

public class Number_System {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
       // int deci= s.nextInt();
        //int base=s.nextInt();
        //int y=  radixtodeci(deci,base);
        //System.out.println(y);
       //int x= deciToBin(deci);
       // System.out.println(x);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        anytoany(c,a,b);
        // int digit=s.nextInt();
     //   countDigit(num,digit);


    }
    public static int deciToBin(int deci){
        int bin=0;
        int place=1;
        while(deci>0){
            int r=deci%2;
            bin=bin+r*place;
            deci=deci/2;
            place=place*10;
        }
        return bin;
    }
    public static int deciToAny(int deci,int base){
        int bin=0;
        int place=1;
        while(deci>0){
            int r=deci%base;
            bin=bin+r*place;
            deci=deci/base;
            place=place*10;
        }
        return bin;
    }
    public static int bintodeci(int deci){
        int ans=0;

        int power=1;
        while(deci>0){
            int r=deci%10;

            ans=ans+r*power;
            power=power*2;

            deci=deci/10;

        }
        return ans;

    }
    public static int radixtodeci(int deci,int radix){
        int ans=0;

        int power=1;
        while(deci>0){
            int r=deci%10;

            ans=ans+r*power;
            power=power*radix;

            deci=deci/10;

        }
        return ans;

    }
    public static int anytoany (int value,int s_base,int t_base){
        int decimal=radixtodeci( value, s_base);
        return deciToAny(decimal,t_base);

    }
    public static void countDigit(int num,int digit){
        int s=0;
        while(num>0){
            int r =num%10;
            if (r==digit){
                s+=1;
            }
            num=num/10;
        }
        System.out.println(s);




    }
    public static void inverse(int num){
        int result=0;
        int v=num%10;
        int i=1;
         num=num/10;
         while(num>0){
             result=result+ i*(int)Math.pow(10,v-1);
         }
        System.out.println(result);


    }
}
